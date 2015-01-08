package iotsuite.compiler;

import iotsuite.codegenerator.CompilationUnit;
import iotsuite.codegenerator.JavaFrameworkFromST;
import iotsuite.codegenerator.SourceFileDumper;
import iotsuite.common.GlobalVariable;
import iotsuite.parser.SymbolTable;
import iotsuite.semanticmodel.DataAccess;
import iotsuite.semanticmodel.DataType;
import iotsuite.semanticmodel.Information;
import iotsuite.semanticmodel.Storage;

import java.util.HashSet;
import java.util.Set;

public class StorageCompiler {

	private Storage storageService;
	private Set<DataAccess> dataAccessList = new HashSet<DataAccess>();
	private Information queryIndex;
	private Information generatedInfo;
	private String storageServiceName;

	public StorageCompiler() {

	}

	public String getStorageServiceName() {
		return storageServiceName;
	}

	public void setStorageServiceName(String storageServiceName) {
		this.storageServiceName = storageServiceName;
	}

	public void createStorageObject() {
		// storageService = new Storage(getStorageServiceName(),
		// getAttributeSet(), getDataAccessList(), null);
		storageService = new Storage(getStorageServiceName(), getDataAccessList(), null);
	}

	// Getter and Setter of Data Access List

	public Set<DataAccess> getDataAccessList() {
		return dataAccessList;
	}

	public void addDataAccess() {
		DataAccess dataAccess = new DataAccess(getDataAccessIndex(), getGeneratedInfo());
		dataAccessList.add(dataAccess);
		SymbolTable.constructDataAccessSymblTable(getGeneratedInfo().getName(), dataAccessList);

	}

	// getter and Setter of generatedInfo

	public void addGeneratedInfo(String variableName, String variableType) {
		generatedInfo = new Information(variableName, new DataType(variableType));
	}

	public Information getGeneratedInfo() {
		return generatedInfo;
	}

	// Getter and Setter of DataAccessIndex

	public void addDataAccessIndex(String variableName, String variableType) {
		queryIndex = new Information(variableName, new DataType(variableType));
	}

	public Information getDataAccessIndex() {
		return queryIndex;
	}

	// Getter and Setter of Attribute
	/*
	 * private Set<Attribute> attributeSet = new HashSet<Attribute>();
	 * 
	 * public Set<Attribute> getAttributeSet() { return attributeSet; }
	 * 
	 * public void addAttribute(String fieldName, String fieldType) { Attribute
	 * attribute = new Attribute(fieldName, new PrimitiveType(fieldType));
	 * attributeSet.add(attribute); }
	 */

	/*
	 * The following function generates programming framework for Storage. It
	 * generates code in the following sequence.
	 * 
	 * (1) Storage's Interaction (2) Storage's ApplicationLogic (3) Storage's
	 * Factory (4) Storage window OS Implementation (5) Storage's Interface
	 */

	public void generateStorageCode() {

		// Storage Interaction with other entities
		generateStorageInteraction_StorageCompiler();

		if (GlobalVariable.activity.equals(GlobalVariable.ACTIVITY_GENERATE_DEVICEDRIVER)) {

			// Storage's ApplicationLogic
			generateStorageLogic_StorageCompiler();
			
			if(GlobalVariable.ENABLE_JAVASE_CODE_GENERATATION) {
				generateJavaSEStorageFactory_StorageCompiler();
				generateJavaSEStorageImpl_StorageCompiler(); 
				generateStorageInterface_StorageCompiler();
				
			}
			
			if (GlobalVariable.ENABLE_ANDROID_CODE_GENERATION) {
				generateAndroidStorageImpl_StorageCompiler();
				generateAndroidStorageFactory_StorageCompiler();
			}			
		}
	}

	private void generateStorageInteraction_StorageCompiler() {
		JavaFrameworkFromST generatedStorageService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedStorageService.generateStorageInteraction(storageService);
		SourceFileDumper dumpGeneratedStorageService = new SourceFileDumper();
		dumpGeneratedStorageService.dumpCompilationUnit(generatedCU);

	}

	private void generateJavaSEStorageImpl_StorageCompiler() {
		JavaFrameworkFromST generateStorageFactory = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateStorageFactory.generateJavaSEStorageImpl(storageService);
		SourceFileDumper dumpGeneratedStorageFactory = new SourceFileDumper();
		dumpGeneratedStorageFactory.dumpCompilationUnit(generatedCU);
	}
	
	private void generateAndroidStorageImpl_StorageCompiler() {
		JavaFrameworkFromST generateStorageFactory = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateStorageFactory.generateAndroidStorageImpl(storageService);
		SourceFileDumper dumpGeneratedStorageFactory = new SourceFileDumper();
		dumpGeneratedStorageFactory.dumpCompilationUnit(generatedCU);
	}

	private void generateJavaSEStorageFactory_StorageCompiler() {
		JavaFrameworkFromST generateStorageFactory = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateStorageFactory.generateJavaSEStorageFactory(storageService);
		SourceFileDumper dumpGeneratedStorageFactory = new SourceFileDumper();
		dumpGeneratedStorageFactory.dumpCompilationUnit(generatedCU);
	}
	
	
	
	private void generateAndroidStorageFactory_StorageCompiler() {
		JavaFrameworkFromST generateStorageFactory = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateStorageFactory.generateAndroidStorageFactory(storageService);
		SourceFileDumper dumpGeneratedStorageFactory = new SourceFileDumper();
		dumpGeneratedStorageFactory.dumpCompilationUnit(generatedCU);
	}

	private void generateStorageInterface_StorageCompiler() {
		JavaFrameworkFromST generateStorageInterface = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generateStorageInterface.generateJavaSEStorageInterface(storageService);
		SourceFileDumper dumpGeneratedStorageInterface = new SourceFileDumper();
		dumpGeneratedStorageInterface.dumpCompilationUnit(generatedCU);

	}

	private void generateStorageLogic_StorageCompiler() {
		JavaFrameworkFromST generatedStorageService = new JavaFrameworkFromST();
		CompilationUnit generatedCU = generatedStorageService.generateJavaSEStorageLogic(storageService);
		SourceFileDumper dumpGeneratedStorageService = new SourceFileDumper();
		dumpGeneratedStorageService.dumpCompilationUnit(generatedCU);
	}

}
