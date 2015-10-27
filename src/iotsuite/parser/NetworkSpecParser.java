// $ANTLR 3.5.1 C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g 2015-10-27 21:04:19

package iotsuite.parser;
import iotsuite.compiler.*; 
import iotsuite.semanticmodel.*;  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class NetworkSpecParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "MOBILEFLAG", 
		"WS", "','", "':'", "';'", "'description'", "'devices'", "'location'", 
		"'platform'", "'protocol'", "'resources'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int CAPITALIZED_ID=4;
	public static final int ID=5;
	public static final int MOBILEFLAG=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public NetworkSpecParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public NetworkSpecParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return NetworkSpecParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g"; }


	  //Initialize the context
	  private SymbolTable context; 



	// $ANTLR start "networkspec"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:23:1: networkspec : 'devices' ':' ( device_def )* ;
	public final void networkspec() throws RecognitionException {
		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:23:12: ( 'devices' ':' ( device_def )* )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:24:7: 'devices' ':' ( device_def )*
			{
			match(input,12,FOLLOW_12_in_networkspec58); 
			match(input,9,FOLLOW_9_in_networkspec60); 
			 context = new SymbolTable();
			      
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:27:8: ( device_def )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= CAPITALIZED_ID && LA1_0 <= ID)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:27:9: device_def
					{
					pushFollow(FOLLOW_device_def_in_networkspec78);
					device_def();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "networkspec"



	// $ANTLR start "device_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:30:1: device_def : deviceName= ( ID | CAPITALIZED_ID ) ':' 'location' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';' 'description' ':' ( description_def )* ';' ;
	public final void device_def() throws RecognitionException {
		Token deviceName=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:30:11: (deviceName= ( ID | CAPITALIZED_ID ) ':' 'location' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';' 'description' ':' ( description_def )* ';' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:31:4: deviceName= ( ID | CAPITALIZED_ID ) ':' 'location' ':' ( location_def )* 'platform' ':' ( device_type )* ';' 'resources' ':' ( abilities_def )? ';' 'protocol' ':' ( protocol_value )* ';' 'description' ':' ( description_def )* ';'
			{
			deviceName=input.LT(1);
			if ( (input.LA(1) >= CAPITALIZED_ID && input.LA(1) <= ID) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,9,FOLLOW_9_in_device_def114); 
			 
			   context.currentNetwork = new DeviceCompiler();
			   context.currentNetwork.setDeviceName((deviceName!=null?deviceName.getText():null));
			   
			match(input,13,FOLLOW_13_in_device_def129); 
			match(input,9,FOLLOW_9_in_device_def131); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:36:20: ( location_def )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CAPITALIZED_ID) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:36:21: location_def
					{
					pushFollow(FOLLOW_location_def_in_device_def134);
					location_def();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}

			match(input,14,FOLLOW_14_in_device_def143); 
			match(input,9,FOLLOW_9_in_device_def145); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:37:20: ( device_type )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CAPITALIZED_ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:37:21: device_type
					{
					pushFollow(FOLLOW_device_type_in_device_def148);
					device_type();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,10,FOLLOW_10_in_device_def152); 
			match(input,16,FOLLOW_16_in_device_def159); 
			match(input,9,FOLLOW_9_in_device_def161); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:38:21: ( abilities_def )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==CAPITALIZED_ID) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:38:22: abilities_def
					{
					pushFollow(FOLLOW_abilities_def_in_device_def164);
					abilities_def();
					state._fsp--;

					}
					break;

			}

			match(input,10,FOLLOW_10_in_device_def169); 
			match(input,15,FOLLOW_15_in_device_def175); 
			match(input,9,FOLLOW_9_in_device_def177); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:39:20: ( protocol_value )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:39:21: protocol_value
					{
					pushFollow(FOLLOW_protocol_value_in_device_def180);
					protocol_value();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,10,FOLLOW_10_in_device_def184); 
			match(input,11,FOLLOW_11_in_device_def196); 
			match(input,9,FOLLOW_9_in_device_def198); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:40:25: ( description_def )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==CAPITALIZED_ID) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:40:26: description_def
					{
					pushFollow(FOLLOW_description_def_in_device_def202);
					description_def();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			match(input,10,FOLLOW_10_in_device_def206); 
			 context.currentNetwork.addDeviceObj();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "device_def"



	// $ANTLR start "location_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:44:1: location_def : CAPITALIZED_ID ':' ID ';' ;
	public final void location_def() throws RecognitionException {
		Token CAPITALIZED_ID1=null;
		Token ID2=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:44:14: ( CAPITALIZED_ID ':' ID ';' )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:45:5: CAPITALIZED_ID ':' ID ';'
			{
			CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_location_def228); 
			match(input,9,FOLLOW_9_in_location_def230); 
			ID2=(Token)match(input,ID,FOLLOW_ID_in_location_def232); 
			match(input,10,FOLLOW_10_in_location_def234); 
			context.currentNetwork.addRegionLabel((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null));
			    context.currentNetwork.addRegionValue((ID2!=null?ID2.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "location_def"



	// $ANTLR start "device_type"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:51:1: device_type : CAPITALIZED_ID ;
	public final void device_type() throws RecognitionException {
		Token CAPITALIZED_ID3=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:51:13: ( CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:52:6: CAPITALIZED_ID
			{
			CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_device_type261); 
			context.currentNetwork.setDeviceType((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "device_type"



	// $ANTLR start "abilities_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:56:1: abilities_def : CAPITALIZED_ID ( ',' abilities_def )? ;
	public final void abilities_def() throws RecognitionException {
		Token CAPITALIZED_ID4=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:56:15: ( CAPITALIZED_ID ( ',' abilities_def )? )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:57:4: CAPITALIZED_ID ( ',' abilities_def )?
			{
			CAPITALIZED_ID4=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_abilities_def280); 
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:57:19: ( ',' abilities_def )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==8) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:57:20: ',' abilities_def
					{
					match(input,8,FOLLOW_8_in_abilities_def283); 
					pushFollow(FOLLOW_abilities_def_in_abilities_def285);
					abilities_def();
					state._fsp--;

					}
					break;

			}

			context.currentNetwork.addDeviceAbilities((CAPITALIZED_ID4!=null?CAPITALIZED_ID4.getText():null));
			  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "abilities_def"



	// $ANTLR start "protocol_value"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:62:1: protocol_value : ID ;
	public final void protocol_value() throws RecognitionException {
		Token ID5=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:62:15: ( ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:63:3: ID
			{
			ID5=(Token)match(input,ID,FOLLOW_ID_in_protocol_value302); 
			context.currentNetwork.setProtocol((ID5!=null?ID5.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "protocol_value"



	// $ANTLR start "description_def"
	// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:67:1: description_def : CAPITALIZED_ID ;
	public final void description_def() throws RecognitionException {
		Token CAPITALIZED_ID6=null;

		try {
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:67:16: ( CAPITALIZED_ID )
			// C:\\IoTSuite\\IoTSuite\\src\\iotsuite\\parser\\NetworkSpec.g:68:4: CAPITALIZED_ID
			{
			CAPITALIZED_ID6=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_description_def321); 
			context.currentNetwork.setDeviceDescription((CAPITALIZED_ID6!=null?CAPITALIZED_ID6.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "description_def"

	// Delegated rules



	public static final BitSet FOLLOW_12_in_networkspec58 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_networkspec60 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_device_def_in_networkspec78 = new BitSet(new long[]{0x0000000000000032L});
	public static final BitSet FOLLOW_set_in_device_def108 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def114 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_device_def129 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def131 = new BitSet(new long[]{0x0000000000004010L});
	public static final BitSet FOLLOW_location_def_in_device_def134 = new BitSet(new long[]{0x0000000000004010L});
	public static final BitSet FOLLOW_14_in_device_def143 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def145 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_device_type_in_device_def148 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_10_in_device_def152 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_device_def159 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def161 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_abilities_def_in_device_def164 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_device_def169 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_device_def175 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def177 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_protocol_value_in_device_def180 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_10_in_device_def184 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_device_def196 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_device_def198 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_description_def_in_device_def202 = new BitSet(new long[]{0x0000000000000410L});
	public static final BitSet FOLLOW_10_in_device_def206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_location_def228 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_location_def230 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_location_def232 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_location_def234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_device_type261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_abilities_def280 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_8_in_abilities_def283 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_abilities_def_in_abilities_def285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_protocol_value302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAPITALIZED_ID_in_description_def321 = new BitSet(new long[]{0x0000000000000002L});
}
