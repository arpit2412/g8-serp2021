// $ANTLR 3.4 CPPGrammar.g 2021-05-07 21:55:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CPPGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__145=145;
    public static final int T__146=146;
    public static final int T__147=147;
    public static final int T__148=148;
    public static final int T__149=149;
    public static final int T__150=150;
    public static final int T__151=151;
    public static final int T__152=152;
    public static final int T__153=153;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__158=158;
    public static final int T__159=159;
    public static final int T__160=160;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__167=167;
    public static final int ALPHA_NUMERIC=4;
    public static final int AND=5;
    public static final int ARGUMENT=6;
    public static final int ASSIGN=7;
    public static final int ASSIGN_OP=8;
    public static final int BASE_CLASSES=9;
    public static final int BIT_OR=10;
    public static final int BIT_OR_ELEM=11;
    public static final int BRACKETS=12;
    public static final int CALLEE=13;
    public static final int CALL_TEMPLATE_LIST=14;
    public static final int CLASS_CONTENT=15;
    public static final int CLASS_DEF=16;
    public static final int CLASS_NAME=17;
    public static final int COLON=18;
    public static final int COMMENT=19;
    public static final int CONDITION=20;
    public static final int COND_EXPR=21;
    public static final int CPPCOMMENT=22;
    public static final int CTOR_EXPR=23;
    public static final int CTOR_INITIALIZER=24;
    public static final int CTOR_LIST=25;
    public static final int CURLIES=26;
    public static final int DECIMAL_LITERAL=27;
    public static final int DESTINATION=28;
    public static final int DOT=29;
    public static final int EQ_OPERATOR=30;
    public static final int EXPR=31;
    public static final int EXPR_STATEMENT=32;
    public static final int Exponent=33;
    public static final int FIELD=34;
    public static final int FLOATING_POINT_LITERAL=35;
    public static final int FOR_EXPR=36;
    public static final int FOR_INIT=37;
    public static final int FUNCTION_CALL=38;
    public static final int FUNCTION_DEF=39;
    public static final int FUNCTION_NAME=40;
    public static final int FloatTypeSuffix=41;
    public static final int HEX_LITERAL=42;
    public static final int HexDigit=43;
    public static final int INCLUDE_DIRECTIVE=44;
    public static final int INIT=45;
    public static final int INITIALIZER_ID=46;
    public static final int INIT_DECL_LIST=47;
    public static final int ITERATION=48;
    public static final int IntegerTypeSuffix=49;
    public static final int JUMP_STATEMENT=50;
    public static final int KEYWORD=51;
    public static final int LABEL=52;
    public static final int LVAL=53;
    public static final int NAME=54;
    public static final int NAMESPACE_DEF=55;
    public static final int OCTAL_LITERAL=56;
    public static final int OR=57;
    public static final int OTHER=58;
    public static final int PARAMETER_DECL=59;
    public static final int PARAMETER_LIST=60;
    public static final int POINTER=61;
    public static final int PREPROC=62;
    public static final int QMARK=63;
    public static final int REL_OPERATOR=64;
    public static final int RETURN_TYPE=65;
    public static final int RVAL=66;
    public static final int SELECTION=67;
    public static final int SIMPLE_DECL=68;
    public static final int SOURCE_FILE=69;
    public static final int SQUARES=70;
    public static final int STATEMENTS=71;
    public static final int STRING=72;
    public static final int TEMPLATE_DECL_SPECIFIER=73;
    public static final int TYPE=74;
    public static final int TYPE_DEF=75;
    public static final int TYPE_NAME=76;
    public static final int TYPE_SUFFIX=77;
    public static final int UNARY_EXPR=78;
    public static final int UNARY_OPERATOR=79;
    public static final int USING_DIRECTIVE=80;
    public static final int VAR_DECL=81;
    public static final int WHITESPACE=82;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CPPGrammarLexer() {} 
    public CPPGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CPPGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "CPPGrammar.g"; }

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:7:7: ( '!' )
            // CPPGrammar.g:7:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:8:7: ( '!=' )
            // CPPGrammar.g:8:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:9:7: ( '\"' )
            // CPPGrammar.g:9:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:10:7: ( '#include' )
            // CPPGrammar.g:10:9: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:11:7: ( '%' )
            // CPPGrammar.g:11:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:12:7: ( '%=' )
            // CPPGrammar.g:12:9: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:13:7: ( '&&' )
            // CPPGrammar.g:13:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:14:7: ( '&' )
            // CPPGrammar.g:14:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:15:7: ( '&=' )
            // CPPGrammar.g:15:9: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:16:7: ( '(' )
            // CPPGrammar.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:17:7: ( ')' )
            // CPPGrammar.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:18:7: ( '*' )
            // CPPGrammar.g:18:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:19:7: ( '*=' )
            // CPPGrammar.g:19:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:20:7: ( '+' )
            // CPPGrammar.g:20:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:21:7: ( '++' )
            // CPPGrammar.g:21:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:22:7: ( '+=' )
            // CPPGrammar.g:22:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:23:7: ( ',' )
            // CPPGrammar.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:24:8: ( '-' )
            // CPPGrammar.g:24:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:25:8: ( '--' )
            // CPPGrammar.g:25:10: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:26:8: ( '-=' )
            // CPPGrammar.g:26:10: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:27:8: ( '->' )
            // CPPGrammar.g:27:10: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:28:8: ( '->*' )
            // CPPGrammar.g:28:10: '->*'
            {
            match("->*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:29:8: ( '/' )
            // CPPGrammar.g:29:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:30:8: ( '/=' )
            // CPPGrammar.g:30:10: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:31:8: ( '::' )
            // CPPGrammar.g:31:10: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:32:8: ( ';' )
            // CPPGrammar.g:32:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:33:8: ( '<' )
            // CPPGrammar.g:33:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:34:8: ( '<<' )
            // CPPGrammar.g:34:10: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:35:8: ( '<<=' )
            // CPPGrammar.g:35:10: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:36:8: ( '<=' )
            // CPPGrammar.g:36:10: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:37:8: ( '=' )
            // CPPGrammar.g:37:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:38:8: ( '==' )
            // CPPGrammar.g:38:10: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:39:8: ( '>' )
            // CPPGrammar.g:39:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:40:8: ( '>=' )
            // CPPGrammar.g:40:10: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:41:8: ( '>>' )
            // CPPGrammar.g:41:10: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:42:8: ( '>>=' )
            // CPPGrammar.g:42:10: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:43:8: ( '[' )
            // CPPGrammar.g:43:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:44:8: ( ']' )
            // CPPGrammar.g:44:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:45:8: ( '^' )
            // CPPGrammar.g:45:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:46:8: ( '^=' )
            // CPPGrammar.g:46:10: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:47:8: ( 'auto' )
            // CPPGrammar.g:47:10: 'auto'
            {
            match("auto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:48:8: ( 'break' )
            // CPPGrammar.g:48:10: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:49:8: ( 'case' )
            // CPPGrammar.g:49:10: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:50:8: ( 'catch' )
            // CPPGrammar.g:50:10: 'catch'
            {
            match("catch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:51:8: ( 'class' )
            // CPPGrammar.g:51:10: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:52:8: ( 'const' )
            // CPPGrammar.g:52:10: 'const'
            {
            match("const"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:53:8: ( 'continue' )
            // CPPGrammar.g:53:10: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:54:8: ( 'delete' )
            // CPPGrammar.g:54:10: 'delete'
            {
            match("delete"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:55:8: ( 'do' )
            // CPPGrammar.g:55:10: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:56:8: ( 'else' )
            // CPPGrammar.g:56:10: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:57:8: ( 'enum' )
            // CPPGrammar.g:57:10: 'enum'
            {
            match("enum"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:58:8: ( 'explicit' )
            // CPPGrammar.g:58:10: 'explicit'
            {
            match("explicit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:59:8: ( 'for' )
            // CPPGrammar.g:59:10: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:60:8: ( 'friend' )
            // CPPGrammar.g:60:10: 'friend'
            {
            match("friend"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:61:8: ( 'goto' )
            // CPPGrammar.g:61:10: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:62:8: ( 'if' )
            // CPPGrammar.g:62:10: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:63:8: ( 'inline' )
            // CPPGrammar.g:63:10: 'inline'
            {
            match("inline"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:64:8: ( 'namespace' )
            // CPPGrammar.g:64:10: 'namespace'
            {
            match("namespace"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:65:8: ( 'new' )
            // CPPGrammar.g:65:10: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:66:8: ( 'operator' )
            // CPPGrammar.g:66:10: 'operator'
            {
            match("operator"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:67:8: ( 'private' )
            // CPPGrammar.g:67:10: 'private'
            {
            match("private"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:68:8: ( 'protected' )
            // CPPGrammar.g:68:10: 'protected'
            {
            match("protected"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:69:8: ( 'public' )
            // CPPGrammar.g:69:10: 'public'
            {
            match("public"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:70:8: ( 'register' )
            // CPPGrammar.g:70:10: 'register'
            {
            match("register"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:71:8: ( 'return' )
            // CPPGrammar.g:71:10: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:72:8: ( 'signed' )
            // CPPGrammar.g:72:10: 'signed'
            {
            match("signed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:73:8: ( 'static' )
            // CPPGrammar.g:73:10: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:74:8: ( 'struct' )
            // CPPGrammar.g:74:10: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:75:8: ( 'switch' )
            // CPPGrammar.g:75:10: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:76:8: ( 'template' )
            // CPPGrammar.g:76:10: 'template'
            {
            match("template"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:77:8: ( 'throw' )
            // CPPGrammar.g:77:10: 'throw'
            {
            match("throw"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:78:8: ( 'try' )
            // CPPGrammar.g:78:10: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:79:8: ( 'typedef' )
            // CPPGrammar.g:79:10: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:80:8: ( 'union' )
            // CPPGrammar.g:80:10: 'union'
            {
            match("union"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:81:8: ( 'unsigned' )
            // CPPGrammar.g:81:10: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:82:8: ( 'using' )
            // CPPGrammar.g:82:10: 'using'
            {
            match("using"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:83:8: ( 'virtual' )
            // CPPGrammar.g:83:10: 'virtual'
            {
            match("virtual"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:84:8: ( 'volatile' )
            // CPPGrammar.g:84:10: 'volatile'
            {
            match("volatile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:85:8: ( 'while' )
            // CPPGrammar.g:85:10: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:86:8: ( '{' )
            // CPPGrammar.g:86:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:87:8: ( '|' )
            // CPPGrammar.g:87:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:88:8: ( '|=' )
            // CPPGrammar.g:88:10: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:89:8: ( '||' )
            // CPPGrammar.g:89:10: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:90:8: ( '}' )
            // CPPGrammar.g:90:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:91:8: ( '~' )
            // CPPGrammar.g:91:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:430:4: ( '.' )
            // CPPGrammar.g:430:6: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "QMARK"
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:431:6: ( '?' )
            // CPPGrammar.g:431:8: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QMARK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:431:6: ( ':' )
            // CPPGrammar.g:431:8: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "ALPHA_NUMERIC"
    public final void mALPHA_NUMERIC() throws RecognitionException {
        try {
            int _type = ALPHA_NUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:433:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '~' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // CPPGrammar.g:433:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '~' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // CPPGrammar.g:433:53: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CPPGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALPHA_NUMERIC"

    // $ANTLR start "CPPCOMMENT"
    public final void mCPPCOMMENT() throws RecognitionException {
        try {
            int _type = CPPCOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:439:5: ( '//' ( options {greedy=false; } : . )* '\\n' )
            // CPPGrammar.g:439:7: '//' ( options {greedy=false; } : . )* '\\n'
            {
            match("//"); 



            // CPPGrammar.g:439:12: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\n') ) {
                    alt2=2;
                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // CPPGrammar.g:439:40: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match('\n'); 

            _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CPPCOMMENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:442:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // CPPGrammar.g:442:17: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // CPPGrammar.g:442:23: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1 >= '\u0000' && LA3_1 <= '.')||(LA3_1 >= '0' && LA3_1 <= '\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= ')')||(LA3_0 >= '+' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // CPPGrammar.g:442:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match("*/"); 



             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:446:7: ( ( '\\'' ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )* '\\'' ) | ( '\"' ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )* '\"' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\'') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\"') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // CPPGrammar.g:446:9: ( '\\'' ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )* '\\'' )
                    {
                    // CPPGrammar.g:446:9: ( '\\'' ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )* '\\'' )
                    // CPPGrammar.g:446:10: '\\'' ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 

                    // CPPGrammar.g:446:15: ( ( '\\\\' . ) |~ ( '\\\\' | '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // CPPGrammar.g:446:17: ( '\\\\' . )
                    	    {
                    	    // CPPGrammar.g:446:17: ( '\\\\' . )
                    	    // CPPGrammar.g:446:18: '\\\\' .
                    	    {
                    	    match('\\'); 

                    	    matchAny(); 

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // CPPGrammar.g:446:29: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:447:10: ( '\"' ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )* '\"' )
                    {
                    // CPPGrammar.g:447:10: ( '\"' ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )* '\"' )
                    // CPPGrammar.g:447:11: '\"' ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 

                    // CPPGrammar.g:447:16: ( ( '\\\\' . ) |~ ( '\\\\' | '\"' ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // CPPGrammar.g:447:18: ( '\\\\' . )
                    	    {
                    	    // CPPGrammar.g:447:18: ( '\\\\' . )
                    	    // CPPGrammar.g:447:19: '\\\\' .
                    	    {
                    	    match('\\'); 

                    	    matchAny(); 

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // CPPGrammar.g:447:30: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match('\"'); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "PREPROC"
    public final void mPREPROC() throws RecognitionException {
        try {
            int _type = PREPROC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:450:5: ( '#' ( options {greedy=false; } : . )* ~ ( '\\\\' ) '\\n' )
            // CPPGrammar.g:450:7: '#' ( options {greedy=false; } : . )* ~ ( '\\\\' ) '\\n'
            {
            match('#'); 

            // CPPGrammar.g:450:12: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='\n') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '\t')||(LA7_1 >= '\u000B' && LA7_1 <= '\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0=='\\') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // CPPGrammar.g:450:40: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('\n'); 

            _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREPROC"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            int _type = HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:453:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
            // CPPGrammar.g:453:15: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // CPPGrammar.g:453:29: ( HexDigit )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'F')||(LA8_0 >= 'a' && LA8_0 <= 'f')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // CPPGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            // CPPGrammar.g:453:39: ( IntegerTypeSuffix )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='L'||LA9_0=='U'||LA9_0=='l'||LA9_0=='u') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // CPPGrammar.g:453:39: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:454:17: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
            // CPPGrammar.g:454:19: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
            {
            // CPPGrammar.g:454:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='0') ) {
                alt11=1;
            }
            else if ( ((LA11_0 >= '1' && LA11_0 <= '9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // CPPGrammar.g:454:20: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:454:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 

                    // CPPGrammar.g:454:35: ( '0' .. '9' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            // CPPGrammar.g:454:46: ( IntegerTypeSuffix )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='L'||LA12_0=='U'||LA12_0=='l'||LA12_0=='u') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // CPPGrammar.g:454:46: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:455:15: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
            // CPPGrammar.g:455:17: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
            {
            match('0'); 

            // CPPGrammar.g:455:21: ( '0' .. '7' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '0' && LA13_0 <= '7')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // CPPGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            // CPPGrammar.g:455:33: ( IntegerTypeSuffix )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='L'||LA14_0=='U'||LA14_0=='l'||LA14_0=='u') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // CPPGrammar.g:455:33: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // CPPGrammar.g:459:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // CPPGrammar.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "IntegerTypeSuffix"
    public final void mIntegerTypeSuffix() throws RecognitionException {
        try {
            // CPPGrammar.g:463:2: ( ( 'u' | 'U' )? ( 'l' | 'L' ) | ( 'u' | 'U' ) ( 'l' | 'L' )? )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='U'||LA17_0=='u') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='L'||LA17_1=='l') ) {
                    alt17=1;
                }
                else {
                    alt17=2;
                }
            }
            else if ( (LA17_0=='L'||LA17_0=='l') ) {
                alt17=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // CPPGrammar.g:463:4: ( 'u' | 'U' )? ( 'l' | 'L' )
                    {
                    // CPPGrammar.g:463:4: ( 'u' | 'U' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='U'||LA15_0=='u') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // CPPGrammar.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:464:4: ( 'u' | 'U' ) ( 'l' | 'L' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // CPPGrammar.g:464:15: ( 'l' | 'L' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='L'||LA16_0=='l') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // CPPGrammar.g:
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntegerTypeSuffix"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:467:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix )
            int alt29=4;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // CPPGrammar.g:467:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // CPPGrammar.g:467:9: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    match('.'); 

                    // CPPGrammar.g:467:25: ( '0' .. '9' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    // CPPGrammar.g:467:37: ( Exponent )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // CPPGrammar.g:467:37: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    // CPPGrammar.g:467:47: ( FloatTypeSuffix )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='D'||LA21_0=='F'||LA21_0=='d'||LA21_0=='f') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // CPPGrammar.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:468:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 

                    // CPPGrammar.g:468:13: ( '0' .. '9' )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    // CPPGrammar.g:468:25: ( Exponent )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='E'||LA23_0=='e') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // CPPGrammar.g:468:25: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    // CPPGrammar.g:468:35: ( FloatTypeSuffix )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='D'||LA24_0=='F'||LA24_0=='d'||LA24_0=='f') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // CPPGrammar.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // CPPGrammar.g:469:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                    {
                    // CPPGrammar.g:469:9: ( '0' .. '9' )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0 >= '0' && LA25_0 <= '9')) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    mExponent(); 


                    // CPPGrammar.g:469:30: ( FloatTypeSuffix )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0=='D'||LA26_0=='F'||LA26_0=='d'||LA26_0=='f') ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // CPPGrammar.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // CPPGrammar.g:470:9: ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix
                    {
                    // CPPGrammar.g:470:9: ( '0' .. '9' )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0 >= '0' && LA27_0 <= '9')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    // CPPGrammar.g:470:21: ( Exponent )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='E'||LA28_0=='e') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // CPPGrammar.g:470:21: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    mFloatTypeSuffix(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // CPPGrammar.g:475:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // CPPGrammar.g:475:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // CPPGrammar.g:475:22: ( '+' | '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='+'||LA30_0=='-') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // CPPGrammar.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // CPPGrammar.g:475:33: ( '0' .. '9' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0 >= '0' && LA31_0 <= '9')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // CPPGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatTypeSuffix"
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // CPPGrammar.g:478:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // CPPGrammar.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FloatTypeSuffix"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:479:11: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // CPPGrammar.g:479:13: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // CPPGrammar.g:479:13: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0 >= '\t' && LA32_0 <= '\n')||LA32_0=='\r'||LA32_0==' ') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // CPPGrammar.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "OTHER"
    public final void mOTHER() throws RecognitionException {
        try {
            int _type = OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CPPGrammar.g:480:7: ( . )
            // CPPGrammar.g:480:9: .
            {
            matchAny(); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OTHER"

    public void mTokens() throws RecognitionException {
        // CPPGrammar.g:1:8: ( T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | DOT | QMARK | COLON | ALPHA_NUMERIC | CPPCOMMENT | COMMENT | STRING | PREPROC | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WHITESPACE | OTHER )
        int alt33=99;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // CPPGrammar.g:1:10: T__83
                {
                mT__83(); 


                }
                break;
            case 2 :
                // CPPGrammar.g:1:16: T__84
                {
                mT__84(); 


                }
                break;
            case 3 :
                // CPPGrammar.g:1:22: T__85
                {
                mT__85(); 


                }
                break;
            case 4 :
                // CPPGrammar.g:1:28: T__86
                {
                mT__86(); 


                }
                break;
            case 5 :
                // CPPGrammar.g:1:34: T__87
                {
                mT__87(); 


                }
                break;
            case 6 :
                // CPPGrammar.g:1:40: T__88
                {
                mT__88(); 


                }
                break;
            case 7 :
                // CPPGrammar.g:1:46: T__89
                {
                mT__89(); 


                }
                break;
            case 8 :
                // CPPGrammar.g:1:52: T__90
                {
                mT__90(); 


                }
                break;
            case 9 :
                // CPPGrammar.g:1:58: T__91
                {
                mT__91(); 


                }
                break;
            case 10 :
                // CPPGrammar.g:1:64: T__92
                {
                mT__92(); 


                }
                break;
            case 11 :
                // CPPGrammar.g:1:70: T__93
                {
                mT__93(); 


                }
                break;
            case 12 :
                // CPPGrammar.g:1:76: T__94
                {
                mT__94(); 


                }
                break;
            case 13 :
                // CPPGrammar.g:1:82: T__95
                {
                mT__95(); 


                }
                break;
            case 14 :
                // CPPGrammar.g:1:88: T__96
                {
                mT__96(); 


                }
                break;
            case 15 :
                // CPPGrammar.g:1:94: T__97
                {
                mT__97(); 


                }
                break;
            case 16 :
                // CPPGrammar.g:1:100: T__98
                {
                mT__98(); 


                }
                break;
            case 17 :
                // CPPGrammar.g:1:106: T__99
                {
                mT__99(); 


                }
                break;
            case 18 :
                // CPPGrammar.g:1:112: T__100
                {
                mT__100(); 


                }
                break;
            case 19 :
                // CPPGrammar.g:1:119: T__101
                {
                mT__101(); 


                }
                break;
            case 20 :
                // CPPGrammar.g:1:126: T__102
                {
                mT__102(); 


                }
                break;
            case 21 :
                // CPPGrammar.g:1:133: T__103
                {
                mT__103(); 


                }
                break;
            case 22 :
                // CPPGrammar.g:1:140: T__104
                {
                mT__104(); 


                }
                break;
            case 23 :
                // CPPGrammar.g:1:147: T__105
                {
                mT__105(); 


                }
                break;
            case 24 :
                // CPPGrammar.g:1:154: T__106
                {
                mT__106(); 


                }
                break;
            case 25 :
                // CPPGrammar.g:1:161: T__107
                {
                mT__107(); 


                }
                break;
            case 26 :
                // CPPGrammar.g:1:168: T__108
                {
                mT__108(); 


                }
                break;
            case 27 :
                // CPPGrammar.g:1:175: T__109
                {
                mT__109(); 


                }
                break;
            case 28 :
                // CPPGrammar.g:1:182: T__110
                {
                mT__110(); 


                }
                break;
            case 29 :
                // CPPGrammar.g:1:189: T__111
                {
                mT__111(); 


                }
                break;
            case 30 :
                // CPPGrammar.g:1:196: T__112
                {
                mT__112(); 


                }
                break;
            case 31 :
                // CPPGrammar.g:1:203: T__113
                {
                mT__113(); 


                }
                break;
            case 32 :
                // CPPGrammar.g:1:210: T__114
                {
                mT__114(); 


                }
                break;
            case 33 :
                // CPPGrammar.g:1:217: T__115
                {
                mT__115(); 


                }
                break;
            case 34 :
                // CPPGrammar.g:1:224: T__116
                {
                mT__116(); 


                }
                break;
            case 35 :
                // CPPGrammar.g:1:231: T__117
                {
                mT__117(); 


                }
                break;
            case 36 :
                // CPPGrammar.g:1:238: T__118
                {
                mT__118(); 


                }
                break;
            case 37 :
                // CPPGrammar.g:1:245: T__119
                {
                mT__119(); 


                }
                break;
            case 38 :
                // CPPGrammar.g:1:252: T__120
                {
                mT__120(); 


                }
                break;
            case 39 :
                // CPPGrammar.g:1:259: T__121
                {
                mT__121(); 


                }
                break;
            case 40 :
                // CPPGrammar.g:1:266: T__122
                {
                mT__122(); 


                }
                break;
            case 41 :
                // CPPGrammar.g:1:273: T__123
                {
                mT__123(); 


                }
                break;
            case 42 :
                // CPPGrammar.g:1:280: T__124
                {
                mT__124(); 


                }
                break;
            case 43 :
                // CPPGrammar.g:1:287: T__125
                {
                mT__125(); 


                }
                break;
            case 44 :
                // CPPGrammar.g:1:294: T__126
                {
                mT__126(); 


                }
                break;
            case 45 :
                // CPPGrammar.g:1:301: T__127
                {
                mT__127(); 


                }
                break;
            case 46 :
                // CPPGrammar.g:1:308: T__128
                {
                mT__128(); 


                }
                break;
            case 47 :
                // CPPGrammar.g:1:315: T__129
                {
                mT__129(); 


                }
                break;
            case 48 :
                // CPPGrammar.g:1:322: T__130
                {
                mT__130(); 


                }
                break;
            case 49 :
                // CPPGrammar.g:1:329: T__131
                {
                mT__131(); 


                }
                break;
            case 50 :
                // CPPGrammar.g:1:336: T__132
                {
                mT__132(); 


                }
                break;
            case 51 :
                // CPPGrammar.g:1:343: T__133
                {
                mT__133(); 


                }
                break;
            case 52 :
                // CPPGrammar.g:1:350: T__134
                {
                mT__134(); 


                }
                break;
            case 53 :
                // CPPGrammar.g:1:357: T__135
                {
                mT__135(); 


                }
                break;
            case 54 :
                // CPPGrammar.g:1:364: T__136
                {
                mT__136(); 


                }
                break;
            case 55 :
                // CPPGrammar.g:1:371: T__137
                {
                mT__137(); 


                }
                break;
            case 56 :
                // CPPGrammar.g:1:378: T__138
                {
                mT__138(); 


                }
                break;
            case 57 :
                // CPPGrammar.g:1:385: T__139
                {
                mT__139(); 


                }
                break;
            case 58 :
                // CPPGrammar.g:1:392: T__140
                {
                mT__140(); 


                }
                break;
            case 59 :
                // CPPGrammar.g:1:399: T__141
                {
                mT__141(); 


                }
                break;
            case 60 :
                // CPPGrammar.g:1:406: T__142
                {
                mT__142(); 


                }
                break;
            case 61 :
                // CPPGrammar.g:1:413: T__143
                {
                mT__143(); 


                }
                break;
            case 62 :
                // CPPGrammar.g:1:420: T__144
                {
                mT__144(); 


                }
                break;
            case 63 :
                // CPPGrammar.g:1:427: T__145
                {
                mT__145(); 


                }
                break;
            case 64 :
                // CPPGrammar.g:1:434: T__146
                {
                mT__146(); 


                }
                break;
            case 65 :
                // CPPGrammar.g:1:441: T__147
                {
                mT__147(); 


                }
                break;
            case 66 :
                // CPPGrammar.g:1:448: T__148
                {
                mT__148(); 


                }
                break;
            case 67 :
                // CPPGrammar.g:1:455: T__149
                {
                mT__149(); 


                }
                break;
            case 68 :
                // CPPGrammar.g:1:462: T__150
                {
                mT__150(); 


                }
                break;
            case 69 :
                // CPPGrammar.g:1:469: T__151
                {
                mT__151(); 


                }
                break;
            case 70 :
                // CPPGrammar.g:1:476: T__152
                {
                mT__152(); 


                }
                break;
            case 71 :
                // CPPGrammar.g:1:483: T__153
                {
                mT__153(); 


                }
                break;
            case 72 :
                // CPPGrammar.g:1:490: T__154
                {
                mT__154(); 


                }
                break;
            case 73 :
                // CPPGrammar.g:1:497: T__155
                {
                mT__155(); 


                }
                break;
            case 74 :
                // CPPGrammar.g:1:504: T__156
                {
                mT__156(); 


                }
                break;
            case 75 :
                // CPPGrammar.g:1:511: T__157
                {
                mT__157(); 


                }
                break;
            case 76 :
                // CPPGrammar.g:1:518: T__158
                {
                mT__158(); 


                }
                break;
            case 77 :
                // CPPGrammar.g:1:525: T__159
                {
                mT__159(); 


                }
                break;
            case 78 :
                // CPPGrammar.g:1:532: T__160
                {
                mT__160(); 


                }
                break;
            case 79 :
                // CPPGrammar.g:1:539: T__161
                {
                mT__161(); 


                }
                break;
            case 80 :
                // CPPGrammar.g:1:546: T__162
                {
                mT__162(); 


                }
                break;
            case 81 :
                // CPPGrammar.g:1:553: T__163
                {
                mT__163(); 


                }
                break;
            case 82 :
                // CPPGrammar.g:1:560: T__164
                {
                mT__164(); 


                }
                break;
            case 83 :
                // CPPGrammar.g:1:567: T__165
                {
                mT__165(); 


                }
                break;
            case 84 :
                // CPPGrammar.g:1:574: T__166
                {
                mT__166(); 


                }
                break;
            case 85 :
                // CPPGrammar.g:1:581: T__167
                {
                mT__167(); 


                }
                break;
            case 86 :
                // CPPGrammar.g:1:588: DOT
                {
                mDOT(); 


                }
                break;
            case 87 :
                // CPPGrammar.g:1:592: QMARK
                {
                mQMARK(); 


                }
                break;
            case 88 :
                // CPPGrammar.g:1:598: COLON
                {
                mCOLON(); 


                }
                break;
            case 89 :
                // CPPGrammar.g:1:604: ALPHA_NUMERIC
                {
                mALPHA_NUMERIC(); 


                }
                break;
            case 90 :
                // CPPGrammar.g:1:618: CPPCOMMENT
                {
                mCPPCOMMENT(); 


                }
                break;
            case 91 :
                // CPPGrammar.g:1:629: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 92 :
                // CPPGrammar.g:1:637: STRING
                {
                mSTRING(); 


                }
                break;
            case 93 :
                // CPPGrammar.g:1:644: PREPROC
                {
                mPREPROC(); 


                }
                break;
            case 94 :
                // CPPGrammar.g:1:652: HEX_LITERAL
                {
                mHEX_LITERAL(); 


                }
                break;
            case 95 :
                // CPPGrammar.g:1:664: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 


                }
                break;
            case 96 :
                // CPPGrammar.g:1:680: OCTAL_LITERAL
                {
                mOCTAL_LITERAL(); 


                }
                break;
            case 97 :
                // CPPGrammar.g:1:694: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 


                }
                break;
            case 98 :
                // CPPGrammar.g:1:717: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 99 :
                // CPPGrammar.g:1:728: OTHER
                {
                mOTHER(); 


                }
                break;

        }

    }


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA29_eotS =
        "\7\uffff\1\10\2\uffff";
    static final String DFA29_eofS =
        "\12\uffff";
    static final String DFA29_minS =
        "\2\56\2\uffff\1\53\1\uffff\2\60\2\uffff";
    static final String DFA29_maxS =
        "\1\71\1\146\2\uffff\1\71\1\uffff\1\71\1\146\2\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\1\1\1\uffff\1\4\2\uffff\2\3";
    static final String DFA29_specialS =
        "\12\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
            "",
            "",
            "\1\6\1\uffff\1\6\2\uffff\12\7",
            "",
            "\12\7",
            "\12\7\12\uffff\1\11\1\uffff\1\11\35\uffff\1\11\1\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "466:1: FLOATING_POINT_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix );";
        }
    }
    static final String DFA33_eotS =
        "\1\uffff\1\63\1\64\1\61\1\71\1\74\2\uffff\1\100\1\103\1\uffff\1"+
        "\110\1\114\1\116\1\uffff\1\122\1\124\1\127\2\uffff\1\133\21\135"+
        "\1\uffff\1\u0081\1\uffff\1\u0083\1\u0084\2\uffff\1\61\2\u0088\27"+
        "\uffff\1\u008e\10\uffff\1\u0090\5\uffff\1\u0092\5\uffff\1\135\1"+
        "\uffff\5\135\1\u009a\6\135\1\u00a1\23\135\13\uffff\1\u00b9\1\u0088"+
        "\10\uffff\7\135\1\uffff\3\135\1\u00c6\2\135\1\uffff\2\135\1\u00cb"+
        "\14\135\1\u00d8\7\135\2\uffff\1\u00e1\1\135\1\u00e3\5\135\1\u00e9"+
        "\1\u00ea\1\135\1\uffff\1\135\1\u00ed\2\135\1\uffff\14\135\1\uffff"+
        "\7\135\2\uffff\1\u0104\1\uffff\1\u0105\1\u0106\1\u0107\2\135\2\uffff"+
        "\2\135\1\uffff\15\135\1\u0119\1\135\1\u011b\1\135\1\u011d\2\135"+
        "\1\u0120\5\uffff\1\135\1\u0123\1\135\1\u0125\1\u0126\4\135\1\u012b"+
        "\1\135\1\u012d\1\u012e\1\u012f\1\u0130\1\u0131\1\135\1\uffff\1\135"+
        "\1\uffff\1\135\1\uffff\2\135\2\uffff\1\135\1\uffff\1\135\2\uffff"+
        "\2\135\1\u013c\1\135\1\uffff\1\135\5\uffff\1\135\1\u0140\1\135\1"+
        "\u0142\1\135\1\u0144\1\u0145\1\u0146\1\135\1\u0148\1\uffff\1\135"+
        "\1\u014a\1\u014b\1\uffff\1\u014c\1\uffff\1\u014d\3\uffff\1\u014e"+
        "\1\uffff\1\u014f\6\uffff";
    static final String DFA33_eofS =
        "\u0150\uffff";
    static final String DFA33_minS =
        "\1\0\1\75\2\0\1\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\52\1\72"+
        "\1\uffff\1\74\2\75\2\uffff\1\75\1\165\1\162\1\141\1\145\1\154\2"+
        "\157\1\146\1\141\1\160\1\162\1\145\1\151\1\145\1\156\1\151\1\150"+
        "\1\uffff\1\75\1\uffff\2\60\2\uffff\1\0\2\56\6\uffff\1\0\20\uffff"+
        "\1\52\10\uffff\1\75\5\uffff\1\75\5\uffff\1\164\1\uffff\1\145\1\163"+
        "\1\141\1\156\1\154\1\60\1\163\1\165\1\160\1\162\1\151\1\164\1\60"+
        "\1\154\1\155\1\167\1\145\1\151\1\142\2\147\1\141\1\151\1\155\1\162"+
        "\1\171\1\160\2\151\1\162\1\154\1\151\13\uffff\2\56\1\uffff\1\0\6"+
        "\uffff\1\157\1\141\1\145\1\143\2\163\1\145\1\uffff\1\145\1\155\1"+
        "\154\1\60\1\145\1\157\1\uffff\1\151\1\145\1\60\1\162\1\166\1\164"+
        "\1\154\1\151\1\165\1\156\1\164\1\165\1\164\1\160\1\157\1\60\1\145"+
        "\1\157\1\151\1\156\1\164\1\141\1\154\1\uffff\1\0\1\60\1\153\1\60"+
        "\1\150\1\163\1\164\1\151\1\164\2\60\1\151\1\uffff\1\156\1\60\1\156"+
        "\1\163\1\uffff\2\141\1\145\1\151\1\163\1\162\1\145\1\151\2\143\1"+
        "\154\1\167\1\uffff\1\144\1\156\2\147\1\165\1\164\1\145\1\0\1\uffff"+
        "\1\60\1\uffff\3\60\1\156\1\145\2\uffff\1\143\1\144\1\uffff\1\145"+
        "\1\160\2\164\2\143\1\164\1\156\1\144\1\143\1\164\1\150\1\141\1\60"+
        "\1\145\1\60\1\156\1\60\1\141\1\151\1\60\1\0\4\uffff\1\165\1\60\1"+
        "\151\2\60\1\141\1\157\1\145\1\164\1\60\1\145\5\60\1\164\1\uffff"+
        "\1\146\1\uffff\1\145\1\uffff\2\154\1\uffff\1\0\1\145\1\uffff\1\164"+
        "\2\uffff\1\143\1\162\1\60\1\145\1\uffff\1\162\5\uffff\1\145\1\60"+
        "\1\144\1\60\1\145\1\0\2\60\1\145\1\60\1\uffff\1\144\2\60\1\uffff"+
        "\1\60\1\uffff\1\60\3\uffff\1\60\1\uffff\1\60\6\uffff";
    static final String DFA33_maxS =
        "\1\uffff\1\75\2\uffff\2\75\2\uffff\2\75\1\uffff\1\76\1\75\1\72\1"+
        "\uffff\2\75\1\76\2\uffff\1\75\1\165\1\162\2\157\1\170\1\162\1\157"+
        "\1\156\1\145\1\160\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\uffff"+
        "\1\174\1\uffff\1\172\1\71\2\uffff\1\uffff\1\170\1\146\6\uffff\1"+
        "\uffff\20\uffff\1\52\10\uffff\1\75\5\uffff\1\75\5\uffff\1\164\1"+
        "\uffff\1\145\1\164\1\141\1\156\1\154\1\172\1\163\1\165\1\160\1\162"+
        "\1\151\1\164\1\172\1\154\1\155\1\167\1\145\1\157\1\142\1\164\1\147"+
        "\1\162\1\151\1\155\1\162\1\171\1\160\1\163\1\151\1\162\1\154\1\151"+
        "\13\uffff\2\146\1\uffff\1\uffff\6\uffff\1\157\1\141\1\145\1\143"+
        "\1\163\1\164\1\145\1\uffff\1\145\1\155\1\154\1\172\1\145\1\157\1"+
        "\uffff\1\151\1\145\1\172\1\162\1\166\1\164\1\154\1\151\1\165\1\156"+
        "\1\164\1\165\1\164\1\160\1\157\1\172\1\145\1\157\1\151\1\156\1\164"+
        "\1\141\1\154\1\uffff\1\uffff\1\172\1\153\1\172\1\150\1\163\1\164"+
        "\1\151\1\164\2\172\1\151\1\uffff\1\156\1\172\1\156\1\163\1\uffff"+
        "\2\141\1\145\1\151\1\163\1\162\1\145\1\151\2\143\1\154\1\167\1\uffff"+
        "\1\144\1\156\2\147\1\165\1\164\1\145\1\uffff\1\uffff\1\172\1\uffff"+
        "\3\172\1\156\1\145\2\uffff\1\143\1\144\1\uffff\1\145\1\160\2\164"+
        "\2\143\1\164\1\156\1\144\1\143\1\164\1\150\1\141\1\172\1\145\1\172"+
        "\1\156\1\172\1\141\1\151\1\172\1\uffff\4\uffff\1\165\1\172\1\151"+
        "\2\172\1\141\1\157\1\145\1\164\1\172\1\145\5\172\1\164\1\uffff\1"+
        "\146\1\uffff\1\145\1\uffff\2\154\1\uffff\1\uffff\1\145\1\uffff\1"+
        "\164\2\uffff\1\143\1\162\1\172\1\145\1\uffff\1\162\5\uffff\1\145"+
        "\1\172\1\144\1\172\1\145\1\uffff\2\172\1\145\1\172\1\uffff\1\144"+
        "\2\172\1\uffff\1\172\1\uffff\1\172\3\uffff\1\172\1\uffff\1\172\6"+
        "\uffff";
    static final String DFA33_acceptS =
        "\6\uffff\1\12\1\13\2\uffff\1\21\3\uffff\1\32\3\uffff\1\45\1\46\22"+
        "\uffff\1\120\1\uffff\1\124\2\uffff\1\127\1\131\3\uffff\1\142\1\143"+
        "\1\2\1\1\1\3\1\134\1\uffff\1\135\1\6\1\5\1\7\1\11\1\10\1\12\1\13"+
        "\1\15\1\14\1\17\1\20\1\16\1\21\1\23\1\24\1\uffff\1\22\1\30\1\132"+
        "\1\133\1\27\1\31\1\130\1\32\1\uffff\1\36\1\33\1\40\1\37\1\42\1\uffff"+
        "\1\41\1\45\1\46\1\50\1\47\1\uffff\1\131\40\uffff\1\120\1\122\1\123"+
        "\1\121\1\124\1\125\1\126\1\141\1\127\1\136\1\137\2\uffff\1\142\1"+
        "\uffff\1\26\1\25\1\35\1\34\1\44\1\43\7\uffff\1\61\6\uffff\1\70\27"+
        "\uffff\1\140\14\uffff\1\65\4\uffff\1\73\14\uffff\1\110\10\uffff"+
        "\1\51\1\uffff\1\53\5\uffff\1\62\1\63\2\uffff\1\67\26\uffff\1\52"+
        "\1\54\1\55\1\56\21\uffff\1\107\1\uffff\1\112\1\uffff\1\114\2\uffff"+
        "\1\117\2\uffff\1\60\1\uffff\1\66\1\71\4\uffff\1\77\1\uffff\1\101"+
        "\1\102\1\103\1\104\1\105\12\uffff\1\75\3\uffff\1\111\1\uffff\1\115"+
        "\1\uffff\1\4\1\57\1\64\1\uffff\1\74\1\uffff\1\100\1\106\1\113\1"+
        "\116\1\72\1\76";
    static final String DFA33_specialS =
        "\1\1\1\uffff\1\3\1\4\51\uffff\1\0\10\uffff\1\5\125\uffff\1\6\55"+
        "\uffff\1\7\45\uffff\1\10\42\uffff\1\11\35\uffff\1\12\25\uffff\1"+
        "\2\30\uffff}>";
    static final String[] DFA33_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\1\1\2\1\3\1\61\1\4\1\5\1"+
            "\55\1\6\1\7\1\10\1\11\1\12\1\13\1\52\1\14\1\56\11\57\1\15\1"+
            "\16\1\17\1\20\1\21\1\53\1\61\32\54\1\22\1\61\1\23\1\24\1\54"+
            "\1\61\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\54\1\34\4\54\1\35"+
            "\1\36\1\37\1\54\1\40\1\41\1\42\1\43\1\44\1\45\3\54\1\46\1\47"+
            "\1\50\1\51\uff81\61",
            "\1\62",
            "\0\65",
            "\151\67\1\66\uff96\67",
            "\1\70",
            "\1\72\26\uffff\1\73",
            "",
            "",
            "\1\77",
            "\1\101\21\uffff\1\102",
            "",
            "\1\105\17\uffff\1\106\1\107",
            "\1\113\4\uffff\1\112\15\uffff\1\111",
            "\1\115",
            "",
            "\1\120\1\121",
            "\1\123",
            "\1\125\1\126",
            "",
            "",
            "\1\132",
            "\1\134",
            "\1\136",
            "\1\137\12\uffff\1\140\2\uffff\1\141",
            "\1\142\11\uffff\1\143",
            "\1\144\1\uffff\1\145\11\uffff\1\146",
            "\1\147\2\uffff\1\150",
            "\1\151",
            "\1\152\7\uffff\1\153",
            "\1\154\3\uffff\1\155",
            "\1\156",
            "\1\157\2\uffff\1\160",
            "\1\161",
            "\1\162\12\uffff\1\163\2\uffff\1\164",
            "\1\165\2\uffff\1\166\11\uffff\1\167\6\uffff\1\170",
            "\1\171\4\uffff\1\172",
            "\1\173\5\uffff\1\174",
            "\1\175",
            "",
            "\1\177\76\uffff\1\u0080",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\u0085",
            "",
            "",
            "\0\65",
            "\1\u0085\1\uffff\10\u0089\2\u0085\12\uffff\3\u0085\21\uffff"+
            "\1\u0087\13\uffff\3\u0085\21\uffff\1\u0087",
            "\1\u0085\1\uffff\12\u008a\12\uffff\3\u0085\35\uffff\3\u0085",
            "",
            "",
            "",
            "",
            "",
            "",
            "\156\67\1\u008c\uff91\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\5\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\14\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac\20\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\11\uffff\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0085\1\uffff\10\u0089\2\u0085\12\uffff\3\u0085\35\uffff"+
            "\3\u0085",
            "\1\u0085\1\uffff\12\u008a\12\uffff\3\u0085\35\uffff\3\u0085",
            "",
            "\143\67\1\u00ba\uff9c\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\1\u00c1",
            "\1\u00c2",
            "",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\154\67\1\u00e0\uff93\67",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u00e2",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\165\67\1\u0103\uff8a\67",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u011a",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u011c",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u011e",
            "\1\u011f",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\144\67\1\u0121\uff9b\67",
            "",
            "",
            "",
            "",
            "\1\u0122",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u0124",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u012c",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u0132",
            "",
            "\1\u0133",
            "",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "",
            "\145\67\1\u0137\uff9a\67",
            "\1\u0138",
            "",
            "\1\u0139",
            "",
            "",
            "\1\u013a",
            "\1\u013b",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u013d",
            "",
            "\1\u013e",
            "",
            "",
            "",
            "",
            "",
            "\1\u013f",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u0141",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u0143",
            "\0\67",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\1\u0147",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "\1\u0149",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | DOT | QMARK | COLON | ALPHA_NUMERIC | CPPCOMMENT | COMMENT | STRING | PREPROC | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WHITESPACE | OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_45 = input.LA(1);

                        s = -1;
                        if ( ((LA33_45 >= '\u0000' && LA33_45 <= '\uFFFF')) ) {s = 53;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA33_0 = input.LA(1);

                        s = -1;
                        if ( (LA33_0=='!') ) {s = 1;}

                        else if ( (LA33_0=='\"') ) {s = 2;}

                        else if ( (LA33_0=='#') ) {s = 3;}

                        else if ( (LA33_0=='%') ) {s = 4;}

                        else if ( (LA33_0=='&') ) {s = 5;}

                        else if ( (LA33_0=='(') ) {s = 6;}

                        else if ( (LA33_0==')') ) {s = 7;}

                        else if ( (LA33_0=='*') ) {s = 8;}

                        else if ( (LA33_0=='+') ) {s = 9;}

                        else if ( (LA33_0==',') ) {s = 10;}

                        else if ( (LA33_0=='-') ) {s = 11;}

                        else if ( (LA33_0=='/') ) {s = 12;}

                        else if ( (LA33_0==':') ) {s = 13;}

                        else if ( (LA33_0==';') ) {s = 14;}

                        else if ( (LA33_0=='<') ) {s = 15;}

                        else if ( (LA33_0=='=') ) {s = 16;}

                        else if ( (LA33_0=='>') ) {s = 17;}

                        else if ( (LA33_0=='[') ) {s = 18;}

                        else if ( (LA33_0==']') ) {s = 19;}

                        else if ( (LA33_0=='^') ) {s = 20;}

                        else if ( (LA33_0=='a') ) {s = 21;}

                        else if ( (LA33_0=='b') ) {s = 22;}

                        else if ( (LA33_0=='c') ) {s = 23;}

                        else if ( (LA33_0=='d') ) {s = 24;}

                        else if ( (LA33_0=='e') ) {s = 25;}

                        else if ( (LA33_0=='f') ) {s = 26;}

                        else if ( (LA33_0=='g') ) {s = 27;}

                        else if ( (LA33_0=='i') ) {s = 28;}

                        else if ( (LA33_0=='n') ) {s = 29;}

                        else if ( (LA33_0=='o') ) {s = 30;}

                        else if ( (LA33_0=='p') ) {s = 31;}

                        else if ( (LA33_0=='r') ) {s = 32;}

                        else if ( (LA33_0=='s') ) {s = 33;}

                        else if ( (LA33_0=='t') ) {s = 34;}

                        else if ( (LA33_0=='u') ) {s = 35;}

                        else if ( (LA33_0=='v') ) {s = 36;}

                        else if ( (LA33_0=='w') ) {s = 37;}

                        else if ( (LA33_0=='{') ) {s = 38;}

                        else if ( (LA33_0=='|') ) {s = 39;}

                        else if ( (LA33_0=='}') ) {s = 40;}

                        else if ( (LA33_0=='~') ) {s = 41;}

                        else if ( (LA33_0=='.') ) {s = 42;}

                        else if ( (LA33_0=='?') ) {s = 43;}

                        else if ( ((LA33_0 >= 'A' && LA33_0 <= 'Z')||LA33_0=='_'||LA33_0=='h'||(LA33_0 >= 'j' && LA33_0 <= 'm')||LA33_0=='q'||(LA33_0 >= 'x' && LA33_0 <= 'z')) ) {s = 44;}

                        else if ( (LA33_0=='\'') ) {s = 45;}

                        else if ( (LA33_0=='0') ) {s = 46;}

                        else if ( ((LA33_0 >= '1' && LA33_0 <= '9')) ) {s = 47;}

                        else if ( ((LA33_0 >= '\t' && LA33_0 <= '\n')||LA33_0=='\r'||LA33_0==' ') ) {s = 48;}

                        else if ( ((LA33_0 >= '\u0000' && LA33_0 <= '\b')||(LA33_0 >= '\u000B' && LA33_0 <= '\f')||(LA33_0 >= '\u000E' && LA33_0 <= '\u001F')||LA33_0=='$'||LA33_0=='@'||LA33_0=='\\'||LA33_0=='`'||(LA33_0 >= '\u007F' && LA33_0 <= '\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA33_311 = input.LA(1);

                        s = -1;
                        if ( ((LA33_311 >= '\u0000' && LA33_311 <= '\uFFFF')) ) {s = 55;}

                        else s = 324;

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA33_2 = input.LA(1);

                        s = -1;
                        if ( ((LA33_2 >= '\u0000' && LA33_2 <= '\uFFFF')) ) {s = 53;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA33_3 = input.LA(1);

                        s = -1;
                        if ( (LA33_3=='i') ) {s = 54;}

                        else if ( ((LA33_3 >= '\u0000' && LA33_3 <= 'h')||(LA33_3 >= 'j' && LA33_3 <= '\uFFFF')) ) {s = 55;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA33_54 = input.LA(1);

                        s = -1;
                        if ( (LA33_54=='n') ) {s = 140;}

                        else if ( ((LA33_54 >= '\u0000' && LA33_54 <= 'm')||(LA33_54 >= 'o' && LA33_54 <= '\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA33_140 = input.LA(1);

                        s = -1;
                        if ( (LA33_140=='c') ) {s = 186;}

                        else if ( ((LA33_140 >= '\u0000' && LA33_140 <= 'b')||(LA33_140 >= 'd' && LA33_140 <= '\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA33_186 = input.LA(1);

                        s = -1;
                        if ( (LA33_186=='l') ) {s = 224;}

                        else if ( ((LA33_186 >= '\u0000' && LA33_186 <= 'k')||(LA33_186 >= 'm' && LA33_186 <= '\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA33_224 = input.LA(1);

                        s = -1;
                        if ( (LA33_224=='u') ) {s = 259;}

                        else if ( ((LA33_224 >= '\u0000' && LA33_224 <= 't')||(LA33_224 >= 'v' && LA33_224 <= '\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA33_259 = input.LA(1);

                        s = -1;
                        if ( (LA33_259=='d') ) {s = 289;}

                        else if ( ((LA33_259 >= '\u0000' && LA33_259 <= 'c')||(LA33_259 >= 'e' && LA33_259 <= '\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA33_289 = input.LA(1);

                        s = -1;
                        if ( (LA33_289=='e') ) {s = 311;}

                        else if ( ((LA33_289 >= '\u0000' && LA33_289 <= 'd')||(LA33_289 >= 'f' && LA33_289 <= '\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}