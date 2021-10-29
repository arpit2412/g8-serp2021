// $ANTLR 3.4 CPPGrammar.g 2021-05-07 21:55:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CPPGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA_NUMERIC", "AND", "ARGUMENT", "ASSIGN", "ASSIGN_OP", "BASE_CLASSES", "BIT_OR", "BIT_OR_ELEM", "BRACKETS", "CALLEE", "CALL_TEMPLATE_LIST", "CLASS_CONTENT", "CLASS_DEF", "CLASS_NAME", "COLON", "COMMENT", "CONDITION", "COND_EXPR", "CPPCOMMENT", "CTOR_EXPR", "CTOR_INITIALIZER", "CTOR_LIST", "CURLIES", "DECIMAL_LITERAL", "DESTINATION", "DOT", "EQ_OPERATOR", "EXPR", "EXPR_STATEMENT", "Exponent", "FIELD", "FLOATING_POINT_LITERAL", "FOR_EXPR", "FOR_INIT", "FUNCTION_CALL", "FUNCTION_DEF", "FUNCTION_NAME", "FloatTypeSuffix", "HEX_LITERAL", "HexDigit", "INCLUDE_DIRECTIVE", "INIT", "INITIALIZER_ID", "INIT_DECL_LIST", "ITERATION", "IntegerTypeSuffix", "JUMP_STATEMENT", "KEYWORD", "LABEL", "LVAL", "NAME", "NAMESPACE_DEF", "OCTAL_LITERAL", "OR", "OTHER", "PARAMETER_DECL", "PARAMETER_LIST", "POINTER", "PREPROC", "QMARK", "REL_OPERATOR", "RETURN_TYPE", "RVAL", "SELECTION", "SIMPLE_DECL", "SOURCE_FILE", "SQUARES", "STATEMENTS", "STRING", "TEMPLATE_DECL_SPECIFIER", "TYPE", "TYPE_DEF", "TYPE_NAME", "TYPE_SUFFIX", "UNARY_EXPR", "UNARY_OPERATOR", "USING_DIRECTIVE", "VAR_DECL", "WHITESPACE", "'!'", "'!='", "'\"'", "'#include'", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'->*'", "'/'", "'/='", "'::'", "';'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'['", "']'", "'^'", "'^='", "'auto'", "'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", "'delete'", "'do'", "'else'", "'enum'", "'explicit'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'namespace'", "'new'", "'operator'", "'private'", "'protected'", "'public'", "'register'", "'return'", "'signed'", "'static'", "'struct'", "'switch'", "'template'", "'throw'", "'try'", "'typedef'", "'union'", "'unsigned'", "'using'", "'virtual'", "'volatile'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CPPGrammarParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CPPGrammarParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CPPGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "CPPGrammar.g"; }


    public static class code_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "code"
    // CPPGrammar.g:59:1: code : ( part )* -> ^( SOURCE_FILE ( part )* ) ;
    public final CPPGrammarParser.code_return code() throws RecognitionException {
        CPPGrammarParser.code_return retval = new CPPGrammarParser.code_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.part_return part1 =null;


        RewriteRuleSubtreeStream stream_part=new RewriteRuleSubtreeStream(adaptor,"rule part");
        try {
            // CPPGrammar.g:59:7: ( ( part )* -> ^( SOURCE_FILE ( part )* ) )
            // CPPGrammar.g:59:9: ( part )*
            {
            // CPPGrammar.g:59:9: ( part )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ALPHA_NUMERIC && LA1_0 <= OR)||(LA1_0 >= PARAMETER_DECL && LA1_0 <= 167)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CPPGrammar.g:59:9: part
            	    {
            	    pushFollow(FOLLOW_part_in_code288);
            	    part1=part();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_part.add(part1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: part
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 59:15: -> ^( SOURCE_FILE ( part )* )
            {
                // CPPGrammar.g:59:18: ^( SOURCE_FILE ( part )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SOURCE_FILE, "SOURCE_FILE")
                , root_1);

                // CPPGrammar.g:59:32: ( part )*
                while ( stream_part.hasNext() ) {
                    adaptor.addChild(root_1, stream_part.nextTree());

                }
                stream_part.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "code"


    public static class part_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "part"
    // CPPGrammar.g:61:1: part : ( ( declaration )=> declaration | water !);
    public final CPPGrammarParser.part_return part() throws RecognitionException {
        CPPGrammarParser.part_return retval = new CPPGrammarParser.part_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.declaration_return declaration2 =null;

        CPPGrammarParser.water_return water3 =null;



        try {
            // CPPGrammar.g:61:5: ( ( declaration )=> declaration | water !)
            int alt2=2;
            switch ( input.LA(1) ) {
            case 155:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case 152:
                {
                int LA2_2 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case 128:
            case 160:
                {
                int LA2_3 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;

                }
                }
                break;
            case 127:
            case 133:
            case 150:
            case 156:
                {
                int LA2_4 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;

                }
                }
                break;
            case 148:
            case 157:
                {
                int LA2_5 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA2_6 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;

                }
                }
                break;
            case 134:
            case 136:
            case 139:
            case 149:
            case 159:
                {
                int LA2_7 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 7, input);

                    throw nvae;

                }
                }
                break;
            case 90:
            case 94:
                {
                int LA2_8 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 8, input);

                    throw nvae;

                }
                }
                break;
            case 92:
                {
                int LA2_9 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 9, input);

                    throw nvae;

                }
                }
                break;
            case 142:
                {
                int LA2_10 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 10, input);

                    throw nvae;

                }
                }
                break;
            case 140:
                {
                int LA2_11 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 11, input);

                    throw nvae;

                }
                }
                break;
            case 158:
                {
                int LA2_12 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 12, input);

                    throw nvae;

                }
                }
                break;
            case 86:
                {
                int LA2_13 = input.LA(2);

                if ( (synpred1_CPPGrammar()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 13, input);

                    throw nvae;

                }
                }
                break;
            case AND:
            case ARGUMENT:
            case ASSIGN:
            case ASSIGN_OP:
            case BASE_CLASSES:
            case BIT_OR:
            case BIT_OR_ELEM:
            case BRACKETS:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COLON:
            case COMMENT:
            case CONDITION:
            case COND_EXPR:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case CURLIES:
            case DECIMAL_LITERAL:
            case DESTINATION:
            case DOT:
            case EQ_OPERATOR:
            case EXPR:
            case EXPR_STATEMENT:
            case Exponent:
            case FIELD:
            case FLOATING_POINT_LITERAL:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case FloatTypeSuffix:
            case HEX_LITERAL:
            case HexDigit:
            case INCLUDE_DIRECTIVE:
            case INIT:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case ITERATION:
            case IntegerTypeSuffix:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case LVAL:
            case NAME:
            case NAMESPACE_DEF:
            case OCTAL_LITERAL:
            case OR:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case POINTER:
            case PREPROC:
            case QMARK:
            case REL_OPERATOR:
            case RETURN_TYPE:
            case RVAL:
            case SELECTION:
            case SIMPLE_DECL:
            case SOURCE_FILE:
            case SQUARES:
            case STATEMENTS:
            case STRING:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE:
            case TYPE_DEF:
            case TYPE_NAME:
            case TYPE_SUFFIX:
            case UNARY_EXPR:
            case UNARY_OPERATOR:
            case USING_DIRECTIVE:
            case VAR_DECL:
            case WHITESPACE:
            case 83:
            case 84:
            case 85:
            case 87:
            case 88:
            case 89:
            case 91:
            case 93:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 129:
            case 130:
            case 131:
            case 132:
            case 135:
            case 137:
            case 138:
            case 141:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 151:
            case 153:
            case 154:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // CPPGrammar.g:61:7: ( declaration )=> declaration
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_in_part310);
                    declaration2=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration2.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:62:8: water !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_water_in_part319);
                    water3=water();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "part"


    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // CPPGrammar.g:65:1: declaration : ( ( simple_decl )=> simple_decl | function_def | namespace_def | using_directive | include_directive );
    public final CPPGrammarParser.declaration_return declaration() throws RecognitionException {
        CPPGrammarParser.declaration_return retval = new CPPGrammarParser.declaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.simple_decl_return simple_decl4 =null;

        CPPGrammarParser.function_def_return function_def5 =null;

        CPPGrammarParser.namespace_def_return namespace_def6 =null;

        CPPGrammarParser.using_directive_return using_directive7 =null;

        CPPGrammarParser.include_directive_return include_directive8 =null;



        try {
            // CPPGrammar.g:65:12: ( ( simple_decl )=> simple_decl | function_def | namespace_def | using_directive | include_directive )
            int alt3=5;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==155) && (synpred2_CPPGrammar())) {
                alt3=1;
            }
            else if ( (LA3_0==152) ) {
                int LA3_2 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==128||LA3_0==160) ) {
                int LA3_3 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==127||LA3_0==133||LA3_0==150||LA3_0==156) ) {
                int LA3_4 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==148||LA3_0==157) ) {
                int LA3_5 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==ALPHA_NUMERIC) ) {
                int LA3_6 = input.LA(2);

                if ( (synpred2_CPPGrammar()) ) {
                    alt3=1;
                }
                else if ( (true) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==90||LA3_0==92||LA3_0==94||LA3_0==134||LA3_0==136||LA3_0==139||LA3_0==142||LA3_0==149||LA3_0==159) ) {
                alt3=2;
            }
            else if ( (LA3_0==140) ) {
                alt3=3;
            }
            else if ( (LA3_0==158) ) {
                alt3=4;
            }
            else if ( (LA3_0==86) ) {
                alt3=5;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // CPPGrammar.g:65:14: ( simple_decl )=> simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_declaration339);
                    simple_decl4=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl4.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:66:7: function_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_def_in_declaration347);
                    function_def5=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def5.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:67:7: namespace_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_namespace_def_in_declaration355);
                    namespace_def6=namespace_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_def6.getTree());

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:68:7: using_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_using_directive_in_declaration363);
                    using_directive7=using_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, using_directive7.getTree());

                    }
                    break;
                case 5 :
                    // CPPGrammar.g:69:7: include_directive
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_include_directive_in_declaration371);
                    include_directive8=include_directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, include_directive8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class using_directive__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "using_directive_"
    // CPPGrammar.g:72:1: using_directive_ : 'using' 'namespace' identifier ';' ;
    public final CPPGrammarParser.using_directive__return using_directive_() throws RecognitionException {
        CPPGrammarParser.using_directive__return retval = new CPPGrammarParser.using_directive__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal9=null;
        Token string_literal10=null;
        Token char_literal12=null;
        CPPGrammarParser.identifier_return identifier11 =null;


        CommonTree string_literal9_tree=null;
        CommonTree string_literal10_tree=null;
        CommonTree char_literal12_tree=null;

        try {
            // CPPGrammar.g:72:17: ( 'using' 'namespace' identifier ';' )
            // CPPGrammar.g:72:19: 'using' 'namespace' identifier ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal9=(Token)match(input,158,FOLLOW_158_in_using_directive_381); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal9_tree = 
            (CommonTree)adaptor.create(string_literal9)
            ;
            adaptor.addChild(root_0, string_literal9_tree);
            }

            string_literal10=(Token)match(input,140,FOLLOW_140_in_using_directive_383); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal10_tree = 
            (CommonTree)adaptor.create(string_literal10)
            ;
            adaptor.addChild(root_0, string_literal10_tree);
            }

            pushFollow(FOLLOW_identifier_in_using_directive_385);
            identifier11=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier11.getTree());

            char_literal12=(Token)match(input,108,FOLLOW_108_in_using_directive_387); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal12_tree = 
            (CommonTree)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "using_directive_"


    public static class include_directive__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include_directive_"
    // CPPGrammar.g:73:1: include_directive_ : '#include' ( '\"' ( ALPHA_NUMERIC | '.' )+ '\"' | '<' ( ALPHA_NUMERIC | '.' )+ '>' ) ;
    public final CPPGrammarParser.include_directive__return include_directive_() throws RecognitionException {
        CPPGrammarParser.include_directive__return retval = new CPPGrammarParser.include_directive__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal13=null;
        Token char_literal14=null;
        Token set15=null;
        Token char_literal16=null;
        Token char_literal17=null;
        Token set18=null;
        Token char_literal19=null;

        CommonTree string_literal13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree set15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree set18_tree=null;
        CommonTree char_literal19_tree=null;

        try {
            // CPPGrammar.g:73:19: ( '#include' ( '\"' ( ALPHA_NUMERIC | '.' )+ '\"' | '<' ( ALPHA_NUMERIC | '.' )+ '>' ) )
            // CPPGrammar.g:73:21: '#include' ( '\"' ( ALPHA_NUMERIC | '.' )+ '\"' | '<' ( ALPHA_NUMERIC | '.' )+ '>' )
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal13=(Token)match(input,86,FOLLOW_86_in_include_directive_393); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal13_tree = 
            (CommonTree)adaptor.create(string_literal13)
            ;
            adaptor.addChild(root_0, string_literal13_tree);
            }

            // CPPGrammar.g:73:32: ( '\"' ( ALPHA_NUMERIC | '.' )+ '\"' | '<' ( ALPHA_NUMERIC | '.' )+ '>' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==85) ) {
                alt6=1;
            }
            else if ( (LA6_0==109) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // CPPGrammar.g:73:33: '\"' ( ALPHA_NUMERIC | '.' )+ '\"'
                    {
                    char_literal14=(Token)match(input,85,FOLLOW_85_in_include_directive_396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal14_tree = 
                    (CommonTree)adaptor.create(char_literal14)
                    ;
                    adaptor.addChild(root_0, char_literal14_tree);
                    }

                    // CPPGrammar.g:73:37: ( ALPHA_NUMERIC | '.' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==ALPHA_NUMERIC||LA4_0==DOT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    set15=(Token)input.LT(1);

                    	    if ( input.LA(1)==ALPHA_NUMERIC||input.LA(1)==DOT ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                    	        (CommonTree)adaptor.create(set15)
                    	        );
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    char_literal16=(Token)match(input,85,FOLLOW_85_in_include_directive_408); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal16_tree = 
                    (CommonTree)adaptor.create(char_literal16)
                    ;
                    adaptor.addChild(root_0, char_literal16_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:73:67: '<' ( ALPHA_NUMERIC | '.' )+ '>'
                    {
                    char_literal17=(Token)match(input,109,FOLLOW_109_in_include_directive_412); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal17_tree = 
                    (CommonTree)adaptor.create(char_literal17)
                    ;
                    adaptor.addChild(root_0, char_literal17_tree);
                    }

                    // CPPGrammar.g:73:71: ( ALPHA_NUMERIC | '.' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==ALPHA_NUMERIC||LA5_0==DOT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // CPPGrammar.g:
                    	    {
                    	    set18=(Token)input.LT(1);

                    	    if ( input.LA(1)==ALPHA_NUMERIC||input.LA(1)==DOT ) {
                    	        input.consume();
                    	        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                    	        (CommonTree)adaptor.create(set18)
                    	        );
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    char_literal19=(Token)match(input,115,FOLLOW_115_in_include_directive_423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal19_tree = 
                    (CommonTree)adaptor.create(char_literal19)
                    ;
                    adaptor.addChild(root_0, char_literal19_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "include_directive_"


    public static class simple_decl__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_decl_"
    // CPPGrammar.g:77:1: simple_decl_ : ( 'typedef' template_var_decl ';' -> ^( TYPE_DEF 'typedef' ) template_var_decl ';' | template_var_decl ';' -> template_var_decl ';' | var_decl ';' -> var_decl ';' );
    public final CPPGrammarParser.simple_decl__return simple_decl_() throws RecognitionException {
        CPPGrammarParser.simple_decl__return retval = new CPPGrammarParser.simple_decl__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal20=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        CPPGrammarParser.template_var_decl_return template_var_decl21 =null;

        CPPGrammarParser.template_var_decl_return template_var_decl23 =null;

        CPPGrammarParser.var_decl_return var_decl25 =null;


        CommonTree string_literal20_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal24_tree=null;
        CommonTree char_literal26_tree=null;
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        RewriteRuleSubtreeStream stream_template_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule template_var_decl");
        try {
            // CPPGrammar.g:77:13: ( 'typedef' template_var_decl ';' -> ^( TYPE_DEF 'typedef' ) template_var_decl ';' | template_var_decl ';' -> template_var_decl ';' | var_decl ';' -> var_decl ';' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 155:
                {
                alt7=1;
                }
                break;
            case 152:
                {
                alt7=2;
                }
                break;
            case ALPHA_NUMERIC:
            case 127:
            case 128:
            case 133:
            case 148:
            case 150:
            case 156:
            case 157:
            case 160:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // CPPGrammar.g:78:5: 'typedef' template_var_decl ';'
                    {
                    string_literal20=(Token)match(input,155,FOLLOW_155_in_simple_decl_437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_155.add(string_literal20);


                    pushFollow(FOLLOW_template_var_decl_in_simple_decl_439);
                    template_var_decl21=template_var_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_template_var_decl.add(template_var_decl21.getTree());

                    char_literal22=(Token)match(input,108,FOLLOW_108_in_simple_decl_441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(char_literal22);


                    // AST REWRITE
                    // elements: 108, 155, template_var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 78:37: -> ^( TYPE_DEF 'typedef' ) template_var_decl ';'
                    {
                        // CPPGrammar.g:78:40: ^( TYPE_DEF 'typedef' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TYPE_DEF, "TYPE_DEF")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_155.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_template_var_decl.nextTree());

                        adaptor.addChild(root_0, 
                        stream_108.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:79:7: template_var_decl ';'
                    {
                    pushFollow(FOLLOW_template_var_decl_in_simple_decl_461);
                    template_var_decl23=template_var_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_template_var_decl.add(template_var_decl23.getTree());

                    char_literal24=(Token)match(input,108,FOLLOW_108_in_simple_decl_463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(char_literal24);


                    // AST REWRITE
                    // elements: 108, template_var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 79:37: -> template_var_decl ';'
                    {
                        adaptor.addChild(root_0, stream_template_var_decl.nextTree());

                        adaptor.addChild(root_0, 
                        stream_108.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:80:7: var_decl ';'
                    {
                    pushFollow(FOLLOW_var_decl_in_simple_decl_485);
                    var_decl25=var_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_var_decl.add(var_decl25.getTree());

                    char_literal26=(Token)match(input,108,FOLLOW_108_in_simple_decl_487); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(char_literal26);


                    // AST REWRITE
                    // elements: 108, var_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 80:37: -> var_decl ';'
                    {
                        adaptor.addChild(root_0, stream_var_decl.nextTree());

                        adaptor.addChild(root_0, 
                        stream_108.nextNode()
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_decl_"


    public static class template_var_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_var_decl"
    // CPPGrammar.g:83:1: template_var_decl : template_declaration_start var_decl -> ^( TEMPLATE_DECL_SPECIFIER template_declaration_start ) var_decl ;
    public final CPPGrammarParser.template_var_decl_return template_var_decl() throws RecognitionException {
        CPPGrammarParser.template_var_decl_return retval = new CPPGrammarParser.template_var_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.template_declaration_start_return template_declaration_start27 =null;

        CPPGrammarParser.var_decl_return var_decl28 =null;


        RewriteRuleSubtreeStream stream_template_declaration_start=new RewriteRuleSubtreeStream(adaptor,"rule template_declaration_start");
        RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");
        try {
            // CPPGrammar.g:83:18: ( template_declaration_start var_decl -> ^( TEMPLATE_DECL_SPECIFIER template_declaration_start ) var_decl )
            // CPPGrammar.g:83:20: template_declaration_start var_decl
            {
            pushFollow(FOLLOW_template_declaration_start_in_template_var_decl522);
            template_declaration_start27=template_declaration_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_template_declaration_start.add(template_declaration_start27.getTree());

            pushFollow(FOLLOW_var_decl_in_template_var_decl524);
            var_decl28=var_decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_var_decl.add(var_decl28.getTree());

            // AST REWRITE
            // elements: template_declaration_start, var_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 84:9: -> ^( TEMPLATE_DECL_SPECIFIER template_declaration_start ) var_decl
            {
                // CPPGrammar.g:84:12: ^( TEMPLATE_DECL_SPECIFIER template_declaration_start )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TEMPLATE_DECL_SPECIFIER, "TEMPLATE_DECL_SPECIFIER")
                , root_1);

                adaptor.addChild(root_1, stream_template_declaration_start.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_var_decl.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_var_decl"


    protected static class var_decl_scope {
        CommonTree typeSpec;
    }
    protected Stack var_decl_stack = new Stack();


    public static class var_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_decl"
    // CPPGrammar.g:86:1: var_decl : ( (t0= type_name ) init_declarator_list -> init_declarator_list | (t1= class_def -> ^( CLASS_DEF class_def ) ) ( init_declarator_list -> init_declarator_list )? );
    public final CPPGrammarParser.var_decl_return var_decl() throws RecognitionException {
        var_decl_stack.push(new var_decl_scope());
        CPPGrammarParser.var_decl_return retval = new CPPGrammarParser.var_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.type_name_return t0 =null;

        CPPGrammarParser.class_def_return t1 =null;

        CPPGrammarParser.init_declarator_list_return init_declarator_list29 =null;

        CPPGrammarParser.init_declarator_list_return init_declarator_list30 =null;


        RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        RewriteRuleSubtreeStream stream_class_def=new RewriteRuleSubtreeStream(adaptor,"rule class_def");
        try {
            // CPPGrammar.g:90:5: ( (t0= type_name ) init_declarator_list -> init_declarator_list | (t1= class_def -> ^( CLASS_DEF class_def ) ) ( init_declarator_list -> init_declarator_list )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // CPPGrammar.g:91:5: (t0= type_name ) init_declarator_list
                    {
                    // CPPGrammar.g:91:5: (t0= type_name )
                    // CPPGrammar.g:91:6: t0= type_name
                    {
                    pushFollow(FOLLOW_type_name_in_var_decl564);
                    t0=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_name.add(t0.getTree());

                    if ( state.backtracking==0 ) {((var_decl_scope)var_decl_stack.peek()).typeSpec =(CommonTree)t0.getTree();}

                    }


                    pushFollow(FOLLOW_init_declarator_list_in_var_decl577);
                    init_declarator_list29=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list29.getTree());

                    // AST REWRITE
                    // elements: init_declarator_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:13: -> init_declarator_list
                    {
                        adaptor.addChild(root_0, stream_init_declarator_list.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:94:7: (t1= class_def -> ^( CLASS_DEF class_def ) ) ( init_declarator_list -> init_declarator_list )?
                    {
                    // CPPGrammar.g:94:7: (t1= class_def -> ^( CLASS_DEF class_def ) )
                    // CPPGrammar.g:94:8: t1= class_def
                    {
                    pushFollow(FOLLOW_class_def_in_var_decl604);
                    t1=class_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_class_def.add(t1.getTree());

                    if ( state.backtracking==0 ) {((var_decl_scope)var_decl_stack.peek()).typeSpec =(CommonTree)t1.getTree();}

                    // AST REWRITE
                    // elements: class_def
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:13: -> ^( CLASS_DEF class_def )
                    {
                        // CPPGrammar.g:95:16: ^( CLASS_DEF class_def )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CLASS_DEF, "CLASS_DEF")
                        , root_1);

                        adaptor.addChild(root_1, stream_class_def.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }


                    // CPPGrammar.g:95:40: ( init_declarator_list -> init_declarator_list )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ALPHA_NUMERIC||LA8_0==90||LA8_0==94) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // CPPGrammar.g:95:41: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_var_decl630);
                            init_declarator_list30=init_declarator_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list30.getTree());

                            // AST REWRITE
                            // elements: init_declarator_list
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 95:62: -> init_declarator_list
                            {
                                adaptor.addChild(root_0, stream_init_declarator_list.nextTree());

                            }


                            retval.tree = root_0;
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            var_decl_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "var_decl"


    public static class template_declaration_start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_declaration_start"
    // CPPGrammar.g:98:1: template_declaration_start : 'template' '<' template_param_list '>' ;
    public final CPPGrammarParser.template_declaration_start_return template_declaration_start() throws RecognitionException {
        CPPGrammarParser.template_declaration_start_return retval = new CPPGrammarParser.template_declaration_start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal31=null;
        Token char_literal32=null;
        Token char_literal34=null;
        CPPGrammarParser.template_param_list_return template_param_list33 =null;


        CommonTree string_literal31_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal34_tree=null;

        try {
            // CPPGrammar.g:98:27: ( 'template' '<' template_param_list '>' )
            // CPPGrammar.g:98:29: 'template' '<' template_param_list '>'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal31=(Token)match(input,152,FOLLOW_152_in_template_declaration_start652); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal31_tree = 
            (CommonTree)adaptor.create(string_literal31)
            ;
            adaptor.addChild(root_0, string_literal31_tree);
            }

            char_literal32=(Token)match(input,109,FOLLOW_109_in_template_declaration_start654); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal32_tree = 
            (CommonTree)adaptor.create(char_literal32)
            ;
            adaptor.addChild(root_0, char_literal32_tree);
            }

            pushFollow(FOLLOW_template_param_list_in_template_declaration_start656);
            template_param_list33=template_param_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list33.getTree());

            char_literal34=(Token)match(input,115,FOLLOW_115_in_template_declaration_start658); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal34_tree = 
            (CommonTree)adaptor.create(char_literal34)
            ;
            adaptor.addChild(root_0, char_literal34_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_declaration_start"


    public static class class_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_def"
    // CPPGrammar.g:100:1: class_def : class_def_ -> ^( CLASS_DEF class_def_ ) ;
    public final CPPGrammarParser.class_def_return class_def() throws RecognitionException {
        CPPGrammarParser.class_def_return retval = new CPPGrammarParser.class_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.class_def__return class_def_35 =null;


        RewriteRuleSubtreeStream stream_class_def_=new RewriteRuleSubtreeStream(adaptor,"rule class_def_");
        try {
            // CPPGrammar.g:100:10: ( class_def_ -> ^( CLASS_DEF class_def_ ) )
            // CPPGrammar.g:100:12: class_def_
            {
            pushFollow(FOLLOW_class_def__in_class_def666);
            class_def_35=class_def_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_class_def_.add(class_def_35.getTree());

            // AST REWRITE
            // elements: class_def_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 100:23: -> ^( CLASS_DEF class_def_ )
            {
                // CPPGrammar.g:100:26: ^( CLASS_DEF class_def_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CLASS_DEF, "CLASS_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_class_def_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_def"


    public static class class_def__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_def_"
    // CPPGrammar.g:101:1: class_def_ : class_key class_name base_classes '{' class_content '}' ;
    public final CPPGrammarParser.class_def__return class_def_() throws RecognitionException {
        CPPGrammarParser.class_def__return retval = new CPPGrammarParser.class_def__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal39=null;
        Token char_literal41=null;
        CPPGrammarParser.class_key_return class_key36 =null;

        CPPGrammarParser.class_name_return class_name37 =null;

        CPPGrammarParser.base_classes_return base_classes38 =null;

        CPPGrammarParser.class_content_return class_content40 =null;


        CommonTree char_literal39_tree=null;
        CommonTree char_literal41_tree=null;

        try {
            // CPPGrammar.g:101:11: ( class_key class_name base_classes '{' class_content '}' )
            // CPPGrammar.g:101:13: class_key class_name base_classes '{' class_content '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_class_key_in_class_def_680);
            class_key36=class_key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_key36.getTree());

            pushFollow(FOLLOW_class_name_in_class_def_682);
            class_name37=class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_name37.getTree());

            pushFollow(FOLLOW_base_classes_in_class_def_684);
            base_classes38=base_classes();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, base_classes38.getTree());

            char_literal39=(Token)match(input,162,FOLLOW_162_in_class_def_686); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal39_tree = 
            (CommonTree)adaptor.create(char_literal39)
            ;
            adaptor.addChild(root_0, char_literal39_tree);
            }

            pushFollow(FOLLOW_class_content_in_class_def_688);
            class_content40=class_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, class_content40.getTree());

            char_literal41=(Token)match(input,166,FOLLOW_166_in_class_def_690); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal41_tree = 
            (CommonTree)adaptor.create(char_literal41)
            ;
            adaptor.addChild(root_0, char_literal41_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_def_"


    public static class class_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_name"
    // CPPGrammar.g:102:1: class_name : ( identifier )? -> ^( CLASS_NAME ( identifier )? ) ;
    public final CPPGrammarParser.class_name_return class_name() throws RecognitionException {
        CPPGrammarParser.class_name_return retval = new CPPGrammarParser.class_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.identifier_return identifier42 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // CPPGrammar.g:102:11: ( ( identifier )? -> ^( CLASS_NAME ( identifier )? ) )
            // CPPGrammar.g:102:13: ( identifier )?
            {
            // CPPGrammar.g:102:13: ( identifier )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ALPHA_NUMERIC) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // CPPGrammar.g:102:13: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_class_name696);
                    identifier42=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier42.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:25: -> ^( CLASS_NAME ( identifier )? )
            {
                // CPPGrammar.g:102:28: ^( CLASS_NAME ( identifier )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CLASS_NAME, "CLASS_NAME")
                , root_1);

                // CPPGrammar.g:102:41: ( identifier )?
                if ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_name"


    public static class class_content_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_content"
    // CPPGrammar.g:104:1: class_content : class_content_ -> ^( CLASS_CONTENT ( class_content_ )? ) ;
    public final CPPGrammarParser.class_content_return class_content() throws RecognitionException {
        CPPGrammarParser.class_content_return retval = new CPPGrammarParser.class_content_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.class_content__return class_content_43 =null;


        RewriteRuleSubtreeStream stream_class_content_=new RewriteRuleSubtreeStream(adaptor,"rule class_content_");
        try {
            // CPPGrammar.g:104:14: ( class_content_ -> ^( CLASS_CONTENT ( class_content_ )? ) )
            // CPPGrammar.g:104:16: class_content_
            {
            pushFollow(FOLLOW_class_content__in_class_content713);
            class_content_43=class_content_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_class_content_.add(class_content_43.getTree());

            // AST REWRITE
            // elements: class_content_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:31: -> ^( CLASS_CONTENT ( class_content_ )? )
            {
                // CPPGrammar.g:104:34: ^( CLASS_CONTENT ( class_content_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CLASS_CONTENT, "CLASS_CONTENT")
                , root_1);

                // CPPGrammar.g:104:50: ( class_content_ )?
                if ( stream_class_content_.hasNext() ) {
                    adaptor.addChild(root_1, stream_class_content_.nextTree());

                }
                stream_class_content_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_content"


    public static class class_content__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_content_"
    // CPPGrammar.g:105:1: class_content_ : ( class_content_elem )* ;
    public final CPPGrammarParser.class_content__return class_content_() throws RecognitionException {
        CPPGrammarParser.class_content__return retval = new CPPGrammarParser.class_content__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.class_content_elem_return class_content_elem44 =null;



        try {
            // CPPGrammar.g:105:15: ( ( class_content_elem )* )
            // CPPGrammar.g:105:17: ( class_content_elem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:105:17: ( class_content_elem )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= ALPHA_NUMERIC && LA11_0 <= 165)||LA11_0==167) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // CPPGrammar.g:105:17: class_content_elem
            	    {
            	    pushFollow(FOLLOW_class_content_elem_in_class_content_728);
            	    class_content_elem44=class_content_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_content_elem44.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_content_"


    public static class class_content_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_content_elem"
    // CPPGrammar.g:107:1: class_content_elem : ( ( simple_decl )=> simple_decl | ( function_def )=> function_def | ( label )=> label | '{' class_content_ '}' | no_curlies );
    public final CPPGrammarParser.class_content_elem_return class_content_elem() throws RecognitionException {
        CPPGrammarParser.class_content_elem_return retval = new CPPGrammarParser.class_content_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        CPPGrammarParser.simple_decl_return simple_decl45 =null;

        CPPGrammarParser.function_def_return function_def46 =null;

        CPPGrammarParser.label_return label47 =null;

        CPPGrammarParser.class_content__return class_content_49 =null;

        CPPGrammarParser.no_curlies_return no_curlies51 =null;


        CommonTree char_literal48_tree=null;
        CommonTree char_literal50_tree=null;

        try {
            // CPPGrammar.g:107:19: ( ( simple_decl )=> simple_decl | ( function_def )=> function_def | ( label )=> label | '{' class_content_ '}' | no_curlies )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 155:
                {
                int LA12_1 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt12=1;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
                }
                break;
            case 152:
                {
                int LA12_2 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt12=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;

                }
                }
                break;
            case 128:
            case 160:
                {
                int LA12_3 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt12=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;

                }
                }
                break;
            case 127:
            case 133:
            case 150:
            case 156:
                {
                int LA12_4 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt12=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;

                }
                }
                break;
            case 148:
            case 157:
                {
                int LA12_5 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt12=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 5, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA12_6 = input.LA(2);

                if ( (synpred3_CPPGrammar()) ) {
                    alt12=1;
                }
                else if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (synpred5_CPPGrammar()) ) {
                    alt12=3;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 6, input);

                    throw nvae;

                }
                }
                break;
            case 134:
            case 136:
            case 139:
            case 149:
            case 159:
                {
                int LA12_7 = input.LA(2);

                if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 7, input);

                    throw nvae;

                }
                }
                break;
            case 90:
            case 94:
                {
                int LA12_8 = input.LA(2);

                if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 8, input);

                    throw nvae;

                }
                }
                break;
            case 92:
                {
                int LA12_9 = input.LA(2);

                if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 9, input);

                    throw nvae;

                }
                }
                break;
            case 142:
                {
                int LA12_10 = input.LA(2);

                if ( (synpred4_CPPGrammar()) ) {
                    alt12=2;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 10, input);

                    throw nvae;

                }
                }
                break;
            case 125:
                {
                int LA12_11 = input.LA(2);

                if ( (synpred5_CPPGrammar()) ) {
                    alt12=3;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 11, input);

                    throw nvae;

                }
                }
                break;
            case DECIMAL_LITERAL:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
                {
                int LA12_12 = input.LA(2);

                if ( (synpred5_CPPGrammar()) ) {
                    alt12=3;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 12, input);

                    throw nvae;

                }
                }
                break;
            case 143:
            case 144:
            case 145:
                {
                int LA12_13 = input.LA(2);

                if ( (synpred5_CPPGrammar()) ) {
                    alt12=3;
                }
                else if ( (true) ) {
                    alt12=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 13, input);

                    throw nvae;

                }
                }
                break;
            case 162:
                {
                alt12=4;
                }
                break;
            case AND:
            case ARGUMENT:
            case ASSIGN:
            case ASSIGN_OP:
            case BASE_CLASSES:
            case BIT_OR:
            case BIT_OR_ELEM:
            case BRACKETS:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COLON:
            case COMMENT:
            case CONDITION:
            case COND_EXPR:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case CURLIES:
            case DESTINATION:
            case DOT:
            case EQ_OPERATOR:
            case EXPR:
            case EXPR_STATEMENT:
            case Exponent:
            case FIELD:
            case FLOATING_POINT_LITERAL:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case FloatTypeSuffix:
            case HexDigit:
            case INCLUDE_DIRECTIVE:
            case INIT:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case ITERATION:
            case IntegerTypeSuffix:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case LVAL:
            case NAME:
            case NAMESPACE_DEF:
            case OR:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case POINTER:
            case PREPROC:
            case QMARK:
            case REL_OPERATOR:
            case RETURN_TYPE:
            case RVAL:
            case SELECTION:
            case SIMPLE_DECL:
            case SOURCE_FILE:
            case SQUARES:
            case STATEMENTS:
            case STRING:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE:
            case TYPE_DEF:
            case TYPE_NAME:
            case TYPE_SUFFIX:
            case UNARY_EXPR:
            case UNARY_OPERATOR:
            case USING_DIRECTIVE:
            case VAR_DECL:
            case WHITESPACE:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 93:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 126:
            case 129:
            case 130:
            case 131:
            case 132:
            case 135:
            case 137:
            case 138:
            case 140:
            case 141:
            case 146:
            case 147:
            case 151:
            case 153:
            case 154:
            case 158:
            case 161:
            case 163:
            case 164:
            case 165:
            case 167:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // CPPGrammar.g:107:22: ( simple_decl )=> simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_class_content_elem743);
                    simple_decl45=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl45.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:108:5: ( function_def )=> function_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_def_in_class_content_elem755);
                    function_def46=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def46.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:109:5: ( label )=> label
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_label_in_class_content_elem767);
                    label47=label();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, label47.getTree());

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:110:5: '{' class_content_ '}'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal48=(Token)match(input,162,FOLLOW_162_in_class_content_elem773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal48_tree = 
                    (CommonTree)adaptor.create(char_literal48)
                    ;
                    adaptor.addChild(root_0, char_literal48_tree);
                    }

                    pushFollow(FOLLOW_class_content__in_class_content_elem775);
                    class_content_49=class_content_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_content_49.getTree());

                    char_literal50=(Token)match(input,166,FOLLOW_166_in_class_content_elem777); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal50_tree = 
                    (CommonTree)adaptor.create(char_literal50)
                    ;
                    adaptor.addChild(root_0, char_literal50_tree);
                    }

                    }
                    break;
                case 5 :
                    // CPPGrammar.g:111:5: no_curlies
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_curlies_in_class_content_elem783);
                    no_curlies51=no_curlies();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_curlies51.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_content_elem"


    public static class base_classes_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_classes"
    // CPPGrammar.g:114:1: base_classes : ( base_classes_ )? -> ^( BASE_CLASSES ( base_classes_ )? ) ;
    public final CPPGrammarParser.base_classes_return base_classes() throws RecognitionException {
        CPPGrammarParser.base_classes_return retval = new CPPGrammarParser.base_classes_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.base_classes__return base_classes_52 =null;


        RewriteRuleSubtreeStream stream_base_classes_=new RewriteRuleSubtreeStream(adaptor,"rule base_classes_");
        try {
            // CPPGrammar.g:114:13: ( ( base_classes_ )? -> ^( BASE_CLASSES ( base_classes_ )? ) )
            // CPPGrammar.g:114:15: ( base_classes_ )?
            {
            // CPPGrammar.g:114:15: ( base_classes_ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COLON) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // CPPGrammar.g:114:15: base_classes_
                    {
                    pushFollow(FOLLOW_base_classes__in_base_classes793);
                    base_classes_52=base_classes_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base_classes_.add(base_classes_52.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: base_classes_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:30: -> ^( BASE_CLASSES ( base_classes_ )? )
            {
                // CPPGrammar.g:114:33: ^( BASE_CLASSES ( base_classes_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BASE_CLASSES, "BASE_CLASSES")
                , root_1);

                // CPPGrammar.g:114:48: ( base_classes_ )?
                if ( stream_base_classes_.hasNext() ) {
                    adaptor.addChild(root_1, stream_base_classes_.nextTree());

                }
                stream_base_classes_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base_classes"


    public static class base_classes__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_classes_"
    // CPPGrammar.g:115:1: base_classes_ : ':' base_class ( ',' base_class )* ;
    public final CPPGrammarParser.base_classes__return base_classes_() throws RecognitionException {
        CPPGrammarParser.base_classes__return retval = new CPPGrammarParser.base_classes__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal53=null;
        Token char_literal55=null;
        CPPGrammarParser.base_class_return base_class54 =null;

        CPPGrammarParser.base_class_return base_class56 =null;


        CommonTree char_literal53_tree=null;
        CommonTree char_literal55_tree=null;

        try {
            // CPPGrammar.g:115:14: ( ':' base_class ( ',' base_class )* )
            // CPPGrammar.g:115:16: ':' base_class ( ',' base_class )*
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal53=(Token)match(input,COLON,FOLLOW_COLON_in_base_classes_810); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal53_tree = 
            (CommonTree)adaptor.create(char_literal53)
            ;
            adaptor.addChild(root_0, char_literal53_tree);
            }

            pushFollow(FOLLOW_base_class_in_base_classes_812);
            base_class54=base_class();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, base_class54.getTree());

            // CPPGrammar.g:115:31: ( ',' base_class )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==99) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // CPPGrammar.g:115:32: ',' base_class
            	    {
            	    char_literal55=(Token)match(input,99,FOLLOW_99_in_base_classes_815); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal55_tree = 
            	    (CommonTree)adaptor.create(char_literal55)
            	    ;
            	    adaptor.addChild(root_0, char_literal55_tree);
            	    }

            	    pushFollow(FOLLOW_base_class_in_base_classes_817);
            	    base_class56=base_class();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, base_class56.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base_classes_"


    public static class base_class_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base_class"
    // CPPGrammar.g:116:1: base_class : ( 'virtual' )? ( access_specifier )? identifier ;
    public final CPPGrammarParser.base_class_return base_class() throws RecognitionException {
        CPPGrammarParser.base_class_return retval = new CPPGrammarParser.base_class_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal57=null;
        CPPGrammarParser.access_specifier_return access_specifier58 =null;

        CPPGrammarParser.identifier_return identifier59 =null;


        CommonTree string_literal57_tree=null;

        try {
            // CPPGrammar.g:116:11: ( ( 'virtual' )? ( access_specifier )? identifier )
            // CPPGrammar.g:116:13: ( 'virtual' )? ( access_specifier )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:116:13: ( 'virtual' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==159) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // CPPGrammar.g:116:13: 'virtual'
                    {
                    string_literal57=(Token)match(input,159,FOLLOW_159_in_base_class825); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal57_tree = 
                    (CommonTree)adaptor.create(string_literal57)
                    ;
                    adaptor.addChild(root_0, string_literal57_tree);
                    }

                    }
                    break;

            }


            // CPPGrammar.g:116:24: ( access_specifier )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= 143 && LA16_0 <= 145)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // CPPGrammar.g:116:24: access_specifier
                    {
                    pushFollow(FOLLOW_access_specifier_in_base_class828);
                    access_specifier58=access_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access_specifier58.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_base_class831);
            identifier59=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier59.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base_class"


    public static class init_declarator_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator_list"
    // CPPGrammar.g:118:1: init_declarator_list : ( init_declarator -> init_declarator ) ( ',' init_declarator_list -> ^( INIT_DECL_LIST init_declarator ',' init_declarator_list ) )? ;
    public final CPPGrammarParser.init_declarator_list_return init_declarator_list() throws RecognitionException {
        CPPGrammarParser.init_declarator_list_return retval = new CPPGrammarParser.init_declarator_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal61=null;
        CPPGrammarParser.init_declarator_return init_declarator60 =null;

        CPPGrammarParser.init_declarator_list_return init_declarator_list62 =null;


        CommonTree char_literal61_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");
        RewriteRuleSubtreeStream stream_init_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_list");
        try {
            // CPPGrammar.g:118:21: ( ( init_declarator -> init_declarator ) ( ',' init_declarator_list -> ^( INIT_DECL_LIST init_declarator ',' init_declarator_list ) )? )
            // CPPGrammar.g:119:3: ( init_declarator -> init_declarator ) ( ',' init_declarator_list -> ^( INIT_DECL_LIST init_declarator ',' init_declarator_list ) )?
            {
            // CPPGrammar.g:119:3: ( init_declarator -> init_declarator )
            // CPPGrammar.g:119:4: init_declarator
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list841);
            init_declarator60=init_declarator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator60.getTree());

            // AST REWRITE
            // elements: init_declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 119:20: -> init_declarator
            {
                adaptor.addChild(root_0, stream_init_declarator.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // CPPGrammar.g:120:9: ( ',' init_declarator_list -> ^( INIT_DECL_LIST init_declarator ',' init_declarator_list ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==99) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // CPPGrammar.g:120:10: ',' init_declarator_list
                    {
                    char_literal61=(Token)match(input,99,FOLLOW_99_in_init_declarator_list857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(char_literal61);


                    pushFollow(FOLLOW_init_declarator_list_in_init_declarator_list859);
                    init_declarator_list62=init_declarator_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_init_declarator_list.add(init_declarator_list62.getTree());

                    // AST REWRITE
                    // elements: init_declarator, 99, init_declarator_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 120:35: -> ^( INIT_DECL_LIST init_declarator ',' init_declarator_list )
                    {
                        // CPPGrammar.g:120:38: ^( INIT_DECL_LIST init_declarator ',' init_declarator_list )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INIT_DECL_LIST, "INIT_DECL_LIST")
                        , root_1);

                        adaptor.addChild(root_1, stream_init_declarator.nextTree());

                        adaptor.addChild(root_1, 
                        stream_99.nextNode()
                        );

                        adaptor.addChild(root_1, stream_init_declarator_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_declarator_list"


    public static class init_declarator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator"
    // CPPGrammar.g:122:1: init_declarator : init_declarator_ -> ^( VAR_DECL init_declarator_ ) ;
    public final CPPGrammarParser.init_declarator_return init_declarator() throws RecognitionException {
        CPPGrammarParser.init_declarator_return retval = new CPPGrammarParser.init_declarator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.init_declarator__return init_declarator_63 =null;


        RewriteRuleSubtreeStream stream_init_declarator_=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator_");
        try {
            // CPPGrammar.g:122:16: ( init_declarator_ -> ^( VAR_DECL init_declarator_ ) )
            // CPPGrammar.g:122:18: init_declarator_
            {
            pushFollow(FOLLOW_init_declarator__in_init_declarator880);
            init_declarator_63=init_declarator_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_declarator_.add(init_declarator_63.getTree());

            // AST REWRITE
            // elements: init_declarator_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:35: -> ^( VAR_DECL init_declarator_ )
            {
                // CPPGrammar.g:122:38: ^( VAR_DECL init_declarator_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VAR_DECL, "VAR_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_init_declarator_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_declarator"


    protected static class init_declarator__scope {
        CommonTree pointer;
        CommonTree type_suffix;
    }
    protected Stack init_declarator__stack = new Stack();


    public static class init_declarator__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_declarator_"
    // CPPGrammar.g:124:1: init_declarator_ : ( ( init_decl_name -> init_decl_name ) ( ( ( '(' ( expr )? ')' ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) ) ) | ( ( '=' assign_expr ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) ) ) )? ) -> {$init_declarator_::pointer != null && $init_declarator_::type_suffix == null}? ^( TYPE ^( POINTER ) ) $init_declarator_ -> {$init_declarator_::pointer != null && $init_declarator_::type_suffix != null}? ^( TYPE ^( POINTER ) ^( TYPE_SUFFIX ) ) $init_declarator_ -> {$init_declarator_::pointer == null && $init_declarator_::type_suffix != null}? ^( TYPE ^( TYPE_SUFFIX ) ) $init_declarator_ -> ^( TYPE ) $init_declarator_;
    public final CPPGrammarParser.init_declarator__return init_declarator_() throws RecognitionException {
        init_declarator__stack.push(new init_declarator__scope());
        CPPGrammarParser.init_declarator__return retval = new CPPGrammarParser.init_declarator__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal65=null;
        Token char_literal67=null;
        Token char_literal68=null;
        CPPGrammarParser.init_decl_name_return init_decl_name64 =null;

        CPPGrammarParser.expr_return expr66 =null;

        CPPGrammarParser.assign_expr_return assign_expr69 =null;


        CommonTree char_literal65_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_assign_expr=new RewriteRuleSubtreeStream(adaptor,"rule assign_expr");
        RewriteRuleSubtreeStream stream_init_decl_name=new RewriteRuleSubtreeStream(adaptor,"rule init_decl_name");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:129:3: ( ( ( init_decl_name -> init_decl_name ) ( ( ( '(' ( expr )? ')' ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) ) ) | ( ( '=' assign_expr ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) ) ) )? ) -> {$init_declarator_::pointer != null && $init_declarator_::type_suffix == null}? ^( TYPE ^( POINTER ) ) $init_declarator_ -> {$init_declarator_::pointer != null && $init_declarator_::type_suffix != null}? ^( TYPE ^( POINTER ) ^( TYPE_SUFFIX ) ) $init_declarator_ -> {$init_declarator_::pointer == null && $init_declarator_::type_suffix != null}? ^( TYPE ^( TYPE_SUFFIX ) ) $init_declarator_ -> ^( TYPE ) $init_declarator_)
            // CPPGrammar.g:129:3: ( ( init_decl_name -> init_decl_name ) ( ( ( '(' ( expr )? ')' ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) ) ) | ( ( '=' assign_expr ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) ) ) )? )
            {
            // CPPGrammar.g:129:3: ( ( init_decl_name -> init_decl_name ) ( ( ( '(' ( expr )? ')' ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) ) ) | ( ( '=' assign_expr ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) ) ) )? )
            // CPPGrammar.g:129:4: ( init_decl_name -> init_decl_name ) ( ( ( '(' ( expr )? ')' ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) ) ) | ( ( '=' assign_expr ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) ) ) )?
            {
            // CPPGrammar.g:129:4: ( init_decl_name -> init_decl_name )
            // CPPGrammar.g:129:5: init_decl_name
            {
            pushFollow(FOLLOW_init_decl_name_in_init_declarator_901);
            init_decl_name64=init_decl_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_decl_name.add(init_decl_name64.getTree());

            // AST REWRITE
            // elements: init_decl_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 129:20: -> init_decl_name
            {
                adaptor.addChild(root_0, stream_init_decl_name.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // CPPGrammar.g:130:9: ( ( ( '(' ( expr )? ')' ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) ) ) | ( ( '=' assign_expr ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) ) ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==92) ) {
                alt19=1;
            }
            else if ( (LA19_0==113) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // CPPGrammar.g:131:13: ( ( '(' ( expr )? ')' ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) ) )
                    {
                    // CPPGrammar.g:131:13: ( ( '(' ( expr )? ')' ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) ) )
                    // CPPGrammar.g:131:15: ( '(' ( expr )? ')' )
                    {
                    // CPPGrammar.g:131:15: ( '(' ( expr )? ')' )
                    // CPPGrammar.g:131:16: '(' ( expr )? ')'
                    {
                    char_literal65=(Token)match(input,92,FOLLOW_92_in_init_declarator_934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_92.add(char_literal65);


                    // CPPGrammar.g:131:20: ( expr )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ALPHA_NUMERIC||LA18_0==DECIMAL_LITERAL||LA18_0==FLOATING_POINT_LITERAL||LA18_0==HEX_LITERAL||LA18_0==OCTAL_LITERAL||LA18_0==STRING||LA18_0==83||LA18_0==90||LA18_0==92||LA18_0==94||(LA18_0 >= 96 && LA18_0 <= 97)||(LA18_0 >= 100 && LA18_0 <= 101)||LA18_0==167) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // CPPGrammar.g:131:20: expr
                            {
                            pushFollow(FOLLOW_expr_in_init_declarator_936);
                            expr66=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr.add(expr66.getTree());

                            }
                            break;

                    }


                    char_literal67=(Token)match(input,93,FOLLOW_93_in_init_declarator_939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_93.add(char_literal67);


                    }


                    // AST REWRITE
                    // elements: init_decl_name, expr, init_decl_name, 93, init_decl_name, 92
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 132:21: -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) )
                    {
                        adaptor.addChild(root_0, stream_init_decl_name.nextTree());

                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(STRING, ";")
                        );

                        // CPPGrammar.g:132:51: ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INIT, "INIT")
                        , root_1);

                        // CPPGrammar.g:132:58: ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP init_decl_name ) ^( RVAL '(' ( expr )? ')' ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGN, "ASSIGN")
                        , root_2);

                        // CPPGrammar.g:132:67: ^( LVAL init_decl_name )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LVAL, "LVAL")
                        , root_3);

                        adaptor.addChild(root_3, stream_init_decl_name.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        // CPPGrammar.g:132:90: ^( ASSIGN_OP init_decl_name )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGN_OP, "ASSIGN_OP")
                        , root_3);

                        adaptor.addChild(root_3, stream_init_decl_name.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        // CPPGrammar.g:132:118: ^( RVAL '(' ( expr )? ')' )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(RVAL, "RVAL")
                        , root_3);

                        adaptor.addChild(root_3, 
                        stream_92.nextNode()
                        );

                        // CPPGrammar.g:132:129: ( expr )?
                        if ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_3, stream_expr.nextTree());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_3, 
                        stream_93.nextNode()
                        );

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:133:13: ( ( '=' assign_expr ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) ) )
                    {
                    // CPPGrammar.g:133:13: ( ( '=' assign_expr ) -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) ) )
                    // CPPGrammar.g:133:15: ( '=' assign_expr )
                    {
                    // CPPGrammar.g:133:15: ( '=' assign_expr )
                    // CPPGrammar.g:133:16: '=' assign_expr
                    {
                    char_literal68=(Token)match(input,113,FOLLOW_113_in_init_declarator_1017); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(char_literal68);


                    pushFollow(FOLLOW_assign_expr_in_init_declarator_1019);
                    assign_expr69=assign_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assign_expr.add(assign_expr69.getTree());

                    }


                    // AST REWRITE
                    // elements: assign_expr, init_decl_name, init_decl_name, 113
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 134:21: -> init_decl_name STRING[\";\"] ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) )
                    {
                        adaptor.addChild(root_0, stream_init_decl_name.nextTree());

                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(STRING, ";")
                        );

                        // CPPGrammar.g:134:51: ^( INIT ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(INIT, "INIT")
                        , root_1);

                        // CPPGrammar.g:134:58: ^( ASSIGN ^( LVAL init_decl_name ) ^( ASSIGN_OP '=' ) ^( RVAL assign_expr ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGN, "ASSIGN")
                        , root_2);

                        // CPPGrammar.g:134:67: ^( LVAL init_decl_name )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LVAL, "LVAL")
                        , root_3);

                        adaptor.addChild(root_3, stream_init_decl_name.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        // CPPGrammar.g:134:90: ^( ASSIGN_OP '=' )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGN_OP, "ASSIGN_OP")
                        , root_3);

                        adaptor.addChild(root_3, 
                        stream_113.nextNode()
                        );

                        adaptor.addChild(root_2, root_3);
                        }

                        // CPPGrammar.g:134:107: ^( RVAL assign_expr )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(RVAL, "RVAL")
                        , root_3);

                        adaptor.addChild(root_3, stream_assign_expr.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: init_declarator_, init_declarator_, init_declarator_, init_declarator_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 136:13: -> {$init_declarator_::pointer != null && $init_declarator_::type_suffix == null}? ^( TYPE ^( POINTER ) ) $init_declarator_
            if (((init_declarator__scope)init_declarator__stack.peek()).pointer != null && ((init_declarator__scope)init_declarator__stack.peek()).type_suffix == null) {
                // CPPGrammar.g:137:21: ^( TYPE ^( POINTER ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, ((var_decl_scope)var_decl_stack.peek()).typeSpec);

                // CPPGrammar.g:137:50: ^( POINTER )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(POINTER, "POINTER")
                , root_2);

                adaptor.addChild(root_2, ((init_declarator__scope)init_declarator__stack.peek()).pointer);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_retval.nextTree());

            }

            else // 138:13: -> {$init_declarator_::pointer != null && $init_declarator_::type_suffix != null}? ^( TYPE ^( POINTER ) ^( TYPE_SUFFIX ) ) $init_declarator_
            if (((init_declarator__scope)init_declarator__stack.peek()).pointer != null && ((init_declarator__scope)init_declarator__stack.peek()).type_suffix != null) {
                // CPPGrammar.g:139:21: ^( TYPE ^( POINTER ) ^( TYPE_SUFFIX ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, ((var_decl_scope)var_decl_stack.peek()).typeSpec);

                // CPPGrammar.g:139:50: ^( POINTER )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(POINTER, "POINTER")
                , root_2);

                adaptor.addChild(root_2, ((init_declarator__scope)init_declarator__stack.peek()).pointer);

                adaptor.addChild(root_1, root_2);
                }

                // CPPGrammar.g:139:90: ^( TYPE_SUFFIX )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE_SUFFIX, "TYPE_SUFFIX")
                , root_2);

                adaptor.addChild(root_2, ((init_declarator__scope)init_declarator__stack.peek()).type_suffix);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_retval.nextTree());

            }

            else // 140:13: -> {$init_declarator_::pointer == null && $init_declarator_::type_suffix != null}? ^( TYPE ^( TYPE_SUFFIX ) ) $init_declarator_
            if (((init_declarator__scope)init_declarator__stack.peek()).pointer == null && ((init_declarator__scope)init_declarator__stack.peek()).type_suffix != null) {
                // CPPGrammar.g:141:21: ^( TYPE ^( TYPE_SUFFIX ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, ((var_decl_scope)var_decl_stack.peek()).typeSpec);

                // CPPGrammar.g:141:50: ^( TYPE_SUFFIX )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE_SUFFIX, "TYPE_SUFFIX")
                , root_2);

                adaptor.addChild(root_2, ((init_declarator__scope)init_declarator__stack.peek()).type_suffix);

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_retval.nextTree());

            }

            else // 142:13: -> ^( TYPE ) $init_declarator_
            {
                // CPPGrammar.g:142:16: ^( TYPE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE, "TYPE")
                , root_1);

                adaptor.addChild(root_1, ((var_decl_scope)var_decl_stack.peek()).typeSpec);

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_retval.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            init_declarator__stack.pop();
        }
        return retval;
    }
    // $ANTLR end "init_declarator_"


    public static class init_decl_name__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_decl_name_"
    // CPPGrammar.g:145:1: init_decl_name_ : ( (p= ptr_operator )* identifier ) (s= type_suffix )? -> identifier ;
    public final CPPGrammarParser.init_decl_name__return init_decl_name_() throws RecognitionException {
        CPPGrammarParser.init_decl_name__return retval = new CPPGrammarParser.init_decl_name__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.ptr_operator_return p =null;

        CPPGrammarParser.type_suffix_return s =null;

        CPPGrammarParser.identifier_return identifier70 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_ptr_operator=new RewriteRuleSubtreeStream(adaptor,"rule ptr_operator");
        RewriteRuleSubtreeStream stream_type_suffix=new RewriteRuleSubtreeStream(adaptor,"rule type_suffix");
        try {
            // CPPGrammar.g:145:16: ( ( (p= ptr_operator )* identifier ) (s= type_suffix )? -> identifier )
            // CPPGrammar.g:145:18: ( (p= ptr_operator )* identifier ) (s= type_suffix )?
            {
            // CPPGrammar.g:145:18: ( (p= ptr_operator )* identifier )
            // CPPGrammar.g:145:20: (p= ptr_operator )* identifier
            {
            // CPPGrammar.g:145:21: (p= ptr_operator )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==90||LA20_0==94) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // CPPGrammar.g:145:21: p= ptr_operator
            	    {
            	    pushFollow(FOLLOW_ptr_operator_in_init_decl_name_1282);
            	    p=ptr_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ptr_operator.add(p.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            pushFollow(FOLLOW_identifier_in_init_decl_name_1285);
            identifier70=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier70.getTree());

            }


            // CPPGrammar.g:145:49: (s= type_suffix )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==119) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // CPPGrammar.g:145:49: s= type_suffix
                    {
                    pushFollow(FOLLOW_type_suffix_in_init_decl_name_1290);
                    s=type_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_suffix.add(s.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                        if(p != null) ((init_declarator__scope)init_declarator__stack.peek()).pointer = (CommonTree) p.getTree();
                        if(s != null) ((init_declarator__scope)init_declarator__stack.peek()).type_suffix = (CommonTree) s.getTree();
                    }

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 150:9: -> identifier
            {
                adaptor.addChild(root_0, stream_identifier.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_decl_name_"


    public static class type_suffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_suffix"
    // CPPGrammar.g:153:1: type_suffix : ( '[' ( constant_expr )? ']' ) ;
    public final CPPGrammarParser.type_suffix_return type_suffix() throws RecognitionException {
        CPPGrammarParser.type_suffix_return retval = new CPPGrammarParser.type_suffix_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal71=null;
        Token char_literal73=null;
        CPPGrammarParser.constant_expr_return constant_expr72 =null;


        CommonTree char_literal71_tree=null;
        CommonTree char_literal73_tree=null;

        try {
            // CPPGrammar.g:153:12: ( ( '[' ( constant_expr )? ']' ) )
            // CPPGrammar.g:153:14: ( '[' ( constant_expr )? ']' )
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:153:14: ( '[' ( constant_expr )? ']' )
            // CPPGrammar.g:153:15: '[' ( constant_expr )? ']'
            {
            char_literal71=(Token)match(input,119,FOLLOW_119_in_type_suffix1322); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal71_tree = 
            (CommonTree)adaptor.create(char_literal71)
            ;
            adaptor.addChild(root_0, char_literal71_tree);
            }

            // CPPGrammar.g:153:19: ( constant_expr )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ALPHA_NUMERIC||LA22_0==DECIMAL_LITERAL||LA22_0==FLOATING_POINT_LITERAL||LA22_0==HEX_LITERAL||LA22_0==OCTAL_LITERAL||LA22_0==STRING||LA22_0==83||LA22_0==90||LA22_0==92||LA22_0==94||(LA22_0 >= 96 && LA22_0 <= 97)||(LA22_0 >= 100 && LA22_0 <= 101)||LA22_0==167) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // CPPGrammar.g:153:19: constant_expr
                    {
                    pushFollow(FOLLOW_constant_expr_in_type_suffix1324);
                    constant_expr72=constant_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expr72.getTree());

                    }
                    break;

            }


            char_literal73=(Token)match(input,120,FOLLOW_120_in_type_suffix1327); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal73_tree = 
            (CommonTree)adaptor.create(char_literal73)
            ;
            adaptor.addChild(root_0, char_literal73_tree);
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_suffix"


    public static class function_def__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_def_"
    // CPPGrammar.g:157:1: function_def_ : ( function_start function_param_list ) ( ctor_list compound_statement -> function_start function_param_list ^( CTOR_LIST ctor_list ) compound_statement | compound_statement -> function_start function_param_list compound_statement ) ;
    public final CPPGrammarParser.function_def__return function_def_() throws RecognitionException {
        CPPGrammarParser.function_def__return retval = new CPPGrammarParser.function_def__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_start_return function_start74 =null;

        CPPGrammarParser.function_param_list_return function_param_list75 =null;

        CPPGrammarParser.ctor_list_return ctor_list76 =null;

        CPPGrammarParser.compound_statement_return compound_statement77 =null;

        CPPGrammarParser.compound_statement_return compound_statement78 =null;


        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        RewriteRuleSubtreeStream stream_ctor_list=new RewriteRuleSubtreeStream(adaptor,"rule ctor_list");
        RewriteRuleSubtreeStream stream_function_param_list=new RewriteRuleSubtreeStream(adaptor,"rule function_param_list");
        RewriteRuleSubtreeStream stream_function_start=new RewriteRuleSubtreeStream(adaptor,"rule function_start");
        try {
            // CPPGrammar.g:157:15: ( ( function_start function_param_list ) ( ctor_list compound_statement -> function_start function_param_list ^( CTOR_LIST ctor_list ) compound_statement | compound_statement -> function_start function_param_list compound_statement ) )
            // CPPGrammar.g:157:17: ( function_start function_param_list ) ( ctor_list compound_statement -> function_start function_param_list ^( CTOR_LIST ctor_list ) compound_statement | compound_statement -> function_start function_param_list compound_statement )
            {
            // CPPGrammar.g:157:17: ( function_start function_param_list )
            // CPPGrammar.g:157:18: function_start function_param_list
            {
            pushFollow(FOLLOW_function_start_in_function_def_1344);
            function_start74=function_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_start.add(function_start74.getTree());

            pushFollow(FOLLOW_function_param_list_in_function_def_1346);
            function_param_list75=function_param_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_param_list.add(function_param_list75.getTree());

            }


            // CPPGrammar.g:158:9: ( ctor_list compound_statement -> function_start function_param_list ^( CTOR_LIST ctor_list ) compound_statement | compound_statement -> function_start function_param_list compound_statement )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==COLON) ) {
                alt23=1;
            }
            else if ( (LA23_0==162) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // CPPGrammar.g:158:11: ctor_list compound_statement
                    {
                    pushFollow(FOLLOW_ctor_list_in_function_def_1359);
                    ctor_list76=ctor_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctor_list.add(ctor_list76.getTree());

                    pushFollow(FOLLOW_compound_statement_in_function_def_1361);
                    compound_statement77=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement77.getTree());

                    // AST REWRITE
                    // elements: compound_statement, function_start, ctor_list, function_param_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 158:40: -> function_start function_param_list ^( CTOR_LIST ctor_list ) compound_statement
                    {
                        adaptor.addChild(root_0, stream_function_start.nextTree());

                        adaptor.addChild(root_0, stream_function_param_list.nextTree());

                        // CPPGrammar.g:158:78: ^( CTOR_LIST ctor_list )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CTOR_LIST, "CTOR_LIST")
                        , root_1);

                        adaptor.addChild(root_1, stream_ctor_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_compound_statement.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:159:11: compound_statement
                    {
                    pushFollow(FOLLOW_compound_statement_in_function_def_1387);
                    compound_statement78=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement78.getTree());

                    // AST REWRITE
                    // elements: function_start, function_param_list, compound_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 159:30: -> function_start function_param_list compound_statement
                    {
                        adaptor.addChild(root_0, stream_function_start.nextTree());

                        adaptor.addChild(root_0, stream_function_param_list.nextTree());

                        adaptor.addChild(root_0, stream_compound_statement.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_def_"


    public static class function_start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_start"
    // CPPGrammar.g:161:1: function_start : ( template_declaration_start return_type function_name -> ^( TEMPLATE_DECL_SPECIFIER template_declaration_start ) return_type function_name | return_type function_name -> return_type function_name );
    public final CPPGrammarParser.function_start_return function_start() throws RecognitionException {
        CPPGrammarParser.function_start_return retval = new CPPGrammarParser.function_start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.template_declaration_start_return template_declaration_start79 =null;

        CPPGrammarParser.return_type_return return_type80 =null;

        CPPGrammarParser.function_name_return function_name81 =null;

        CPPGrammarParser.return_type_return return_type82 =null;

        CPPGrammarParser.function_name_return function_name83 =null;


        RewriteRuleSubtreeStream stream_return_type=new RewriteRuleSubtreeStream(adaptor,"rule return_type");
        RewriteRuleSubtreeStream stream_function_name=new RewriteRuleSubtreeStream(adaptor,"rule function_name");
        RewriteRuleSubtreeStream stream_template_declaration_start=new RewriteRuleSubtreeStream(adaptor,"rule template_declaration_start");
        try {
            // CPPGrammar.g:161:15: ( template_declaration_start return_type function_name -> ^( TEMPLATE_DECL_SPECIFIER template_declaration_start ) return_type function_name | return_type function_name -> return_type function_name )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==152) ) {
                alt24=1;
            }
            else if ( (LA24_0==ALPHA_NUMERIC||LA24_0==90||LA24_0==92||LA24_0==94||(LA24_0 >= 127 && LA24_0 <= 128)||(LA24_0 >= 133 && LA24_0 <= 134)||LA24_0==136||LA24_0==139||LA24_0==142||(LA24_0 >= 148 && LA24_0 <= 150)||(LA24_0 >= 156 && LA24_0 <= 157)||(LA24_0 >= 159 && LA24_0 <= 160)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // CPPGrammar.g:161:17: template_declaration_start return_type function_name
                    {
                    pushFollow(FOLLOW_template_declaration_start_in_function_start1403);
                    template_declaration_start79=template_declaration_start();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_template_declaration_start.add(template_declaration_start79.getTree());

                    pushFollow(FOLLOW_return_type_in_function_start1405);
                    return_type80=return_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_return_type.add(return_type80.getTree());

                    pushFollow(FOLLOW_function_name_in_function_start1407);
                    function_name81=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_name.add(function_name81.getTree());

                    // AST REWRITE
                    // elements: return_type, function_name, template_declaration_start
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 161:70: -> ^( TEMPLATE_DECL_SPECIFIER template_declaration_start ) return_type function_name
                    {
                        // CPPGrammar.g:161:73: ^( TEMPLATE_DECL_SPECIFIER template_declaration_start )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(TEMPLATE_DECL_SPECIFIER, "TEMPLATE_DECL_SPECIFIER")
                        , root_1);

                        adaptor.addChild(root_1, stream_template_declaration_start.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_return_type.nextTree());

                        adaptor.addChild(root_0, stream_function_name.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:162:7: return_type function_name
                    {
                    pushFollow(FOLLOW_return_type_in_function_start1427);
                    return_type82=return_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_return_type.add(return_type82.getTree());

                    pushFollow(FOLLOW_function_name_in_function_start1429);
                    function_name83=function_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_name.add(function_name83.getTree());

                    // AST REWRITE
                    // elements: function_name, return_type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 162:33: -> return_type function_name
                    {
                        adaptor.addChild(root_0, stream_return_type.nextTree());

                        adaptor.addChild(root_0, stream_function_name.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_start"


    public static class return_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_type"
    // CPPGrammar.g:165:1: return_type : return_type_ -> ^( RETURN_TYPE ( return_type_ )? ) ;
    public final CPPGrammarParser.return_type_return return_type() throws RecognitionException {
        CPPGrammarParser.return_type_return retval = new CPPGrammarParser.return_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.return_type__return return_type_84 =null;


        RewriteRuleSubtreeStream stream_return_type_=new RewriteRuleSubtreeStream(adaptor,"rule return_type_");
        try {
            // CPPGrammar.g:165:12: ( return_type_ -> ^( RETURN_TYPE ( return_type_ )? ) )
            // CPPGrammar.g:165:14: return_type_
            {
            pushFollow(FOLLOW_return_type__in_return_type1455);
            return_type_84=return_type_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_return_type_.add(return_type_84.getTree());

            // AST REWRITE
            // elements: return_type_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 165:27: -> ^( RETURN_TYPE ( return_type_ )? )
            {
                // CPPGrammar.g:165:30: ^( RETURN_TYPE ( return_type_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(RETURN_TYPE, "RETURN_TYPE")
                , root_1);

                // CPPGrammar.g:165:44: ( return_type_ )?
                if ( stream_return_type_.hasNext() ) {
                    adaptor.addChild(root_1, stream_return_type_.nextTree());

                }
                stream_return_type_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_type"


    public static class return_type__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_type_"
    // CPPGrammar.g:166:1: return_type_ : ( ( function_decl_specifiers )* type_name )? ( function_decl_specifiers )* ( ptr_operator )* ;
    public final CPPGrammarParser.return_type__return return_type_() throws RecognitionException {
        CPPGrammarParser.return_type__return retval = new CPPGrammarParser.return_type__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_decl_specifiers_return function_decl_specifiers85 =null;

        CPPGrammarParser.type_name_return type_name86 =null;

        CPPGrammarParser.function_decl_specifiers_return function_decl_specifiers87 =null;

        CPPGrammarParser.ptr_operator_return ptr_operator88 =null;



        try {
            // CPPGrammar.g:166:13: ( ( ( function_decl_specifiers )* type_name )? ( function_decl_specifiers )* ( ptr_operator )* )
            // CPPGrammar.g:166:15: ( ( function_decl_specifiers )* type_name )? ( function_decl_specifiers )* ( ptr_operator )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:166:15: ( ( function_decl_specifiers )* type_name )?
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // CPPGrammar.g:166:16: ( function_decl_specifiers )* type_name
                    {
                    // CPPGrammar.g:166:16: ( function_decl_specifiers )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==134||LA25_0==136||LA25_0==139||LA25_0==149||LA25_0==159) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // CPPGrammar.g:166:16: function_decl_specifiers
                    	    {
                    	    pushFollow(FOLLOW_function_decl_specifiers_in_return_type_1471);
                    	    function_decl_specifiers85=function_decl_specifiers();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_decl_specifiers85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    pushFollow(FOLLOW_type_name_in_return_type_1474);
                    type_name86=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name86.getTree());

                    }
                    break;

            }


            // CPPGrammar.g:166:54: ( function_decl_specifiers )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==134||LA27_0==136||LA27_0==139||LA27_0==149||LA27_0==159) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // CPPGrammar.g:166:54: function_decl_specifiers
            	    {
            	    pushFollow(FOLLOW_function_decl_specifiers_in_return_type_1478);
            	    function_decl_specifiers87=function_decl_specifiers();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_decl_specifiers87.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // CPPGrammar.g:166:80: ( ptr_operator )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==90||LA28_0==94) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // CPPGrammar.g:166:80: ptr_operator
            	    {
            	    pushFollow(FOLLOW_ptr_operator_in_return_type_1481);
            	    ptr_operator88=ptr_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptr_operator88.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_type_"


    public static class function_name__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_name_"
    // CPPGrammar.g:168:1: function_name_ : ( '(' function_name_ ')' | identifier | operator_function_id );
    public final CPPGrammarParser.function_name__return function_name_() throws RecognitionException {
        CPPGrammarParser.function_name__return retval = new CPPGrammarParser.function_name__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal89=null;
        Token char_literal91=null;
        CPPGrammarParser.function_name__return function_name_90 =null;

        CPPGrammarParser.identifier_return identifier92 =null;

        CPPGrammarParser.operator_function_id_return operator_function_id93 =null;


        CommonTree char_literal89_tree=null;
        CommonTree char_literal91_tree=null;

        try {
            // CPPGrammar.g:168:15: ( '(' function_name_ ')' | identifier | operator_function_id )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt29=1;
                }
                break;
            case ALPHA_NUMERIC:
                {
                alt29=2;
                }
                break;
            case 142:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // CPPGrammar.g:168:17: '(' function_name_ ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal89=(Token)match(input,92,FOLLOW_92_in_function_name_1489); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal89_tree = 
                    (CommonTree)adaptor.create(char_literal89)
                    ;
                    adaptor.addChild(root_0, char_literal89_tree);
                    }

                    pushFollow(FOLLOW_function_name__in_function_name_1491);
                    function_name_90=function_name_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_name_90.getTree());

                    char_literal91=(Token)match(input,93,FOLLOW_93_in_function_name_1493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal91_tree = 
                    (CommonTree)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:168:42: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_function_name_1497);
                    identifier92=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier92.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:168:55: operator_function_id
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_operator_function_id_in_function_name_1501);
                    operator_function_id93=operator_function_id();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, operator_function_id93.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_name_"


    public static class function_param_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_param_list"
    // CPPGrammar.g:169:1: function_param_list : o= '(' ( parameter_declaration_clause )? c= ')' ( cv_qualifier )* ( exception_specification )? -> ^( PARAMETER_LIST $o ( parameter_declaration_clause )? $c) ;
    public final CPPGrammarParser.function_param_list_return function_param_list() throws RecognitionException {
        CPPGrammarParser.function_param_list_return retval = new CPPGrammarParser.function_param_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token o=null;
        Token c=null;
        CPPGrammarParser.parameter_declaration_clause_return parameter_declaration_clause94 =null;

        CPPGrammarParser.cv_qualifier_return cv_qualifier95 =null;

        CPPGrammarParser.exception_specification_return exception_specification96 =null;


        CommonTree o_tree=null;
        CommonTree c_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_cv_qualifier=new RewriteRuleSubtreeStream(adaptor,"rule cv_qualifier");
        RewriteRuleSubtreeStream stream_exception_specification=new RewriteRuleSubtreeStream(adaptor,"rule exception_specification");
        RewriteRuleSubtreeStream stream_parameter_declaration_clause=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration_clause");
        try {
            // CPPGrammar.g:169:21: (o= '(' ( parameter_declaration_clause )? c= ')' ( cv_qualifier )* ( exception_specification )? -> ^( PARAMETER_LIST $o ( parameter_declaration_clause )? $c) )
            // CPPGrammar.g:169:23: o= '(' ( parameter_declaration_clause )? c= ')' ( cv_qualifier )* ( exception_specification )?
            {
            o=(Token)match(input,92,FOLLOW_92_in_function_param_list1510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(o);


            // CPPGrammar.g:169:29: ( parameter_declaration_clause )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ALPHA_NUMERIC||LA30_0==123||(LA30_0 >= 127 && LA30_0 <= 128)||LA30_0==133||LA30_0==146||LA30_0==148||LA30_0==150||(LA30_0 >= 156 && LA30_0 <= 157)||LA30_0==160) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // CPPGrammar.g:169:29: parameter_declaration_clause
                    {
                    pushFollow(FOLLOW_parameter_declaration_clause_in_function_param_list1512);
                    parameter_declaration_clause94=parameter_declaration_clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_declaration_clause.add(parameter_declaration_clause94.getTree());

                    }
                    break;

            }


            c=(Token)match(input,93,FOLLOW_93_in_function_param_list1517); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(c);


            // CPPGrammar.g:169:65: ( cv_qualifier )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==128||LA31_0==160) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // CPPGrammar.g:169:65: cv_qualifier
            	    {
            	    pushFollow(FOLLOW_cv_qualifier_in_function_param_list1519);
            	    cv_qualifier95=cv_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_cv_qualifier.add(cv_qualifier95.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // CPPGrammar.g:169:79: ( exception_specification )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==153) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // CPPGrammar.g:169:79: exception_specification
                    {
                    pushFollow(FOLLOW_exception_specification_in_function_param_list1522);
                    exception_specification96=exception_specification();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_exception_specification.add(exception_specification96.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: c, o, parameter_declaration_clause
            // token labels: c, o
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
            RewriteRuleTokenStream stream_o=new RewriteRuleTokenStream(adaptor,"token o",o);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 169:104: -> ^( PARAMETER_LIST $o ( parameter_declaration_clause )? $c)
            {
                // CPPGrammar.g:170:21: ^( PARAMETER_LIST $o ( parameter_declaration_clause )? $c)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMETER_LIST, "PARAMETER_LIST")
                , root_1);

                adaptor.addChild(root_1, stream_o.nextNode());

                // CPPGrammar.g:170:42: ( parameter_declaration_clause )?
                if ( stream_parameter_declaration_clause.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declaration_clause.nextTree());

                }
                stream_parameter_declaration_clause.reset();

                adaptor.addChild(root_1, stream_c.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_param_list"


    public static class exception_specification_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exception_specification"
    // CPPGrammar.g:172:1: exception_specification : 'throw' '(' type_id_list ')' ;
    public final CPPGrammarParser.exception_specification_return exception_specification() throws RecognitionException {
        CPPGrammarParser.exception_specification_return retval = new CPPGrammarParser.exception_specification_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal97=null;
        Token char_literal98=null;
        Token char_literal100=null;
        CPPGrammarParser.type_id_list_return type_id_list99 =null;


        CommonTree string_literal97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal100_tree=null;

        try {
            // CPPGrammar.g:172:25: ( 'throw' '(' type_id_list ')' )
            // CPPGrammar.g:172:27: 'throw' '(' type_id_list ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal97=(Token)match(input,153,FOLLOW_153_in_exception_specification1567); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal97_tree = 
            (CommonTree)adaptor.create(string_literal97)
            ;
            adaptor.addChild(root_0, string_literal97_tree);
            }

            char_literal98=(Token)match(input,92,FOLLOW_92_in_exception_specification1569); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal98_tree = 
            (CommonTree)adaptor.create(char_literal98)
            ;
            adaptor.addChild(root_0, char_literal98_tree);
            }

            pushFollow(FOLLOW_type_id_list_in_exception_specification1571);
            type_id_list99=type_id_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_id_list99.getTree());

            char_literal100=(Token)match(input,93,FOLLOW_93_in_exception_specification1573); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal100_tree = 
            (CommonTree)adaptor.create(char_literal100)
            ;
            adaptor.addChild(root_0, char_literal100_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exception_specification"


    public static class ctor_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctor_list"
    // CPPGrammar.g:174:1: ctor_list : ':' ctor_initializer ( ',' ctor_initializer )* -> ( ctor_initializer )+ ;
    public final CPPGrammarParser.ctor_list_return ctor_list() throws RecognitionException {
        CPPGrammarParser.ctor_list_return retval = new CPPGrammarParser.ctor_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal101=null;
        Token char_literal103=null;
        CPPGrammarParser.ctor_initializer_return ctor_initializer102 =null;

        CPPGrammarParser.ctor_initializer_return ctor_initializer104 =null;


        CommonTree char_literal101_tree=null;
        CommonTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_ctor_initializer=new RewriteRuleSubtreeStream(adaptor,"rule ctor_initializer");
        try {
            // CPPGrammar.g:174:10: ( ':' ctor_initializer ( ',' ctor_initializer )* -> ( ctor_initializer )+ )
            // CPPGrammar.g:174:12: ':' ctor_initializer ( ',' ctor_initializer )*
            {
            char_literal101=(Token)match(input,COLON,FOLLOW_COLON_in_ctor_list1580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON.add(char_literal101);


            pushFollow(FOLLOW_ctor_initializer_in_ctor_list1583);
            ctor_initializer102=ctor_initializer();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ctor_initializer.add(ctor_initializer102.getTree());

            // CPPGrammar.g:174:34: ( ',' ctor_initializer )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==99) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // CPPGrammar.g:174:35: ',' ctor_initializer
            	    {
            	    char_literal103=(Token)match(input,99,FOLLOW_99_in_ctor_list1586); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_99.add(char_literal103);


            	    pushFollow(FOLLOW_ctor_initializer_in_ctor_list1588);
            	    ctor_initializer104=ctor_initializer();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ctor_initializer.add(ctor_initializer104.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // AST REWRITE
            // elements: ctor_initializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 174:58: -> ( ctor_initializer )+
            {
                if ( !(stream_ctor_initializer.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ctor_initializer.hasNext() ) {
                    adaptor.addChild(root_0, stream_ctor_initializer.nextTree());

                }
                stream_ctor_initializer.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctor_list"


    public static class ctor_initializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ctor_initializer"
    // CPPGrammar.g:175:1: ctor_initializer : ( '::' )? identifier '(' ( expr )? ')' -> ^( CTOR_INITIALIZER ^( INITIALIZER_ID ( '::' )? identifier ) ^( CTOR_EXPR ( expr )? ) ) ;
    public final CPPGrammarParser.ctor_initializer_return ctor_initializer() throws RecognitionException {
        CPPGrammarParser.ctor_initializer_return retval = new CPPGrammarParser.ctor_initializer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal105=null;
        Token char_literal107=null;
        Token char_literal109=null;
        CPPGrammarParser.identifier_return identifier106 =null;

        CPPGrammarParser.expr_return expr108 =null;


        CommonTree string_literal105_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree char_literal109_tree=null;
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:175:17: ( ( '::' )? identifier '(' ( expr )? ')' -> ^( CTOR_INITIALIZER ^( INITIALIZER_ID ( '::' )? identifier ) ^( CTOR_EXPR ( expr )? ) ) )
            // CPPGrammar.g:175:20: ( '::' )? identifier '(' ( expr )? ')'
            {
            // CPPGrammar.g:175:20: ( '::' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==107) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // CPPGrammar.g:175:20: '::'
                    {
                    string_literal105=(Token)match(input,107,FOLLOW_107_in_ctor_initializer1602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_107.add(string_literal105);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_ctor_initializer1605);
            identifier106=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier106.getTree());

            char_literal107=(Token)match(input,92,FOLLOW_92_in_ctor_initializer1607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal107);


            // CPPGrammar.g:175:41: ( expr )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ALPHA_NUMERIC||LA35_0==DECIMAL_LITERAL||LA35_0==FLOATING_POINT_LITERAL||LA35_0==HEX_LITERAL||LA35_0==OCTAL_LITERAL||LA35_0==STRING||LA35_0==83||LA35_0==90||LA35_0==92||LA35_0==94||(LA35_0 >= 96 && LA35_0 <= 97)||(LA35_0 >= 100 && LA35_0 <= 101)||LA35_0==167) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // CPPGrammar.g:175:41: expr
                    {
                    pushFollow(FOLLOW_expr_in_ctor_initializer1609);
                    expr108=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr108.getTree());

                    }
                    break;

            }


            char_literal109=(Token)match(input,93,FOLLOW_93_in_ctor_initializer1612); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal109);


            // AST REWRITE
            // elements: 107, expr, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 175:51: -> ^( CTOR_INITIALIZER ^( INITIALIZER_ID ( '::' )? identifier ) ^( CTOR_EXPR ( expr )? ) )
            {
                // CPPGrammar.g:175:54: ^( CTOR_INITIALIZER ^( INITIALIZER_ID ( '::' )? identifier ) ^( CTOR_EXPR ( expr )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CTOR_INITIALIZER, "CTOR_INITIALIZER")
                , root_1);

                // CPPGrammar.g:175:73: ^( INITIALIZER_ID ( '::' )? identifier )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INITIALIZER_ID, "INITIALIZER_ID")
                , root_2);

                // CPPGrammar.g:175:90: ( '::' )?
                if ( stream_107.hasNext() ) {
                    adaptor.addChild(root_2, 
                    stream_107.nextNode()
                    );

                }
                stream_107.reset();

                adaptor.addChild(root_2, stream_identifier.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                // CPPGrammar.g:175:108: ^( CTOR_EXPR ( expr )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CTOR_EXPR, "CTOR_EXPR")
                , root_2);

                // CPPGrammar.g:175:120: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ctor_initializer"


    public static class parameter_declaration_clause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_declaration_clause"
    // CPPGrammar.g:177:1: parameter_declaration_clause : parameter_decl ( ',' parameter_decl )* ;
    public final CPPGrammarParser.parameter_declaration_clause_return parameter_declaration_clause() throws RecognitionException {
        CPPGrammarParser.parameter_declaration_clause_return retval = new CPPGrammarParser.parameter_declaration_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal111=null;
        CPPGrammarParser.parameter_decl_return parameter_decl110 =null;

        CPPGrammarParser.parameter_decl_return parameter_decl112 =null;


        CommonTree char_literal111_tree=null;

        try {
            // CPPGrammar.g:177:29: ( parameter_decl ( ',' parameter_decl )* )
            // CPPGrammar.g:177:31: parameter_decl ( ',' parameter_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_parameter_decl_in_parameter_declaration_clause1642);
            parameter_decl110=parameter_decl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_decl110.getTree());

            // CPPGrammar.g:177:46: ( ',' parameter_decl )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==99) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // CPPGrammar.g:177:47: ',' parameter_decl
            	    {
            	    char_literal111=(Token)match(input,99,FOLLOW_99_in_parameter_declaration_clause1645); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal111_tree = 
            	    (CommonTree)adaptor.create(char_literal111)
            	    ;
            	    adaptor.addChild(root_0, char_literal111_tree);
            	    }

            	    pushFollow(FOLLOW_parameter_decl_in_parameter_declaration_clause1647);
            	    parameter_decl112=parameter_decl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_decl112.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_declaration_clause"


    protected static class parameter_decl__scope {
        CommonTree type_suffix;
    }
    protected Stack parameter_decl__stack = new Stack();


    public static class parameter_decl__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_decl_"
    // CPPGrammar.g:179:1: parameter_decl_ : ( param_decl_specifiers ( ( ( ptr_operator )+ parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ) parameter_name -> ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) ) parameter_name ) | ( parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ) parameter_name -> ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) ) parameter_name ) ) | identifier );
    public final CPPGrammarParser.parameter_decl__return parameter_decl_() throws RecognitionException {
        parameter_decl__stack.push(new parameter_decl__scope());
        CPPGrammarParser.parameter_decl__return retval = new CPPGrammarParser.parameter_decl__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.param_decl_specifiers_return param_decl_specifiers113 =null;

        CPPGrammarParser.ptr_operator_return ptr_operator114 =null;

        CPPGrammarParser.parameter_name_return parameter_name115 =null;

        CPPGrammarParser.parameter_name_return parameter_name116 =null;

        CPPGrammarParser.identifier_return identifier117 =null;


        RewriteRuleSubtreeStream stream_ptr_operator=new RewriteRuleSubtreeStream(adaptor,"rule ptr_operator");
        RewriteRuleSubtreeStream stream_param_decl_specifiers=new RewriteRuleSubtreeStream(adaptor,"rule param_decl_specifiers");
        RewriteRuleSubtreeStream stream_parameter_name=new RewriteRuleSubtreeStream(adaptor,"rule parameter_name");
        try {
            // CPPGrammar.g:181:1: ( param_decl_specifiers ( ( ( ptr_operator )+ parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ) parameter_name -> ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) ) parameter_name ) | ( parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ) parameter_name -> ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) ) parameter_name ) ) | identifier )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // CPPGrammar.g:182:1: param_decl_specifiers ( ( ( ptr_operator )+ parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ) parameter_name -> ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) ) parameter_name ) | ( parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ) parameter_name -> ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) ) parameter_name ) )
                    {
                    pushFollow(FOLLOW_param_decl_specifiers_in_parameter_decl_1660);
                    param_decl_specifiers113=param_decl_specifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_param_decl_specifiers.add(param_decl_specifiers113.getTree());

                    // CPPGrammar.g:183:9: ( ( ( ptr_operator )+ parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ) parameter_name -> ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) ) parameter_name ) | ( parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ) parameter_name -> ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) ) parameter_name ) )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==90||LA38_0==94) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==ALPHA_NUMERIC||LA38_0==92) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;

                    }
                    switch (alt38) {
                        case 1 :
                            // CPPGrammar.g:183:11: ( ( ptr_operator )+ parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ) parameter_name -> ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) ) parameter_name )
                            {
                            // CPPGrammar.g:183:11: ( ( ptr_operator )+ parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ) parameter_name -> ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) ) parameter_name )
                            // CPPGrammar.g:183:12: ( ptr_operator )+ parameter_name
                            {
                            // CPPGrammar.g:183:12: ( ptr_operator )+
                            int cnt37=0;
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( (LA37_0==90||LA37_0==94) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // CPPGrammar.g:183:12: ptr_operator
                            	    {
                            	    pushFollow(FOLLOW_ptr_operator_in_parameter_decl_1673);
                            	    ptr_operator114=ptr_operator();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_ptr_operator.add(ptr_operator114.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt37 >= 1 ) break loop37;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(37, input);
                                        throw eee;
                                }
                                cnt37++;
                            } while (true);


                            pushFollow(FOLLOW_parameter_name_in_parameter_decl_1676);
                            parameter_name115=parameter_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_name.add(parameter_name115.getTree());

                            // AST REWRITE
                            // elements: ptr_operator, ptr_operator, param_decl_specifiers, param_decl_specifiers, parameter_name, parameter_name
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 183:41: -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ) parameter_name
                            if (((parameter_decl__scope)parameter_decl__stack.peek()).type_suffix == null) {
                                // CPPGrammar.g:183:86: ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                (CommonTree)adaptor.create(TYPE, "TYPE")
                                , root_1);

                                adaptor.addChild(root_1, stream_param_decl_specifiers.nextTree());

                                // CPPGrammar.g:183:115: ^( POINTER ( ptr_operator )+ )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot(
                                (CommonTree)adaptor.create(POINTER, "POINTER")
                                , root_2);

                                if ( !(stream_ptr_operator.hasNext()) ) {
                                    throw new RewriteEarlyExitException();
                                }
                                while ( stream_ptr_operator.hasNext() ) {
                                    adaptor.addChild(root_2, stream_ptr_operator.nextTree());

                                }
                                stream_ptr_operator.reset();

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                                adaptor.addChild(root_0, stream_parameter_name.nextTree());

                            }

                            else // 184:41: -> ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) ) parameter_name
                            {
                                // CPPGrammar.g:184:44: ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                (CommonTree)adaptor.create(TYPE, "TYPE")
                                , root_1);

                                adaptor.addChild(root_1, stream_param_decl_specifiers.nextTree());

                                // CPPGrammar.g:184:73: ^( POINTER ( ptr_operator )+ )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot(
                                (CommonTree)adaptor.create(POINTER, "POINTER")
                                , root_2);

                                if ( !(stream_ptr_operator.hasNext()) ) {
                                    throw new RewriteEarlyExitException();
                                }
                                while ( stream_ptr_operator.hasNext() ) {
                                    adaptor.addChild(root_2, stream_ptr_operator.nextTree());

                                }
                                stream_ptr_operator.reset();

                                adaptor.addChild(root_1, root_2);
                                }

                                // CPPGrammar.g:184:98: ^( TYPE_SUFFIX )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot(
                                (CommonTree)adaptor.create(TYPE_SUFFIX, "TYPE_SUFFIX")
                                , root_2);

                                adaptor.addChild(root_2, ((parameter_decl__scope)parameter_decl__stack.peek()).type_suffix);

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                                adaptor.addChild(root_0, stream_parameter_name.nextTree());

                            }


                            retval.tree = root_0;
                            }

                            }


                            }
                            break;
                        case 2 :
                            // CPPGrammar.g:185:11: ( parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ) parameter_name -> ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) ) parameter_name )
                            {
                            // CPPGrammar.g:185:11: ( parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ) parameter_name -> ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) ) parameter_name )
                            // CPPGrammar.g:185:12: parameter_name
                            {
                            pushFollow(FOLLOW_parameter_name_in_parameter_decl_1773);
                            parameter_name116=parameter_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_name.add(parameter_name116.getTree());

                            // AST REWRITE
                            // elements: parameter_name, param_decl_specifiers, parameter_name, param_decl_specifiers
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {

                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 185:27: -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ) parameter_name
                            if (((parameter_decl__scope)parameter_decl__stack.peek()).type_suffix == null) {
                                // CPPGrammar.g:185:71: ^( TYPE param_decl_specifiers )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                (CommonTree)adaptor.create(TYPE, "TYPE")
                                , root_1);

                                adaptor.addChild(root_1, stream_param_decl_specifiers.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                                adaptor.addChild(root_0, stream_parameter_name.nextTree());

                            }

                            else // 186:27: -> ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) ) parameter_name
                            {
                                // CPPGrammar.g:186:30: ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot(
                                (CommonTree)adaptor.create(TYPE, "TYPE")
                                , root_1);

                                adaptor.addChild(root_1, stream_param_decl_specifiers.nextTree());

                                // CPPGrammar.g:186:59: ^( TYPE_SUFFIX )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot(
                                (CommonTree)adaptor.create(TYPE_SUFFIX, "TYPE_SUFFIX")
                                , root_2);

                                adaptor.addChild(root_2, ((parameter_decl__scope)parameter_decl__stack.peek()).type_suffix);

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                                adaptor.addChild(root_0, stream_parameter_name.nextTree());

                            }


                            retval.tree = root_0;
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:187:11: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_parameter_decl_1841);
                    identifier117=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier117.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            parameter_decl__stack.pop();
        }
        return retval;
    }
    // $ANTLR end "parameter_decl_"


    public static class parameter_name__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_name_"
    // CPPGrammar.g:190:1: parameter_name_ : x= parameter_name_start (s= type_suffix )? -> $x;
    public final CPPGrammarParser.parameter_name__return parameter_name_() throws RecognitionException {
        CPPGrammarParser.parameter_name__return retval = new CPPGrammarParser.parameter_name__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.parameter_name_start_return x =null;

        CPPGrammarParser.type_suffix_return s =null;


        RewriteRuleSubtreeStream stream_parameter_name_start=new RewriteRuleSubtreeStream(adaptor,"rule parameter_name_start");
        RewriteRuleSubtreeStream stream_type_suffix=new RewriteRuleSubtreeStream(adaptor,"rule type_suffix");
        try {
            // CPPGrammar.g:190:16: (x= parameter_name_start (s= type_suffix )? -> $x)
            // CPPGrammar.g:190:18: x= parameter_name_start (s= type_suffix )?
            {
            pushFollow(FOLLOW_parameter_name_start_in_parameter_name_1852);
            x=parameter_name_start();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter_name_start.add(x.getTree());

            // CPPGrammar.g:190:42: (s= type_suffix )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==119) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // CPPGrammar.g:190:42: s= type_suffix
                    {
                    pushFollow(FOLLOW_type_suffix_in_parameter_name_1856);
                    s=type_suffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type_suffix.add(s.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {if(s != null) ((parameter_decl__scope)parameter_decl__stack.peek()).type_suffix = (CommonTree) s.getTree();}

            // AST REWRITE
            // elements: x
            // token labels: 
            // rule labels: x, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 191:75: -> $x
            {
                adaptor.addChild(root_0, stream_x.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_name_"


    public static class parameter_name_start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_name_start"
    // CPPGrammar.g:194:1: parameter_name_start : ( '(' parameter_name_ ')' | identifier ) ;
    public final CPPGrammarParser.parameter_name_start_return parameter_name_start() throws RecognitionException {
        CPPGrammarParser.parameter_name_start_return retval = new CPPGrammarParser.parameter_name_start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal118=null;
        Token char_literal120=null;
        CPPGrammarParser.parameter_name__return parameter_name_119 =null;

        CPPGrammarParser.identifier_return identifier121 =null;


        CommonTree char_literal118_tree=null;
        CommonTree char_literal120_tree=null;

        try {
            // CPPGrammar.g:194:21: ( ( '(' parameter_name_ ')' | identifier ) )
            // CPPGrammar.g:194:23: ( '(' parameter_name_ ')' | identifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:194:23: ( '(' parameter_name_ ')' | identifier )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==92) ) {
                alt41=1;
            }
            else if ( (LA41_0==ALPHA_NUMERIC) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // CPPGrammar.g:194:24: '(' parameter_name_ ')'
                    {
                    char_literal118=(Token)match(input,92,FOLLOW_92_in_parameter_name_start1873); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal118_tree = 
                    (CommonTree)adaptor.create(char_literal118)
                    ;
                    adaptor.addChild(root_0, char_literal118_tree);
                    }

                    pushFollow(FOLLOW_parameter_name__in_parameter_name_start1875);
                    parameter_name_119=parameter_name_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_name_119.getTree());

                    char_literal120=(Token)match(input,93,FOLLOW_93_in_parameter_name_start1877); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal120_tree = 
                    (CommonTree)adaptor.create(char_literal120)
                    ;
                    adaptor.addChild(root_0, char_literal120_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:194:50: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_parameter_name_start1881);
                    identifier121=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier121.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_name_start"


    public static class param_decl_specifiers_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_decl_specifiers"
    // CPPGrammar.g:195:1: param_decl_specifiers : ( 'auto' | 'register' )? type_name ;
    public final CPPGrammarParser.param_decl_specifiers_return param_decl_specifiers() throws RecognitionException {
        CPPGrammarParser.param_decl_specifiers_return retval = new CPPGrammarParser.param_decl_specifiers_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set122=null;
        CPPGrammarParser.type_name_return type_name123 =null;


        CommonTree set122_tree=null;

        try {
            // CPPGrammar.g:195:22: ( ( 'auto' | 'register' )? type_name )
            // CPPGrammar.g:195:24: ( 'auto' | 'register' )? type_name
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:195:24: ( 'auto' | 'register' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==123||LA42_0==146) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // CPPGrammar.g:
                    {
                    set122=(Token)input.LT(1);

                    if ( input.LA(1)==123||input.LA(1)==146 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set122)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            pushFollow(FOLLOW_type_name_in_param_decl_specifiers1897);
            type_name123=type_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name123.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param_decl_specifiers"


    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // CPPGrammar.g:199:1: statement : ( compound_statement | non_compound_statement );
    public final CPPGrammarParser.statement_return statement() throws RecognitionException {
        CPPGrammarParser.statement_return retval = new CPPGrammarParser.statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.compound_statement_return compound_statement124 =null;

        CPPGrammarParser.non_compound_statement_return non_compound_statement125 =null;



        try {
            // CPPGrammar.g:199:10: ( compound_statement | non_compound_statement )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==162) ) {
                alt43=1;
            }
            else if ( ((LA43_0 >= ALPHA_NUMERIC && LA43_0 <= 106)||(LA43_0 >= 108 && LA43_0 <= 161)||(LA43_0 >= 163 && LA43_0 <= 165)||LA43_0==167) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }
            switch (alt43) {
                case 1 :
                    // CPPGrammar.g:199:12: compound_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_compound_statement_in_statement1906);
                    compound_statement124=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement124.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:200:12: non_compound_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_non_compound_statement_in_statement1919);
                    non_compound_statement125=non_compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, non_compound_statement125.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class compound_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compound_statement"
    // CPPGrammar.g:203:1: compound_statement : '{' ( statement )* '}' -> '{' ^( STATEMENTS ( statement )* ) '}' ;
    public final CPPGrammarParser.compound_statement_return compound_statement() throws RecognitionException {
        CPPGrammarParser.compound_statement_return retval = new CPPGrammarParser.compound_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal126=null;
        Token char_literal128=null;
        CPPGrammarParser.statement_return statement127 =null;


        CommonTree char_literal126_tree=null;
        CommonTree char_literal128_tree=null;
        RewriteRuleTokenStream stream_166=new RewriteRuleTokenStream(adaptor,"token 166");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:203:19: ( '{' ( statement )* '}' -> '{' ^( STATEMENTS ( statement )* ) '}' )
            // CPPGrammar.g:203:21: '{' ( statement )* '}'
            {
            char_literal126=(Token)match(input,162,FOLLOW_162_in_compound_statement1927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_162.add(char_literal126);


            // CPPGrammar.g:203:25: ( statement )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0 >= ALPHA_NUMERIC && LA44_0 <= 106)||(LA44_0 >= 108 && LA44_0 <= 165)||LA44_0==167) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // CPPGrammar.g:203:25: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement1929);
            	    statement127=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement127.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            char_literal128=(Token)match(input,166,FOLLOW_166_in_compound_statement1932); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_166.add(char_literal128);


            // AST REWRITE
            // elements: 166, 162, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 203:40: -> '{' ^( STATEMENTS ( statement )* ) '}'
            {
                adaptor.addChild(root_0, 
                stream_162.nextNode()
                );

                // CPPGrammar.g:203:47: ^( STATEMENTS ( statement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:203:60: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_166.nextNode()
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compound_statement"


    public static class non_compound_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "non_compound_statement"
    // CPPGrammar.g:205:1: non_compound_statement : ( ( non_expr_statement )=> non_expr_statement | ( expr_statement )=> expr_statement | statement_water );
    public final CPPGrammarParser.non_compound_statement_return non_compound_statement() throws RecognitionException {
        CPPGrammarParser.non_compound_statement_return retval = new CPPGrammarParser.non_compound_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.non_expr_statement_return non_expr_statement129 =null;

        CPPGrammarParser.expr_statement_return expr_statement130 =null;

        CPPGrammarParser.statement_water_return statement_water131 =null;



        try {
            // CPPGrammar.g:205:23: ( ( non_expr_statement )=> non_expr_statement | ( expr_statement )=> expr_statement | statement_water )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                int LA45_1 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;

                }
                }
                break;
            case 132:
                {
                int LA45_2 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;

                }
                }
                break;
            case 151:
                {
                int LA45_3 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 3, input);

                    throw nvae;

                }
                }
                break;
            case 135:
                {
                int LA45_4 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 4, input);

                    throw nvae;

                }
                }
                break;
            case 161:
                {
                int LA45_5 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 5, input);

                    throw nvae;

                }
                }
                break;
            case 131:
                {
                int LA45_6 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 6, input);

                    throw nvae;

                }
                }
                break;
            case 124:
                {
                int LA45_7 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 7, input);

                    throw nvae;

                }
                }
                break;
            case 129:
                {
                int LA45_8 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 8, input);

                    throw nvae;

                }
                }
                break;
            case 147:
                {
                int LA45_9 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 9, input);

                    throw nvae;

                }
                }
                break;
            case 137:
                {
                int LA45_10 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 10, input);

                    throw nvae;

                }
                }
                break;
            case 154:
                {
                int LA45_11 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 11, input);

                    throw nvae;

                }
                }
                break;
            case 126:
                {
                int LA45_12 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 12, input);

                    throw nvae;

                }
                }
                break;
            case 155:
                {
                int LA45_13 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 13, input);

                    throw nvae;

                }
                }
                break;
            case 152:
                {
                int LA45_14 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 14, input);

                    throw nvae;

                }
                }
                break;
            case 128:
            case 160:
                {
                int LA45_15 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 15, input);

                    throw nvae;

                }
                }
                break;
            case 127:
            case 133:
            case 150:
            case 156:
                {
                int LA45_16 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 16, input);

                    throw nvae;

                }
                }
                break;
            case 148:
            case 157:
                {
                int LA45_17 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 17, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA45_18 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( ((((!(input.LT(1).getText().equals("{")))&&(!(input.LT(1).getText().equals("{"))))&&synpred7_CPPGrammar())) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 18, input);

                    throw nvae;

                }
                }
                break;
            case 125:
                {
                int LA45_19 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 19, input);

                    throw nvae;

                }
                }
                break;
            case DECIMAL_LITERAL:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
                {
                int LA45_20 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( ((((!(input.LT(1).getText().equals("{")))&&(!(input.LT(1).getText().equals("{"))))&&synpred7_CPPGrammar())) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 20, input);

                    throw nvae;

                }
                }
                break;
            case 143:
            case 144:
            case 145:
                {
                int LA45_21 = input.LA(2);

                if ( (synpred6_CPPGrammar()) ) {
                    alt45=1;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 21, input);

                    throw nvae;

                }
                }
                break;
            case 92:
                {
                int LA45_22 = input.LA(2);

                if ( ((((!(input.LT(1).getText().equals("{")))&&(!(input.LT(1).getText().equals("{"))))&&synpred7_CPPGrammar())) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 22, input);

                    throw nvae;

                }
                }
                break;
            case FLOATING_POINT_LITERAL:
            case STRING:
                {
                int LA45_23 = input.LA(2);

                if ( ((((!(input.LT(1).getText().equals("{")))&&(!(input.LT(1).getText().equals("{"))))&&synpred7_CPPGrammar())) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 23, input);

                    throw nvae;

                }
                }
                break;
            case 101:
                {
                int LA45_24 = input.LA(2);

                if ( ((((!(input.LT(1).getText().equals("{")))&&(!(input.LT(1).getText().equals("{"))))&&synpred7_CPPGrammar())) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 24, input);

                    throw nvae;

                }
                }
                break;
            case 97:
                {
                int LA45_25 = input.LA(2);

                if ( ((((!(input.LT(1).getText().equals("{")))&&(!(input.LT(1).getText().equals("{"))))&&synpred7_CPPGrammar())) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 25, input);

                    throw nvae;

                }
                }
                break;
            case 83:
            case 90:
            case 94:
            case 96:
            case 100:
            case 167:
                {
                int LA45_26 = input.LA(2);

                if ( ((((!(input.LT(1).getText().equals("{")))&&(!(input.LT(1).getText().equals("{"))))&&synpred7_CPPGrammar())) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 26, input);

                    throw nvae;

                }
                }
                break;
            case AND:
            case ARGUMENT:
            case ASSIGN:
            case ASSIGN_OP:
            case BASE_CLASSES:
            case BIT_OR:
            case BIT_OR_ELEM:
            case BRACKETS:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COLON:
            case COMMENT:
            case CONDITION:
            case COND_EXPR:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case CURLIES:
            case DESTINATION:
            case DOT:
            case EQ_OPERATOR:
            case EXPR:
            case EXPR_STATEMENT:
            case Exponent:
            case FIELD:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case FloatTypeSuffix:
            case HexDigit:
            case INCLUDE_DIRECTIVE:
            case INIT:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case ITERATION:
            case IntegerTypeSuffix:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case LVAL:
            case NAME:
            case NAMESPACE_DEF:
            case OR:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case POINTER:
            case PREPROC:
            case QMARK:
            case REL_OPERATOR:
            case RETURN_TYPE:
            case RVAL:
            case SELECTION:
            case SIMPLE_DECL:
            case SOURCE_FILE:
            case SQUARES:
            case STATEMENTS:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE:
            case TYPE_DEF:
            case TYPE_NAME:
            case TYPE_SUFFIX:
            case UNARY_EXPR:
            case UNARY_OPERATOR:
            case USING_DIRECTIVE:
            case VAR_DECL:
            case WHITESPACE:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 93:
            case 95:
            case 98:
            case 99:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 130:
            case 134:
            case 136:
            case 139:
            case 140:
            case 141:
            case 142:
            case 146:
            case 149:
            case 153:
            case 158:
            case 159:
            case 163:
            case 164:
            case 165:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;

            }

            switch (alt45) {
                case 1 :
                    // CPPGrammar.g:205:26: ( non_expr_statement )=> non_expr_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_non_expr_statement_in_non_compound_statement1959);
                    non_expr_statement129=non_expr_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, non_expr_statement129.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:206:7: ( expr_statement )=> expr_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_statement_in_non_compound_statement1973);
                    expr_statement130=expr_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_statement130.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:207:7: statement_water
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_statement_water_in_non_compound_statement1981);
                    statement_water131=statement_water();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement_water131.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "non_compound_statement"


    public static class non_expr_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "non_expr_statement"
    // CPPGrammar.g:210:1: non_expr_statement : ( selection_statement | iteration_statement | jump_statement | try_block | catch_block | simple_decl | label );
    public final CPPGrammarParser.non_expr_statement_return non_expr_statement() throws RecognitionException {
        CPPGrammarParser.non_expr_statement_return retval = new CPPGrammarParser.non_expr_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.selection_statement_return selection_statement132 =null;

        CPPGrammarParser.iteration_statement_return iteration_statement133 =null;

        CPPGrammarParser.jump_statement_return jump_statement134 =null;

        CPPGrammarParser.try_block_return try_block135 =null;

        CPPGrammarParser.catch_block_return catch_block136 =null;

        CPPGrammarParser.simple_decl_return simple_decl137 =null;

        CPPGrammarParser.label_return label138 =null;



        try {
            // CPPGrammar.g:210:19: ( selection_statement | iteration_statement | jump_statement | try_block | catch_block | simple_decl | label )
            int alt46=7;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // CPPGrammar.g:210:21: selection_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_selection_statement_in_non_expr_statement1989);
                    selection_statement132=selection_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement132.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:210:43: iteration_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_iteration_statement_in_non_expr_statement1993);
                    iteration_statement133=iteration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement133.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:211:7: jump_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_jump_statement_in_non_expr_statement2001);
                    jump_statement134=jump_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement134.getTree());

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:211:24: try_block
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_try_block_in_non_expr_statement2005);
                    try_block135=try_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, try_block135.getTree());

                    }
                    break;
                case 5 :
                    // CPPGrammar.g:211:36: catch_block
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_catch_block_in_non_expr_statement2009);
                    catch_block136=catch_block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, catch_block136.getTree());

                    }
                    break;
                case 6 :
                    // CPPGrammar.g:211:50: simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_non_expr_statement2013);
                    simple_decl137=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl137.getTree());

                    }
                    break;
                case 7 :
                    // CPPGrammar.g:211:64: label
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_label_in_non_expr_statement2017);
                    label138=label();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, label138.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "non_expr_statement"


    public static class statement_water_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement_water"
    // CPPGrammar.g:214:1: statement_water : ( identifier |~ ( ALPHA_NUMERIC | '::' | '{' | '}' ) );
    public final CPPGrammarParser.statement_water_return statement_water() throws RecognitionException {
        CPPGrammarParser.statement_water_return retval = new CPPGrammarParser.statement_water_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set140=null;
        CPPGrammarParser.identifier_return identifier139 =null;


        CommonTree set140_tree=null;

        try {
            // CPPGrammar.g:214:16: ( identifier |~ ( ALPHA_NUMERIC | '::' | '{' | '}' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==ALPHA_NUMERIC) ) {
                alt47=1;
            }
            else if ( ((LA47_0 >= AND && LA47_0 <= 106)||(LA47_0 >= 108 && LA47_0 <= 161)||(LA47_0 >= 163 && LA47_0 <= 165)||LA47_0==167) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // CPPGrammar.g:214:18: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_statement_water2025);
                    identifier139=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier139.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:214:31: ~ ( ALPHA_NUMERIC | '::' | '{' | '}' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    set140=(Token)input.LT(1);

                    if ( (input.LA(1) >= AND && input.LA(1) <= 106)||(input.LA(1) >= 108 && input.LA(1) <= 161)||(input.LA(1) >= 163 && input.LA(1) <= 165)||input.LA(1)==167 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set140)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement_water"


    public static class expr_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement"
    // CPPGrammar.g:216:1: expr_statement : expr_statement_ -> ^( EXPR_STATEMENT expr_statement_ ) ;
    public final CPPGrammarParser.expr_statement_return expr_statement() throws RecognitionException {
        CPPGrammarParser.expr_statement_return retval = new CPPGrammarParser.expr_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.expr_statement__return expr_statement_141 =null;


        RewriteRuleSubtreeStream stream_expr_statement_=new RewriteRuleSubtreeStream(adaptor,"rule expr_statement_");
        try {
            // CPPGrammar.g:216:15: ( expr_statement_ -> ^( EXPR_STATEMENT expr_statement_ ) )
            // CPPGrammar.g:216:17: expr_statement_
            {
            pushFollow(FOLLOW_expr_statement__in_expr_statement2051);
            expr_statement_141=expr_statement_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr_statement_.add(expr_statement_141.getTree());

            // AST REWRITE
            // elements: expr_statement_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 216:33: -> ^( EXPR_STATEMENT expr_statement_ )
            {
                // CPPGrammar.g:216:36: ^( EXPR_STATEMENT expr_statement_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPR_STATEMENT, "EXPR_STATEMENT")
                , root_1);

                adaptor.addChild(root_1, stream_expr_statement_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement"


    public static class expr_statement__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_statement_"
    // CPPGrammar.g:217:1: expr_statement_ :{...}? => expr ';' ;
    public final CPPGrammarParser.expr_statement__return expr_statement_() throws RecognitionException {
        CPPGrammarParser.expr_statement__return retval = new CPPGrammarParser.expr_statement__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal143=null;
        CPPGrammarParser.expr_return expr142 =null;


        CommonTree char_literal143_tree=null;

        try {
            // CPPGrammar.g:217:16: ({...}? => expr ';' )
            // CPPGrammar.g:217:18: {...}? => expr ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            if ( !((!(input.LT(1).getText().equals("{")))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "expr_statement_", "!(input.LT(1).getText().equals(\"{\"))");
            }

            pushFollow(FOLLOW_expr_in_expr_statement_2068);
            expr142=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr142.getTree());

            char_literal143=(Token)match(input,108,FOLLOW_108_in_expr_statement_2070); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal143_tree = 
            (CommonTree)adaptor.create(char_literal143)
            ;
            adaptor.addChild(root_0, char_literal143_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_statement_"


    public static class selection_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement"
    // CPPGrammar.g:219:1: selection_statement : selection_statement_ -> ^( SELECTION selection_statement_ ) ;
    public final CPPGrammarParser.selection_statement_return selection_statement() throws RecognitionException {
        CPPGrammarParser.selection_statement_return retval = new CPPGrammarParser.selection_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.selection_statement__return selection_statement_144 =null;


        RewriteRuleSubtreeStream stream_selection_statement_=new RewriteRuleSubtreeStream(adaptor,"rule selection_statement_");
        try {
            // CPPGrammar.g:219:20: ( selection_statement_ -> ^( SELECTION selection_statement_ ) )
            // CPPGrammar.g:219:22: selection_statement_
            {
            pushFollow(FOLLOW_selection_statement__in_selection_statement2077);
            selection_statement_144=selection_statement_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selection_statement_.add(selection_statement_144.getTree());

            // AST REWRITE
            // elements: selection_statement_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 219:43: -> ^( SELECTION selection_statement_ )
            {
                // CPPGrammar.g:219:46: ^( SELECTION selection_statement_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECTION, "SELECTION")
                , root_1);

                adaptor.addChild(root_1, stream_selection_statement_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selection_statement"


    public static class selection_statement__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selection_statement_"
    // CPPGrammar.g:220:1: selection_statement_ : ( if_statement | else_statement | switch_statement );
    public final CPPGrammarParser.selection_statement__return selection_statement_() throws RecognitionException {
        CPPGrammarParser.selection_statement__return retval = new CPPGrammarParser.selection_statement__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.if_statement_return if_statement145 =null;

        CPPGrammarParser.else_statement_return else_statement146 =null;

        CPPGrammarParser.switch_statement_return switch_statement147 =null;



        try {
            // CPPGrammar.g:220:21: ( if_statement | else_statement | switch_statement )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt48=1;
                }
                break;
            case 132:
                {
                alt48=2;
                }
                break;
            case 151:
                {
                alt48=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }

            switch (alt48) {
                case 1 :
                    // CPPGrammar.g:220:23: if_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_if_statement_in_selection_statement_2091);
                    if_statement145=if_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_statement145.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:220:38: else_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_else_statement_in_selection_statement_2095);
                    else_statement146=else_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, else_statement146.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:220:55: switch_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_switch_statement_in_selection_statement_2099);
                    switch_statement147=switch_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, switch_statement147.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selection_statement_"


    public static class iteration_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement"
    // CPPGrammar.g:222:1: iteration_statement : iteration_statement_ -> ^( ITERATION iteration_statement_ ) ;
    public final CPPGrammarParser.iteration_statement_return iteration_statement() throws RecognitionException {
        CPPGrammarParser.iteration_statement_return retval = new CPPGrammarParser.iteration_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.iteration_statement__return iteration_statement_148 =null;


        RewriteRuleSubtreeStream stream_iteration_statement_=new RewriteRuleSubtreeStream(adaptor,"rule iteration_statement_");
        try {
            // CPPGrammar.g:222:20: ( iteration_statement_ -> ^( ITERATION iteration_statement_ ) )
            // CPPGrammar.g:222:22: iteration_statement_
            {
            pushFollow(FOLLOW_iteration_statement__in_iteration_statement2106);
            iteration_statement_148=iteration_statement_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_iteration_statement_.add(iteration_statement_148.getTree());

            // AST REWRITE
            // elements: iteration_statement_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 222:43: -> ^( ITERATION iteration_statement_ )
            {
                // CPPGrammar.g:222:46: ^( ITERATION iteration_statement_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ITERATION, "ITERATION")
                , root_1);

                adaptor.addChild(root_1, stream_iteration_statement_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iteration_statement"


    public static class iteration_statement__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "iteration_statement_"
    // CPPGrammar.g:223:1: iteration_statement_ : ( for_statement | while_statement | do_statement );
    public final CPPGrammarParser.iteration_statement__return iteration_statement_() throws RecognitionException {
        CPPGrammarParser.iteration_statement__return retval = new CPPGrammarParser.iteration_statement__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.for_statement_return for_statement149 =null;

        CPPGrammarParser.while_statement_return while_statement150 =null;

        CPPGrammarParser.do_statement_return do_statement151 =null;



        try {
            // CPPGrammar.g:223:21: ( for_statement | while_statement | do_statement )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 135:
                {
                alt49=1;
                }
                break;
            case 161:
                {
                alt49=2;
                }
                break;
            case 131:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // CPPGrammar.g:223:23: for_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_for_statement_in_iteration_statement_2120);
                    for_statement149=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_statement149.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:223:39: while_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_while_statement_in_iteration_statement_2124);
                    while_statement150=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, while_statement150.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:223:57: do_statement
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_do_statement_in_iteration_statement_2128);
                    do_statement151=do_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, do_statement151.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iteration_statement_"


    public static class jump_statement__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement_"
    // CPPGrammar.g:225:1: jump_statement_ : ( break_or_continue | return_statement | goto_statement ) ';' ;
    public final CPPGrammarParser.jump_statement__return jump_statement_() throws RecognitionException {
        CPPGrammarParser.jump_statement__return retval = new CPPGrammarParser.jump_statement__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal155=null;
        CPPGrammarParser.break_or_continue_return break_or_continue152 =null;

        CPPGrammarParser.return_statement_return return_statement153 =null;

        CPPGrammarParser.goto_statement_return goto_statement154 =null;


        CommonTree char_literal155_tree=null;

        try {
            // CPPGrammar.g:225:16: ( ( break_or_continue | return_statement | goto_statement ) ';' )
            // CPPGrammar.g:225:18: ( break_or_continue | return_statement | goto_statement ) ';'
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:225:18: ( break_or_continue | return_statement | goto_statement )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 124:
            case 129:
                {
                alt50=1;
                }
                break;
            case 147:
                {
                alt50=2;
                }
                break;
            case 137:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }

            switch (alt50) {
                case 1 :
                    // CPPGrammar.g:225:20: break_or_continue
                    {
                    pushFollow(FOLLOW_break_or_continue_in_jump_statement_2137);
                    break_or_continue152=break_or_continue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, break_or_continue152.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:225:40: return_statement
                    {
                    pushFollow(FOLLOW_return_statement_in_jump_statement_2141);
                    return_statement153=return_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, return_statement153.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:225:58: goto_statement
                    {
                    pushFollow(FOLLOW_goto_statement_in_jump_statement_2144);
                    goto_statement154=goto_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, goto_statement154.getTree());

                    }
                    break;

            }


            char_literal155=(Token)match(input,108,FOLLOW_108_in_jump_statement_2148); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal155_tree = 
            (CommonTree)adaptor.create(char_literal155)
            ;
            adaptor.addChild(root_0, char_literal155_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jump_statement_"


    public static class break_or_continue_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "break_or_continue"
    // CPPGrammar.g:226:1: break_or_continue : (k= 'break' |k= 'continue' ) -> ^( KEYWORD $k) ^( DESTINATION ) ;
    public final CPPGrammarParser.break_or_continue_return break_or_continue() throws RecognitionException {
        CPPGrammarParser.break_or_continue_return retval = new CPPGrammarParser.break_or_continue_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;

        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");

        try {
            // CPPGrammar.g:226:18: ( (k= 'break' |k= 'continue' ) -> ^( KEYWORD $k) ^( DESTINATION ) )
            // CPPGrammar.g:226:20: (k= 'break' |k= 'continue' )
            {
            // CPPGrammar.g:226:20: (k= 'break' |k= 'continue' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==124) ) {
                alt51=1;
            }
            else if ( (LA51_0==129) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // CPPGrammar.g:226:21: k= 'break'
                    {
                    k=(Token)match(input,124,FOLLOW_124_in_break_or_continue2157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_124.add(k);


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:226:33: k= 'continue'
                    {
                    k=(Token)match(input,129,FOLLOW_129_in_break_or_continue2163); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_129.add(k);


                    }
                    break;

            }


            // AST REWRITE
            // elements: k
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 226:47: -> ^( KEYWORD $k) ^( DESTINATION )
            {
                // CPPGrammar.g:226:50: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:226:64: ^( DESTINATION )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESTINATION, "DESTINATION")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "break_or_continue"


    public static class return_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_statement"
    // CPPGrammar.g:227:1: return_statement : k= 'return' ( expr )? -> ^( KEYWORD $k) ^( DESTINATION ( expr )? ) ;
    public final CPPGrammarParser.return_statement_return return_statement() throws RecognitionException {
        CPPGrammarParser.return_statement_return retval = new CPPGrammarParser.return_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        CPPGrammarParser.expr_return expr156 =null;


        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_147=new RewriteRuleTokenStream(adaptor,"token 147");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:227:17: (k= 'return' ( expr )? -> ^( KEYWORD $k) ^( DESTINATION ( expr )? ) )
            // CPPGrammar.g:227:19: k= 'return' ( expr )?
            {
            k=(Token)match(input,147,FOLLOW_147_in_return_statement2185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_147.add(k);


            // CPPGrammar.g:227:30: ( expr )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ALPHA_NUMERIC||LA52_0==DECIMAL_LITERAL||LA52_0==FLOATING_POINT_LITERAL||LA52_0==HEX_LITERAL||LA52_0==OCTAL_LITERAL||LA52_0==STRING||LA52_0==83||LA52_0==90||LA52_0==92||LA52_0==94||(LA52_0 >= 96 && LA52_0 <= 97)||(LA52_0 >= 100 && LA52_0 <= 101)||LA52_0==167) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // CPPGrammar.g:227:30: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_statement2187);
                    expr156=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr156.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: k, expr
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 227:36: -> ^( KEYWORD $k) ^( DESTINATION ( expr )? )
            {
                // CPPGrammar.g:227:39: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:227:53: ^( DESTINATION ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESTINATION, "DESTINATION")
                , root_1);

                // CPPGrammar.g:227:67: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_statement"


    public static class goto_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "goto_statement"
    // CPPGrammar.g:228:1: goto_statement : k= 'goto' (d= identifier ) -> ^( KEYWORD $k) ^( DESTINATION ( $d)? ) ;
    public final CPPGrammarParser.goto_statement_return goto_statement() throws RecognitionException {
        CPPGrammarParser.goto_statement_return retval = new CPPGrammarParser.goto_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        CPPGrammarParser.identifier_return d =null;


        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // CPPGrammar.g:228:15: (k= 'goto' (d= identifier ) -> ^( KEYWORD $k) ^( DESTINATION ( $d)? ) )
            // CPPGrammar.g:228:18: k= 'goto' (d= identifier )
            {
            k=(Token)match(input,137,FOLLOW_137_in_goto_statement2213); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_137.add(k);


            // CPPGrammar.g:228:27: (d= identifier )
            // CPPGrammar.g:228:29: d= identifier
            {
            pushFollow(FOLLOW_identifier_in_goto_statement2219);
            d=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(d.getTree());

            }


            // AST REWRITE
            // elements: k, d
            // token labels: k
            // rule labels: d, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 228:43: -> ^( KEYWORD $k) ^( DESTINATION ( $d)? )
            {
                // CPPGrammar.g:228:46: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:228:60: ^( DESTINATION ( $d)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DESTINATION, "DESTINATION")
                , root_1);

                // CPPGrammar.g:228:75: ( $d)?
                if ( stream_d.hasNext() ) {
                    adaptor.addChild(root_1, stream_d.nextTree());

                }
                stream_d.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "goto_statement"


    public static class try_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "try_block"
    // CPPGrammar.g:230:1: try_block : 'try' compound_statement ;
    public final CPPGrammarParser.try_block_return try_block() throws RecognitionException {
        CPPGrammarParser.try_block_return retval = new CPPGrammarParser.try_block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal157=null;
        CPPGrammarParser.compound_statement_return compound_statement158 =null;


        CommonTree string_literal157_tree=null;

        try {
            // CPPGrammar.g:230:10: ( 'try' compound_statement )
            // CPPGrammar.g:230:12: 'try' compound_statement
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal157=(Token)match(input,154,FOLLOW_154_in_try_block2244); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal157_tree = 
            (CommonTree)adaptor.create(string_literal157)
            ;
            adaptor.addChild(root_0, string_literal157_tree);
            }

            pushFollow(FOLLOW_compound_statement_in_try_block2246);
            compound_statement158=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement158.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "try_block"


    public static class catch_block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "catch_block"
    // CPPGrammar.g:231:1: catch_block : 'catch' '(' param_decl_specifiers ( parameter_name )? ')' compound_statement ;
    public final CPPGrammarParser.catch_block_return catch_block() throws RecognitionException {
        CPPGrammarParser.catch_block_return retval = new CPPGrammarParser.catch_block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal159=null;
        Token char_literal160=null;
        Token char_literal163=null;
        CPPGrammarParser.param_decl_specifiers_return param_decl_specifiers161 =null;

        CPPGrammarParser.parameter_name_return parameter_name162 =null;

        CPPGrammarParser.compound_statement_return compound_statement164 =null;


        CommonTree string_literal159_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree char_literal163_tree=null;

        try {
            // CPPGrammar.g:231:12: ( 'catch' '(' param_decl_specifiers ( parameter_name )? ')' compound_statement )
            // CPPGrammar.g:231:14: 'catch' '(' param_decl_specifiers ( parameter_name )? ')' compound_statement
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal159=(Token)match(input,126,FOLLOW_126_in_catch_block2252); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal159_tree = 
            (CommonTree)adaptor.create(string_literal159)
            ;
            adaptor.addChild(root_0, string_literal159_tree);
            }

            char_literal160=(Token)match(input,92,FOLLOW_92_in_catch_block2254); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal160_tree = 
            (CommonTree)adaptor.create(char_literal160)
            ;
            adaptor.addChild(root_0, char_literal160_tree);
            }

            pushFollow(FOLLOW_param_decl_specifiers_in_catch_block2255);
            param_decl_specifiers161=param_decl_specifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, param_decl_specifiers161.getTree());

            // CPPGrammar.g:231:47: ( parameter_name )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ALPHA_NUMERIC||LA53_0==92) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // CPPGrammar.g:231:47: parameter_name
                    {
                    pushFollow(FOLLOW_parameter_name_in_catch_block2257);
                    parameter_name162=parameter_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter_name162.getTree());

                    }
                    break;

            }


            char_literal163=(Token)match(input,93,FOLLOW_93_in_catch_block2260); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal163_tree = 
            (CommonTree)adaptor.create(char_literal163)
            ;
            adaptor.addChild(root_0, char_literal163_tree);
            }

            pushFollow(FOLLOW_compound_statement_in_catch_block2262);
            compound_statement164=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement164.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "catch_block"


    public static class if_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // CPPGrammar.g:233:1: if_statement : k= 'if' '(' condition ')' statement -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.if_statement_return if_statement() throws RecognitionException {
        CPPGrammarParser.if_statement_return retval = new CPPGrammarParser.if_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token char_literal165=null;
        Token char_literal167=null;
        CPPGrammarParser.condition_return condition166 =null;

        CPPGrammarParser.statement_return statement168 =null;


        CommonTree k_tree=null;
        CommonTree char_literal165_tree=null;
        CommonTree char_literal167_tree=null;
        RewriteRuleTokenStream stream_138=new RewriteRuleTokenStream(adaptor,"token 138");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:233:13: (k= 'if' '(' condition ')' statement -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:233:15: k= 'if' '(' condition ')' statement
            {
            k=(Token)match(input,138,FOLLOW_138_in_if_statement2271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_138.add(k);


            char_literal165=(Token)match(input,92,FOLLOW_92_in_if_statement2273); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal165);


            pushFollow(FOLLOW_condition_in_if_statement2275);
            condition166=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition166.getTree());

            char_literal167=(Token)match(input,93,FOLLOW_93_in_if_statement2277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal167);


            pushFollow(FOLLOW_statement_in_if_statement2280);
            statement168=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement168.getTree());

            // AST REWRITE
            // elements: 92, 93, k, condition, statement
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 233:51: -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:233:54: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_92.nextNode()
                );

                adaptor.addChild(root_0, stream_condition.nextTree());

                adaptor.addChild(root_0, 
                stream_93.nextNode()
                );

                // CPPGrammar.g:233:86: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:233:99: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_statement"


    public static class else_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_statement"
    // CPPGrammar.g:234:1: else_statement : k= 'else' statement -> ^( KEYWORD $k) ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.else_statement_return else_statement() throws RecognitionException {
        CPPGrammarParser.else_statement_return retval = new CPPGrammarParser.else_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        CPPGrammarParser.statement_return statement169 =null;


        CommonTree k_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:234:15: (k= 'else' statement -> ^( KEYWORD $k) ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:234:17: k= 'else' statement
            {
            k=(Token)match(input,132,FOLLOW_132_in_else_statement2311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_132.add(k);


            pushFollow(FOLLOW_statement_in_else_statement2313);
            statement169=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement169.getTree());

            // AST REWRITE
            // elements: statement, k
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 234:36: -> ^( KEYWORD $k) ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:234:39: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:234:53: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:234:66: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "else_statement"


    public static class switch_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switch_statement"
    // CPPGrammar.g:235:1: switch_statement : k= 'switch' '(' condition ')' statement -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.switch_statement_return switch_statement() throws RecognitionException {
        CPPGrammarParser.switch_statement_return retval = new CPPGrammarParser.switch_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token char_literal170=null;
        Token char_literal172=null;
        CPPGrammarParser.condition_return condition171 =null;

        CPPGrammarParser.statement_return statement173 =null;


        CommonTree k_tree=null;
        CommonTree char_literal170_tree=null;
        CommonTree char_literal172_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_151=new RewriteRuleTokenStream(adaptor,"token 151");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:235:17: (k= 'switch' '(' condition ')' statement -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:235:19: k= 'switch' '(' condition ')' statement
            {
            k=(Token)match(input,151,FOLLOW_151_in_switch_statement2337); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_151.add(k);


            char_literal170=(Token)match(input,92,FOLLOW_92_in_switch_statement2339); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal170);


            pushFollow(FOLLOW_condition_in_switch_statement2341);
            condition171=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition171.getTree());

            char_literal172=(Token)match(input,93,FOLLOW_93_in_switch_statement2343); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal172);


            pushFollow(FOLLOW_statement_in_switch_statement2345);
            statement173=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement173.getTree());

            // AST REWRITE
            // elements: 92, condition, 93, statement, k
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 235:58: -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:235:61: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_92.nextNode()
                );

                adaptor.addChild(root_0, stream_condition.nextTree());

                adaptor.addChild(root_0, 
                stream_93.nextNode()
                );

                // CPPGrammar.g:235:94: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:235:107: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switch_statement"


    public static class for_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_statement"
    // CPPGrammar.g:237:1: for_statement : k= 'for' '(' for_init_statement condition ';' ( expr )? ')' statement -> ^( KEYWORD $k) '(' ^( FOR_INIT ( for_init_statement )? ) condition ';' ^( FOR_EXPR ( expr )? ) ')' ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.for_statement_return for_statement() throws RecognitionException {
        CPPGrammarParser.for_statement_return retval = new CPPGrammarParser.for_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token char_literal174=null;
        Token char_literal177=null;
        Token char_literal179=null;
        CPPGrammarParser.for_init_statement_return for_init_statement175 =null;

        CPPGrammarParser.condition_return condition176 =null;

        CPPGrammarParser.expr_return expr178 =null;

        CPPGrammarParser.statement_return statement180 =null;


        CommonTree k_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree char_literal177_tree=null;
        CommonTree char_literal179_tree=null;
        RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_for_init_statement=new RewriteRuleSubtreeStream(adaptor,"rule for_init_statement");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:237:14: (k= 'for' '(' for_init_statement condition ';' ( expr )? ')' statement -> ^( KEYWORD $k) '(' ^( FOR_INIT ( for_init_statement )? ) condition ';' ^( FOR_EXPR ( expr )? ) ')' ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:237:16: k= 'for' '(' for_init_statement condition ';' ( expr )? ')' statement
            {
            k=(Token)match(input,135,FOLLOW_135_in_for_statement2377); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_135.add(k);


            char_literal174=(Token)match(input,92,FOLLOW_92_in_for_statement2379); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal174);


            pushFollow(FOLLOW_for_init_statement_in_for_statement2381);
            for_init_statement175=for_init_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_for_init_statement.add(for_init_statement175.getTree());

            pushFollow(FOLLOW_condition_in_for_statement2383);
            condition176=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition176.getTree());

            char_literal177=(Token)match(input,108,FOLLOW_108_in_for_statement2385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_108.add(char_literal177);


            // CPPGrammar.g:237:62: ( expr )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ALPHA_NUMERIC||LA54_0==DECIMAL_LITERAL||LA54_0==FLOATING_POINT_LITERAL||LA54_0==HEX_LITERAL||LA54_0==OCTAL_LITERAL||LA54_0==STRING||LA54_0==83||LA54_0==90||LA54_0==92||LA54_0==94||(LA54_0 >= 96 && LA54_0 <= 97)||(LA54_0 >= 100 && LA54_0 <= 101)||LA54_0==167) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // CPPGrammar.g:237:62: expr
                    {
                    pushFollow(FOLLOW_expr_in_for_statement2388);
                    expr178=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr178.getTree());

                    }
                    break;

            }


            char_literal179=(Token)match(input,93,FOLLOW_93_in_for_statement2391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal179);


            pushFollow(FOLLOW_statement_in_for_statement2393);
            statement180=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement180.getTree());

            // AST REWRITE
            // elements: 93, statement, 92, condition, for_init_statement, expr, k, 108
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 238:13: -> ^( KEYWORD $k) '(' ^( FOR_INIT ( for_init_statement )? ) condition ';' ^( FOR_EXPR ( expr )? ) ')' ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:238:16: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_92.nextNode()
                );

                // CPPGrammar.g:238:34: ^( FOR_INIT ( for_init_statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_INIT, "FOR_INIT")
                , root_1);

                // CPPGrammar.g:238:45: ( for_init_statement )?
                if ( stream_for_init_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_for_init_statement.nextTree());

                }
                stream_for_init_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, stream_condition.nextTree());

                adaptor.addChild(root_0, 
                stream_108.nextNode()
                );

                // CPPGrammar.g:238:80: ^( FOR_EXPR ( expr )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FOR_EXPR, "FOR_EXPR")
                , root_1);

                // CPPGrammar.g:238:91: ( expr )?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_93.nextNode()
                );

                // CPPGrammar.g:238:102: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:238:115: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_statement"


    public static class while_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_statement"
    // CPPGrammar.g:239:1: while_statement : k= 'while' '(' condition ')' statement -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.while_statement_return while_statement() throws RecognitionException {
        CPPGrammarParser.while_statement_return retval = new CPPGrammarParser.while_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token char_literal181=null;
        Token char_literal183=null;
        CPPGrammarParser.condition_return condition182 =null;

        CPPGrammarParser.statement_return statement184 =null;


        CommonTree k_tree=null;
        CommonTree char_literal181_tree=null;
        CommonTree char_literal183_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // CPPGrammar.g:239:16: (k= 'while' '(' condition ')' statement -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:239:18: k= 'while' '(' condition ')' statement
            {
            k=(Token)match(input,161,FOLLOW_161_in_while_statement2451); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(k);


            char_literal181=(Token)match(input,92,FOLLOW_92_in_while_statement2453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal181);


            pushFollow(FOLLOW_condition_in_while_statement2455);
            condition182=condition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_condition.add(condition182.getTree());

            char_literal183=(Token)match(input,93,FOLLOW_93_in_while_statement2457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal183);


            pushFollow(FOLLOW_statement_in_while_statement2459);
            statement184=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement184.getTree());

            // AST REWRITE
            // elements: k, 92, statement, 93, condition
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 239:56: -> ^( KEYWORD $k) '(' condition ')' ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:239:59: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_92.nextNode()
                );

                adaptor.addChild(root_0, stream_condition.nextTree());

                adaptor.addChild(root_0, 
                stream_93.nextNode()
                );

                // CPPGrammar.g:239:91: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:239:104: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_statement"


    public static class do_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "do_statement"
    // CPPGrammar.g:240:1: do_statement : k= 'do' statement 'while' '(' expr ')' -> ^( KEYWORD $k) '(' ^( CONDITION expr ) ')' ^( STATEMENTS ( statement )? ) ;
    public final CPPGrammarParser.do_statement_return do_statement() throws RecognitionException {
        CPPGrammarParser.do_statement_return retval = new CPPGrammarParser.do_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token k=null;
        Token string_literal186=null;
        Token char_literal187=null;
        Token char_literal189=null;
        CPPGrammarParser.statement_return statement185 =null;

        CPPGrammarParser.expr_return expr188 =null;


        CommonTree k_tree=null;
        CommonTree string_literal186_tree=null;
        CommonTree char_literal187_tree=null;
        CommonTree char_literal189_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:240:13: (k= 'do' statement 'while' '(' expr ')' -> ^( KEYWORD $k) '(' ^( CONDITION expr ) ')' ^( STATEMENTS ( statement )? ) )
            // CPPGrammar.g:240:15: k= 'do' statement 'while' '(' expr ')'
            {
            k=(Token)match(input,131,FOLLOW_131_in_do_statement2489); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_131.add(k);


            pushFollow(FOLLOW_statement_in_do_statement2491);
            statement185=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement185.getTree());

            string_literal186=(Token)match(input,161,FOLLOW_161_in_do_statement2493); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_161.add(string_literal186);


            char_literal187=(Token)match(input,92,FOLLOW_92_in_do_statement2495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(char_literal187);


            pushFollow(FOLLOW_expr_in_do_statement2497);
            expr188=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr188.getTree());

            char_literal189=(Token)match(input,93,FOLLOW_93_in_do_statement2499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(char_literal189);


            // AST REWRITE
            // elements: expr, k, 92, statement, 93
            // token labels: k
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_k=new RewriteRuleTokenStream(adaptor,"token k",k);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 240:53: -> ^( KEYWORD $k) '(' ^( CONDITION expr ) ')' ^( STATEMENTS ( statement )? )
            {
                // CPPGrammar.g:240:56: ^( KEYWORD $k)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(KEYWORD, "KEYWORD")
                , root_1);

                adaptor.addChild(root_1, stream_k.nextNode());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_92.nextNode()
                );

                // CPPGrammar.g:240:74: ^( CONDITION expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION, "CONDITION")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                adaptor.addChild(root_0, 
                stream_93.nextNode()
                );

                // CPPGrammar.g:240:96: ^( STATEMENTS ( statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(STATEMENTS, "STATEMENTS")
                , root_1);

                // CPPGrammar.g:240:109: ( statement )?
                if ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "do_statement"


    public static class for_init_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_init_statement"
    // CPPGrammar.g:243:1: for_init_statement : ( ( simple_decl )=> simple_decl | ( expr )? ';' );
    public final CPPGrammarParser.for_init_statement_return for_init_statement() throws RecognitionException {
        CPPGrammarParser.for_init_statement_return retval = new CPPGrammarParser.for_init_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal192=null;
        CPPGrammarParser.simple_decl_return simple_decl190 =null;

        CPPGrammarParser.expr_return expr191 =null;


        CommonTree char_literal192_tree=null;

        try {
            // CPPGrammar.g:243:20: ( ( simple_decl )=> simple_decl | ( expr )? ';' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==155) && (synpred8_CPPGrammar())) {
                alt56=1;
            }
            else if ( (LA56_0==152) && (synpred8_CPPGrammar())) {
                alt56=1;
            }
            else if ( (LA56_0==128||LA56_0==160) && (synpred8_CPPGrammar())) {
                alt56=1;
            }
            else if ( (LA56_0==127||LA56_0==133||LA56_0==150||LA56_0==156) && (synpred8_CPPGrammar())) {
                alt56=1;
            }
            else if ( (LA56_0==148||LA56_0==157) && (synpred8_CPPGrammar())) {
                alt56=1;
            }
            else if ( (LA56_0==ALPHA_NUMERIC) ) {
                int LA56_6 = input.LA(2);

                if ( (synpred8_CPPGrammar()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA56_0==DECIMAL_LITERAL||LA56_0==FLOATING_POINT_LITERAL||LA56_0==HEX_LITERAL||LA56_0==OCTAL_LITERAL||LA56_0==STRING||LA56_0==83||LA56_0==90||LA56_0==92||LA56_0==94||(LA56_0 >= 96 && LA56_0 <= 97)||(LA56_0 >= 100 && LA56_0 <= 101)||LA56_0==108||LA56_0==167) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // CPPGrammar.g:243:22: ( simple_decl )=> simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_for_init_statement2541);
                    simple_decl190=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl190.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:243:53: ( expr )? ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:243:53: ( expr )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==ALPHA_NUMERIC||LA55_0==DECIMAL_LITERAL||LA55_0==FLOATING_POINT_LITERAL||LA55_0==HEX_LITERAL||LA55_0==OCTAL_LITERAL||LA55_0==STRING||LA55_0==83||LA55_0==90||LA55_0==92||LA55_0==94||(LA55_0 >= 96 && LA55_0 <= 97)||(LA55_0 >= 100 && LA55_0 <= 101)||LA55_0==167) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // CPPGrammar.g:243:53: expr
                            {
                            pushFollow(FOLLOW_expr_in_for_init_statement2545);
                            expr191=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr191.getTree());

                            }
                            break;

                    }


                    char_literal192=(Token)match(input,108,FOLLOW_108_in_for_init_statement2548); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal192_tree = 
                    (CommonTree)adaptor.create(char_literal192)
                    ;
                    adaptor.addChild(root_0, char_literal192_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_init_statement"


    public static class label__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "label_"
    // CPPGrammar.g:245:1: label_ : ( ( ( 'case' )? ( identifier | number ) ) | access_specifier ) ':' ;
    public final CPPGrammarParser.label__return label_() throws RecognitionException {
        CPPGrammarParser.label__return retval = new CPPGrammarParser.label__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal193=null;
        Token char_literal197=null;
        CPPGrammarParser.identifier_return identifier194 =null;

        CPPGrammarParser.number_return number195 =null;

        CPPGrammarParser.access_specifier_return access_specifier196 =null;


        CommonTree string_literal193_tree=null;
        CommonTree char_literal197_tree=null;

        try {
            // CPPGrammar.g:245:7: ( ( ( ( 'case' )? ( identifier | number ) ) | access_specifier ) ':' )
            // CPPGrammar.g:245:9: ( ( ( 'case' )? ( identifier | number ) ) | access_specifier ) ':'
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:245:9: ( ( ( 'case' )? ( identifier | number ) ) | access_specifier )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ALPHA_NUMERIC||LA59_0==DECIMAL_LITERAL||LA59_0==HEX_LITERAL||LA59_0==OCTAL_LITERAL||LA59_0==125) ) {
                alt59=1;
            }
            else if ( ((LA59_0 >= 143 && LA59_0 <= 145)) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }
            switch (alt59) {
                case 1 :
                    // CPPGrammar.g:245:10: ( ( 'case' )? ( identifier | number ) )
                    {
                    // CPPGrammar.g:245:10: ( ( 'case' )? ( identifier | number ) )
                    // CPPGrammar.g:245:11: ( 'case' )? ( identifier | number )
                    {
                    // CPPGrammar.g:245:11: ( 'case' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==125) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // CPPGrammar.g:245:11: 'case'
                            {
                            string_literal193=(Token)match(input,125,FOLLOW_125_in_label_2557); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal193_tree = 
                            (CommonTree)adaptor.create(string_literal193)
                            ;
                            adaptor.addChild(root_0, string_literal193_tree);
                            }

                            }
                            break;

                    }


                    // CPPGrammar.g:245:19: ( identifier | number )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==ALPHA_NUMERIC) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==DECIMAL_LITERAL||LA58_0==HEX_LITERAL||LA58_0==OCTAL_LITERAL) ) {
                        alt58=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;

                    }
                    switch (alt58) {
                        case 1 :
                            // CPPGrammar.g:245:20: identifier
                            {
                            pushFollow(FOLLOW_identifier_in_label_2561);
                            identifier194=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier194.getTree());

                            }
                            break;
                        case 2 :
                            // CPPGrammar.g:245:33: number
                            {
                            pushFollow(FOLLOW_number_in_label_2565);
                            number195=number();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, number195.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:245:45: access_specifier
                    {
                    pushFollow(FOLLOW_access_specifier_in_label_2572);
                    access_specifier196=access_specifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, access_specifier196.getTree());

                    }
                    break;

            }


            char_literal197=(Token)match(input,COLON,FOLLOW_COLON_in_label_2575); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal197_tree = 
            (CommonTree)adaptor.create(char_literal197)
            ;
            adaptor.addChild(root_0, char_literal197_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "label_"


    public static class type_id_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_id_list"
    // CPPGrammar.g:247:1: type_id_list : ( no_brackets )* ( '(' type_id_list ')' ( no_brackets )* )* ;
    public final CPPGrammarParser.type_id_list_return type_id_list() throws RecognitionException {
        CPPGrammarParser.type_id_list_return retval = new CPPGrammarParser.type_id_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal199=null;
        Token char_literal201=null;
        CPPGrammarParser.no_brackets_return no_brackets198 =null;

        CPPGrammarParser.type_id_list_return type_id_list200 =null;

        CPPGrammarParser.no_brackets_return no_brackets202 =null;


        CommonTree char_literal199_tree=null;
        CommonTree char_literal201_tree=null;

        try {
            // CPPGrammar.g:247:13: ( ( no_brackets )* ( '(' type_id_list ')' ( no_brackets )* )* )
            // CPPGrammar.g:247:15: ( no_brackets )* ( '(' type_id_list ')' ( no_brackets )* )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:247:15: ( no_brackets )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0 >= ALPHA_NUMERIC && LA60_0 <= 91)||(LA60_0 >= 94 && LA60_0 <= 167)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // CPPGrammar.g:247:15: no_brackets
            	    {
            	    pushFollow(FOLLOW_no_brackets_in_type_id_list2583);
            	    no_brackets198=no_brackets();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_brackets198.getTree());

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            // CPPGrammar.g:247:28: ( '(' type_id_list ')' ( no_brackets )* )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==92) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // CPPGrammar.g:247:29: '(' type_id_list ')' ( no_brackets )*
            	    {
            	    char_literal199=(Token)match(input,92,FOLLOW_92_in_type_id_list2587); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal199_tree = 
            	    (CommonTree)adaptor.create(char_literal199)
            	    ;
            	    adaptor.addChild(root_0, char_literal199_tree);
            	    }

            	    pushFollow(FOLLOW_type_id_list_in_type_id_list2589);
            	    type_id_list200=type_id_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_id_list200.getTree());

            	    char_literal201=(Token)match(input,93,FOLLOW_93_in_type_id_list2591); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal201_tree = 
            	    (CommonTree)adaptor.create(char_literal201)
            	    ;
            	    adaptor.addChild(root_0, char_literal201_tree);
            	    }

            	    // CPPGrammar.g:247:50: ( no_brackets )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( ((LA61_0 >= ALPHA_NUMERIC && LA61_0 <= 91)||(LA61_0 >= 94 && LA61_0 <= 167)) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // CPPGrammar.g:247:50: no_brackets
            	    	    {
            	    	    pushFollow(FOLLOW_no_brackets_in_type_id_list2593);
            	    	    no_brackets202=no_brackets();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_brackets202.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop61;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_id_list"


    public static class namespace_def__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespace_def_"
    // CPPGrammar.g:248:1: namespace_def_ : 'namespace' ( identifier )? '{' namespace_content '}' ;
    public final CPPGrammarParser.namespace_def__return namespace_def_() throws RecognitionException {
        CPPGrammarParser.namespace_def__return retval = new CPPGrammarParser.namespace_def__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal203=null;
        Token char_literal205=null;
        Token char_literal207=null;
        CPPGrammarParser.identifier_return identifier204 =null;

        CPPGrammarParser.namespace_content_return namespace_content206 =null;


        CommonTree string_literal203_tree=null;
        CommonTree char_literal205_tree=null;
        CommonTree char_literal207_tree=null;

        try {
            // CPPGrammar.g:248:15: ( 'namespace' ( identifier )? '{' namespace_content '}' )
            // CPPGrammar.g:248:17: 'namespace' ( identifier )? '{' namespace_content '}'
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal203=(Token)match(input,140,FOLLOW_140_in_namespace_def_2602); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal203_tree = 
            (CommonTree)adaptor.create(string_literal203)
            ;
            adaptor.addChild(root_0, string_literal203_tree);
            }

            // CPPGrammar.g:248:29: ( identifier )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ALPHA_NUMERIC) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // CPPGrammar.g:248:29: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_namespace_def_2604);
                    identifier204=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier204.getTree());

                    }
                    break;

            }


            char_literal205=(Token)match(input,162,FOLLOW_162_in_namespace_def_2607); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal205_tree = 
            (CommonTree)adaptor.create(char_literal205)
            ;
            adaptor.addChild(root_0, char_literal205_tree);
            }

            pushFollow(FOLLOW_namespace_content_in_namespace_def_2609);
            namespace_content206=namespace_content();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_content206.getTree());

            char_literal207=(Token)match(input,166,FOLLOW_166_in_namespace_def_2611); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal207_tree = 
            (CommonTree)adaptor.create(char_literal207)
            ;
            adaptor.addChild(root_0, char_literal207_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespace_def_"


    public static class namespace_content_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespace_content"
    // CPPGrammar.g:249:1: namespace_content : ( namespace_content_elem )* ( '{' namespace_content '}' ( namespace_content_elem )* )* ;
    public final CPPGrammarParser.namespace_content_return namespace_content() throws RecognitionException {
        CPPGrammarParser.namespace_content_return retval = new CPPGrammarParser.namespace_content_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal209=null;
        Token char_literal211=null;
        CPPGrammarParser.namespace_content_elem_return namespace_content_elem208 =null;

        CPPGrammarParser.namespace_content_return namespace_content210 =null;

        CPPGrammarParser.namespace_content_elem_return namespace_content_elem212 =null;


        CommonTree char_literal209_tree=null;
        CommonTree char_literal211_tree=null;

        try {
            // CPPGrammar.g:249:18: ( ( namespace_content_elem )* ( '{' namespace_content '}' ( namespace_content_elem )* )* )
            // CPPGrammar.g:249:20: ( namespace_content_elem )* ( '{' namespace_content '}' ( namespace_content_elem )* )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:249:20: ( namespace_content_elem )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0 >= ALPHA_NUMERIC && LA64_0 <= 161)||(LA64_0 >= 163 && LA64_0 <= 165)||LA64_0==167) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // CPPGrammar.g:249:20: namespace_content_elem
            	    {
            	    pushFollow(FOLLOW_namespace_content_elem_in_namespace_content2617);
            	    namespace_content_elem208=namespace_content_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_content_elem208.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            // CPPGrammar.g:249:44: ( '{' namespace_content '}' ( namespace_content_elem )* )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==162) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // CPPGrammar.g:249:45: '{' namespace_content '}' ( namespace_content_elem )*
            	    {
            	    char_literal209=(Token)match(input,162,FOLLOW_162_in_namespace_content2621); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal209_tree = 
            	    (CommonTree)adaptor.create(char_literal209)
            	    ;
            	    adaptor.addChild(root_0, char_literal209_tree);
            	    }

            	    pushFollow(FOLLOW_namespace_content_in_namespace_content2623);
            	    namespace_content210=namespace_content();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_content210.getTree());

            	    char_literal211=(Token)match(input,166,FOLLOW_166_in_namespace_content2625); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal211_tree = 
            	    (CommonTree)adaptor.create(char_literal211)
            	    ;
            	    adaptor.addChild(root_0, char_literal211_tree);
            	    }

            	    // CPPGrammar.g:249:71: ( namespace_content_elem )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( ((LA65_0 >= ALPHA_NUMERIC && LA65_0 <= 161)||(LA65_0 >= 163 && LA65_0 <= 165)||LA65_0==167) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // CPPGrammar.g:249:71: namespace_content_elem
            	    	    {
            	    	    pushFollow(FOLLOW_namespace_content_elem_in_namespace_content2627);
            	    	    namespace_content_elem212=namespace_content_elem();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;
            	    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, namespace_content_elem212.getTree());

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop65;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespace_content"


    public static class namespace_content_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespace_content_elem"
    // CPPGrammar.g:250:1: namespace_content_elem : ( ( simple_decl )=> simple_decl | ( function_def )=> function_def | no_curlies );
    public final CPPGrammarParser.namespace_content_elem_return namespace_content_elem() throws RecognitionException {
        CPPGrammarParser.namespace_content_elem_return retval = new CPPGrammarParser.namespace_content_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.simple_decl_return simple_decl213 =null;

        CPPGrammarParser.function_def_return function_def214 =null;

        CPPGrammarParser.no_curlies_return no_curlies215 =null;



        try {
            // CPPGrammar.g:250:23: ( ( simple_decl )=> simple_decl | ( function_def )=> function_def | no_curlies )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 155:
                {
                int LA67_1 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt67=1;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;

                }
                }
                break;
            case 152:
                {
                int LA67_2 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt67=1;
                }
                else if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;

                }
                }
                break;
            case 128:
            case 160:
                {
                int LA67_3 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt67=1;
                }
                else if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 3, input);

                    throw nvae;

                }
                }
                break;
            case 127:
            case 133:
            case 150:
            case 156:
                {
                int LA67_4 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt67=1;
                }
                else if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 4, input);

                    throw nvae;

                }
                }
                break;
            case 148:
            case 157:
                {
                int LA67_5 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt67=1;
                }
                else if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 5, input);

                    throw nvae;

                }
                }
                break;
            case ALPHA_NUMERIC:
                {
                int LA67_6 = input.LA(2);

                if ( (synpred9_CPPGrammar()) ) {
                    alt67=1;
                }
                else if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 6, input);

                    throw nvae;

                }
                }
                break;
            case 134:
            case 136:
            case 139:
            case 149:
            case 159:
                {
                int LA67_7 = input.LA(2);

                if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 7, input);

                    throw nvae;

                }
                }
                break;
            case 90:
            case 94:
                {
                int LA67_8 = input.LA(2);

                if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 8, input);

                    throw nvae;

                }
                }
                break;
            case 92:
                {
                int LA67_9 = input.LA(2);

                if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 9, input);

                    throw nvae;

                }
                }
                break;
            case 142:
                {
                int LA67_10 = input.LA(2);

                if ( (synpred10_CPPGrammar()) ) {
                    alt67=2;
                }
                else if ( (true) ) {
                    alt67=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 10, input);

                    throw nvae;

                }
                }
                break;
            case AND:
            case ARGUMENT:
            case ASSIGN:
            case ASSIGN_OP:
            case BASE_CLASSES:
            case BIT_OR:
            case BIT_OR_ELEM:
            case BRACKETS:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COLON:
            case COMMENT:
            case CONDITION:
            case COND_EXPR:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case CURLIES:
            case DECIMAL_LITERAL:
            case DESTINATION:
            case DOT:
            case EQ_OPERATOR:
            case EXPR:
            case EXPR_STATEMENT:
            case Exponent:
            case FIELD:
            case FLOATING_POINT_LITERAL:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case FloatTypeSuffix:
            case HEX_LITERAL:
            case HexDigit:
            case INCLUDE_DIRECTIVE:
            case INIT:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case ITERATION:
            case IntegerTypeSuffix:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case LVAL:
            case NAME:
            case NAMESPACE_DEF:
            case OCTAL_LITERAL:
            case OR:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case POINTER:
            case PREPROC:
            case QMARK:
            case REL_OPERATOR:
            case RETURN_TYPE:
            case RVAL:
            case SELECTION:
            case SIMPLE_DECL:
            case SOURCE_FILE:
            case SQUARES:
            case STATEMENTS:
            case STRING:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE:
            case TYPE_DEF:
            case TYPE_NAME:
            case TYPE_SUFFIX:
            case UNARY_EXPR:
            case UNARY_OPERATOR:
            case USING_DIRECTIVE:
            case VAR_DECL:
            case WHITESPACE:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 91:
            case 93:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 129:
            case 130:
            case 131:
            case 132:
            case 135:
            case 137:
            case 138:
            case 140:
            case 141:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 151:
            case 153:
            case 154:
            case 158:
            case 161:
            case 163:
            case 164:
            case 165:
            case 167:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }

            switch (alt67) {
                case 1 :
                    // CPPGrammar.g:250:25: ( simple_decl )=> simple_decl
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_simple_decl_in_namespace_content_elem2642);
                    simple_decl213=simple_decl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simple_decl213.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:251:5: ( function_def )=> function_def
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_def_in_namespace_content_elem2654);
                    function_def214=function_def();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_def214.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:252:5: no_curlies
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_curlies_in_namespace_content_elem2660);
                    no_curlies215=no_curlies();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_curlies215.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespace_content_elem"


    public static class type_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name"
    // CPPGrammar.g:254:1: type_name : type_name_ -> ^( TYPE_NAME type_name_ ) ;
    public final CPPGrammarParser.type_name_return type_name() throws RecognitionException {
        CPPGrammarParser.type_name_return retval = new CPPGrammarParser.type_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.type_name__return type_name_216 =null;


        RewriteRuleSubtreeStream stream_type_name_=new RewriteRuleSubtreeStream(adaptor,"rule type_name_");
        try {
            // CPPGrammar.g:254:10: ( type_name_ -> ^( TYPE_NAME type_name_ ) )
            // CPPGrammar.g:254:12: type_name_
            {
            pushFollow(FOLLOW_type_name__in_type_name2669);
            type_name_216=type_name_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_name_.add(type_name_216.getTree());

            // AST REWRITE
            // elements: type_name_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 254:23: -> ^( TYPE_NAME type_name_ )
            {
                // CPPGrammar.g:254:26: ^( TYPE_NAME type_name_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TYPE_NAME, "TYPE_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_type_name_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_name"


    public static class type_name__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type_name_"
    // CPPGrammar.g:256:1: type_name_ : ( cv_qualifier )* ( class_key )? ( 'unsigned' | 'signed' )? ALPHA_NUMERIC ( '<' template_param_list '>' )? ( '::' ALPHA_NUMERIC ( '<' template_param_list '>' )? )* ;
    public final CPPGrammarParser.type_name__return type_name_() throws RecognitionException {
        CPPGrammarParser.type_name__return retval = new CPPGrammarParser.type_name__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set219=null;
        Token ALPHA_NUMERIC220=null;
        Token char_literal221=null;
        Token char_literal223=null;
        Token string_literal224=null;
        Token ALPHA_NUMERIC225=null;
        Token char_literal226=null;
        Token char_literal228=null;
        CPPGrammarParser.cv_qualifier_return cv_qualifier217 =null;

        CPPGrammarParser.class_key_return class_key218 =null;

        CPPGrammarParser.template_param_list_return template_param_list222 =null;

        CPPGrammarParser.template_param_list_return template_param_list227 =null;


        CommonTree set219_tree=null;
        CommonTree ALPHA_NUMERIC220_tree=null;
        CommonTree char_literal221_tree=null;
        CommonTree char_literal223_tree=null;
        CommonTree string_literal224_tree=null;
        CommonTree ALPHA_NUMERIC225_tree=null;
        CommonTree char_literal226_tree=null;
        CommonTree char_literal228_tree=null;

        try {
            // CPPGrammar.g:256:11: ( ( cv_qualifier )* ( class_key )? ( 'unsigned' | 'signed' )? ALPHA_NUMERIC ( '<' template_param_list '>' )? ( '::' ALPHA_NUMERIC ( '<' template_param_list '>' )? )* )
            // CPPGrammar.g:256:13: ( cv_qualifier )* ( class_key )? ( 'unsigned' | 'signed' )? ALPHA_NUMERIC ( '<' template_param_list '>' )? ( '::' ALPHA_NUMERIC ( '<' template_param_list '>' )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:256:13: ( cv_qualifier )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==128||LA68_0==160) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // CPPGrammar.g:256:13: cv_qualifier
            	    {
            	    pushFollow(FOLLOW_cv_qualifier_in_type_name_2684);
            	    cv_qualifier217=cv_qualifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, cv_qualifier217.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            // CPPGrammar.g:256:27: ( class_key )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==127||LA69_0==133||LA69_0==150||LA69_0==156) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // CPPGrammar.g:256:27: class_key
                    {
                    pushFollow(FOLLOW_class_key_in_type_name_2687);
                    class_key218=class_key();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_key218.getTree());

                    }
                    break;

            }


            // CPPGrammar.g:256:38: ( 'unsigned' | 'signed' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==148||LA70_0==157) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // CPPGrammar.g:
                    {
                    set219=(Token)input.LT(1);

                    if ( input.LA(1)==148||input.LA(1)==157 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set219)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            ALPHA_NUMERIC220=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_type_name_2699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALPHA_NUMERIC220_tree = 
            (CommonTree)adaptor.create(ALPHA_NUMERIC220)
            ;
            adaptor.addChild(root_0, ALPHA_NUMERIC220_tree);
            }

            // CPPGrammar.g:256:77: ( '<' template_param_list '>' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==109) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // CPPGrammar.g:256:78: '<' template_param_list '>'
                    {
                    char_literal221=(Token)match(input,109,FOLLOW_109_in_type_name_2702); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal221_tree = 
                    (CommonTree)adaptor.create(char_literal221)
                    ;
                    adaptor.addChild(root_0, char_literal221_tree);
                    }

                    pushFollow(FOLLOW_template_param_list_in_type_name_2704);
                    template_param_list222=template_param_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list222.getTree());

                    char_literal223=(Token)match(input,115,FOLLOW_115_in_type_name_2706); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal223_tree = 
                    (CommonTree)adaptor.create(char_literal223)
                    ;
                    adaptor.addChild(root_0, char_literal223_tree);
                    }

                    }
                    break;

            }


            // CPPGrammar.g:256:109: ( '::' ALPHA_NUMERIC ( '<' template_param_list '>' )? )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==107) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // CPPGrammar.g:256:110: '::' ALPHA_NUMERIC ( '<' template_param_list '>' )?
            	    {
            	    string_literal224=(Token)match(input,107,FOLLOW_107_in_type_name_2712); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal224_tree = 
            	    (CommonTree)adaptor.create(string_literal224)
            	    ;
            	    adaptor.addChild(root_0, string_literal224_tree);
            	    }

            	    ALPHA_NUMERIC225=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_type_name_2714); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ALPHA_NUMERIC225_tree = 
            	    (CommonTree)adaptor.create(ALPHA_NUMERIC225)
            	    ;
            	    adaptor.addChild(root_0, ALPHA_NUMERIC225_tree);
            	    }

            	    // CPPGrammar.g:256:129: ( '<' template_param_list '>' )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==109) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // CPPGrammar.g:256:130: '<' template_param_list '>'
            	            {
            	            char_literal226=(Token)match(input,109,FOLLOW_109_in_type_name_2717); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal226_tree = 
            	            (CommonTree)adaptor.create(char_literal226)
            	            ;
            	            adaptor.addChild(root_0, char_literal226_tree);
            	            }

            	            pushFollow(FOLLOW_template_param_list_in_type_name_2719);
            	            template_param_list227=template_param_list();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list227.getTree());

            	            char_literal228=(Token)match(input,115,FOLLOW_115_in_type_name_2721); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal228_tree = 
            	            (CommonTree)adaptor.create(char_literal228)
            	            ;
            	            adaptor.addChild(root_0, char_literal228_tree);
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type_name_"


    public static class template_param_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_param_list"
    // CPPGrammar.g:257:1: template_param_list : ( template_param_list_elem )* ;
    public final CPPGrammarParser.template_param_list_return template_param_list() throws RecognitionException {
        CPPGrammarParser.template_param_list_return retval = new CPPGrammarParser.template_param_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.template_param_list_elem_return template_param_list_elem229 =null;



        try {
            // CPPGrammar.g:257:21: ( ( template_param_list_elem )* )
            // CPPGrammar.g:257:23: ( template_param_list_elem )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:257:23: ( template_param_list_elem )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0 >= ALPHA_NUMERIC && LA74_0 <= 92)||(LA74_0 >= 94 && LA74_0 <= 114)||(LA74_0 >= 116 && LA74_0 <= 167)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // CPPGrammar.g:257:23: template_param_list_elem
            	    {
            	    pushFollow(FOLLOW_template_param_list_elem_in_template_param_list2734);
            	    template_param_list_elem229=template_param_list_elem();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list_elem229.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_param_list"


    public static class template_param_list_elem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "template_param_list_elem"
    // CPPGrammar.g:258:1: template_param_list_elem : ( ( '<' template_param_list '>' ) | ( '(' template_param_list ')' ) | no_angle_brackets_or_brackets );
    public final CPPGrammarParser.template_param_list_elem_return template_param_list_elem() throws RecognitionException {
        CPPGrammarParser.template_param_list_elem_return retval = new CPPGrammarParser.template_param_list_elem_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal230=null;
        Token char_literal232=null;
        Token char_literal233=null;
        Token char_literal235=null;
        CPPGrammarParser.template_param_list_return template_param_list231 =null;

        CPPGrammarParser.template_param_list_return template_param_list234 =null;

        CPPGrammarParser.no_angle_brackets_or_brackets_return no_angle_brackets_or_brackets236 =null;


        CommonTree char_literal230_tree=null;
        CommonTree char_literal232_tree=null;
        CommonTree char_literal233_tree=null;
        CommonTree char_literal235_tree=null;

        try {
            // CPPGrammar.g:258:25: ( ( '<' template_param_list '>' ) | ( '(' template_param_list ')' ) | no_angle_brackets_or_brackets )
            int alt75=3;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt75=1;
                }
                break;
            case 92:
                {
                alt75=2;
                }
                break;
            case ALPHA_NUMERIC:
            case AND:
            case ARGUMENT:
            case ASSIGN:
            case ASSIGN_OP:
            case BASE_CLASSES:
            case BIT_OR:
            case BIT_OR_ELEM:
            case BRACKETS:
            case CALLEE:
            case CALL_TEMPLATE_LIST:
            case CLASS_CONTENT:
            case CLASS_DEF:
            case CLASS_NAME:
            case COLON:
            case COMMENT:
            case CONDITION:
            case COND_EXPR:
            case CPPCOMMENT:
            case CTOR_EXPR:
            case CTOR_INITIALIZER:
            case CTOR_LIST:
            case CURLIES:
            case DECIMAL_LITERAL:
            case DESTINATION:
            case DOT:
            case EQ_OPERATOR:
            case EXPR:
            case EXPR_STATEMENT:
            case Exponent:
            case FIELD:
            case FLOATING_POINT_LITERAL:
            case FOR_EXPR:
            case FOR_INIT:
            case FUNCTION_CALL:
            case FUNCTION_DEF:
            case FUNCTION_NAME:
            case FloatTypeSuffix:
            case HEX_LITERAL:
            case HexDigit:
            case INCLUDE_DIRECTIVE:
            case INIT:
            case INITIALIZER_ID:
            case INIT_DECL_LIST:
            case ITERATION:
            case IntegerTypeSuffix:
            case JUMP_STATEMENT:
            case KEYWORD:
            case LABEL:
            case LVAL:
            case NAME:
            case NAMESPACE_DEF:
            case OCTAL_LITERAL:
            case OR:
            case OTHER:
            case PARAMETER_DECL:
            case PARAMETER_LIST:
            case POINTER:
            case PREPROC:
            case QMARK:
            case REL_OPERATOR:
            case RETURN_TYPE:
            case RVAL:
            case SELECTION:
            case SIMPLE_DECL:
            case SOURCE_FILE:
            case SQUARES:
            case STATEMENTS:
            case STRING:
            case TEMPLATE_DECL_SPECIFIER:
            case TYPE:
            case TYPE_DEF:
            case TYPE_NAME:
            case TYPE_SUFFIX:
            case UNARY_EXPR:
            case UNARY_OPERATOR:
            case USING_DIRECTIVE:
            case VAR_DECL:
            case WHITESPACE:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // CPPGrammar.g:258:28: ( '<' template_param_list '>' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:258:28: ( '<' template_param_list '>' )
                    // CPPGrammar.g:258:29: '<' template_param_list '>'
                    {
                    char_literal230=(Token)match(input,109,FOLLOW_109_in_template_param_list_elem2743); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal230_tree = 
                    (CommonTree)adaptor.create(char_literal230)
                    ;
                    adaptor.addChild(root_0, char_literal230_tree);
                    }

                    pushFollow(FOLLOW_template_param_list_in_template_param_list_elem2745);
                    template_param_list231=template_param_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list231.getTree());

                    char_literal232=(Token)match(input,115,FOLLOW_115_in_template_param_list_elem2747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal232_tree = 
                    (CommonTree)adaptor.create(char_literal232)
                    ;
                    adaptor.addChild(root_0, char_literal232_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:259:12: ( '(' template_param_list ')' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:259:12: ( '(' template_param_list ')' )
                    // CPPGrammar.g:259:13: '(' template_param_list ')'
                    {
                    char_literal233=(Token)match(input,92,FOLLOW_92_in_template_param_list_elem2762); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal233_tree = 
                    (CommonTree)adaptor.create(char_literal233)
                    ;
                    adaptor.addChild(root_0, char_literal233_tree);
                    }

                    pushFollow(FOLLOW_template_param_list_in_template_param_list_elem2764);
                    template_param_list234=template_param_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list234.getTree());

                    char_literal235=(Token)match(input,93,FOLLOW_93_in_template_param_list_elem2766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal235_tree = 
                    (CommonTree)adaptor.create(char_literal235)
                    ;
                    adaptor.addChild(root_0, char_literal235_tree);
                    }

                    }


                    }
                    break;
                case 3 :
                    // CPPGrammar.g:260:12: no_angle_brackets_or_brackets
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_no_angle_brackets_or_brackets_in_template_param_list_elem2780);
                    no_angle_brackets_or_brackets236=no_angle_brackets_or_brackets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, no_angle_brackets_or_brackets236.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "template_param_list_elem"


    public static class condition__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_"
    // CPPGrammar.g:265:1: condition_ : expr ;
    public final CPPGrammarParser.condition__return condition_() throws RecognitionException {
        CPPGrammarParser.condition__return retval = new CPPGrammarParser.condition__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.expr_return expr237 =null;



        try {
            // CPPGrammar.g:265:11: ( expr )
            // CPPGrammar.g:265:13: expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_condition_2790);
            expr237=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr237.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // CPPGrammar.g:267:1: expr : expr_ -> ^( EXPR expr_ ) ;
    public final CPPGrammarParser.expr_return expr() throws RecognitionException {
        CPPGrammarParser.expr_return retval = new CPPGrammarParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.expr__return expr_238 =null;


        RewriteRuleSubtreeStream stream_expr_=new RewriteRuleSubtreeStream(adaptor,"rule expr_");
        try {
            // CPPGrammar.g:267:5: ( expr_ -> ^( EXPR expr_ ) )
            // CPPGrammar.g:267:7: expr_
            {
            pushFollow(FOLLOW_expr__in_expr2797);
            expr_238=expr_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr_.add(expr_238.getTree());

            // AST REWRITE
            // elements: expr_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 267:13: -> ^( EXPR expr_ )
            {
                // CPPGrammar.g:267:16: ^( EXPR expr_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EXPR, "EXPR")
                , root_1);

                adaptor.addChild(root_1, stream_expr_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class expr__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_"
    // CPPGrammar.g:268:1: expr_ : assign_expr ( ',' assign_expr )? ;
    public final CPPGrammarParser.expr__return expr_() throws RecognitionException {
        CPPGrammarParser.expr__return retval = new CPPGrammarParser.expr__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal240=null;
        CPPGrammarParser.assign_expr_return assign_expr239 =null;

        CPPGrammarParser.assign_expr_return assign_expr241 =null;


        CommonTree char_literal240_tree=null;

        try {
            // CPPGrammar.g:268:6: ( assign_expr ( ',' assign_expr )? )
            // CPPGrammar.g:268:8: assign_expr ( ',' assign_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_assign_expr_in_expr_2811);
            assign_expr239=assign_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_expr239.getTree());

            // CPPGrammar.g:268:20: ( ',' assign_expr )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==99) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // CPPGrammar.g:268:21: ',' assign_expr
                    {
                    char_literal240=(Token)match(input,99,FOLLOW_99_in_expr_2814); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal240_tree = 
                    (CommonTree)adaptor.create(char_literal240)
                    ;
                    adaptor.addChild(root_0, char_literal240_tree);
                    }

                    pushFollow(FOLLOW_assign_expr_in_expr_2816);
                    assign_expr241=assign_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign_expr241.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_"


    public static class assign_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_expr"
    // CPPGrammar.g:270:1: assign_expr : ( conditional_expression -> conditional_expression ) ( assignment_operator assign_expr -> ^( ASSIGN ^( LVAL conditional_expression ) ^( ASSIGN_OP assignment_operator ) ^( RVAL assign_expr ) ) )? ;
    public final CPPGrammarParser.assign_expr_return assign_expr() throws RecognitionException {
        CPPGrammarParser.assign_expr_return retval = new CPPGrammarParser.assign_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.conditional_expression_return conditional_expression242 =null;

        CPPGrammarParser.assignment_operator_return assignment_operator243 =null;

        CPPGrammarParser.assign_expr_return assign_expr244 =null;


        RewriteRuleSubtreeStream stream_conditional_expression=new RewriteRuleSubtreeStream(adaptor,"rule conditional_expression");
        RewriteRuleSubtreeStream stream_assign_expr=new RewriteRuleSubtreeStream(adaptor,"rule assign_expr");
        RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");
        try {
            // CPPGrammar.g:270:12: ( ( conditional_expression -> conditional_expression ) ( assignment_operator assign_expr -> ^( ASSIGN ^( LVAL conditional_expression ) ^( ASSIGN_OP assignment_operator ) ^( RVAL assign_expr ) ) )? )
            // CPPGrammar.g:270:14: ( conditional_expression -> conditional_expression ) ( assignment_operator assign_expr -> ^( ASSIGN ^( LVAL conditional_expression ) ^( ASSIGN_OP assignment_operator ) ^( RVAL assign_expr ) ) )?
            {
            // CPPGrammar.g:270:14: ( conditional_expression -> conditional_expression )
            // CPPGrammar.g:270:15: conditional_expression
            {
            pushFollow(FOLLOW_conditional_expression_in_assign_expr2826);
            conditional_expression242=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_conditional_expression.add(conditional_expression242.getTree());

            // AST REWRITE
            // elements: conditional_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 270:38: -> conditional_expression
            {
                adaptor.addChild(root_0, stream_conditional_expression.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // CPPGrammar.g:271:9: ( assignment_operator assign_expr -> ^( ASSIGN ^( LVAL conditional_expression ) ^( ASSIGN_OP assignment_operator ) ^( RVAL assign_expr ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==88||LA77_0==91||LA77_0==95||LA77_0==98||LA77_0==102||LA77_0==106||LA77_0==111||LA77_0==113||LA77_0==118||LA77_0==122||LA77_0==164) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // CPPGrammar.g:271:10: assignment_operator assign_expr
                    {
                    pushFollow(FOLLOW_assignment_operator_in_assign_expr2843);
                    assignment_operator243=assignment_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator243.getTree());

                    pushFollow(FOLLOW_assign_expr_in_assign_expr2845);
                    assign_expr244=assign_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assign_expr.add(assign_expr244.getTree());

                    // AST REWRITE
                    // elements: conditional_expression, assignment_operator, assign_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 271:42: -> ^( ASSIGN ^( LVAL conditional_expression ) ^( ASSIGN_OP assignment_operator ) ^( RVAL assign_expr ) )
                    {
                        // CPPGrammar.g:271:45: ^( ASSIGN ^( LVAL conditional_expression ) ^( ASSIGN_OP assignment_operator ) ^( RVAL assign_expr ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGN, "ASSIGN")
                        , root_1);

                        // CPPGrammar.g:271:54: ^( LVAL conditional_expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LVAL, "LVAL")
                        , root_2);

                        adaptor.addChild(root_2, stream_conditional_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // CPPGrammar.g:271:85: ^( ASSIGN_OP assignment_operator )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASSIGN_OP, "ASSIGN_OP")
                        , root_2);

                        adaptor.addChild(root_2, stream_assignment_operator.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // CPPGrammar.g:271:118: ^( RVAL assign_expr )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(RVAL, "RVAL")
                        , root_2);

                        adaptor.addChild(root_2, stream_assign_expr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign_expr"


    public static class constant_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant_expr"
    // CPPGrammar.g:273:1: constant_expr : conditional_expression ;
    public final CPPGrammarParser.constant_expr_return constant_expr() throws RecognitionException {
        CPPGrammarParser.constant_expr_return retval = new CPPGrammarParser.constant_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.conditional_expression_return conditional_expression245 =null;



        try {
            // CPPGrammar.g:273:14: ( conditional_expression )
            // CPPGrammar.g:273:16: conditional_expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditional_expression_in_constant_expr2878);
            conditional_expression245=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression245.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant_expr"


    public static class conditional_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditional_expression"
    // CPPGrammar.g:274:1: conditional_expression : ( or_expression -> or_expression ) ( '?' expr ':' conditional_expression -> ^( COND_EXPR ^( CONDITION or_expression ) '?' expr ':' conditional_expression ) )? ;
    public final CPPGrammarParser.conditional_expression_return conditional_expression() throws RecognitionException {
        CPPGrammarParser.conditional_expression_return retval = new CPPGrammarParser.conditional_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal247=null;
        Token char_literal249=null;
        CPPGrammarParser.or_expression_return or_expression246 =null;

        CPPGrammarParser.expr_return expr248 =null;

        CPPGrammarParser.conditional_expression_return conditional_expression250 =null;


        CommonTree char_literal247_tree=null;
        CommonTree char_literal249_tree=null;
        RewriteRuleTokenStream stream_QMARK=new RewriteRuleTokenStream(adaptor,"token QMARK");
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule or_expression");
        RewriteRuleSubtreeStream stream_conditional_expression=new RewriteRuleSubtreeStream(adaptor,"rule conditional_expression");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // CPPGrammar.g:274:23: ( ( or_expression -> or_expression ) ( '?' expr ':' conditional_expression -> ^( COND_EXPR ^( CONDITION or_expression ) '?' expr ':' conditional_expression ) )? )
            // CPPGrammar.g:274:25: ( or_expression -> or_expression ) ( '?' expr ':' conditional_expression -> ^( COND_EXPR ^( CONDITION or_expression ) '?' expr ':' conditional_expression ) )?
            {
            // CPPGrammar.g:274:25: ( or_expression -> or_expression )
            // CPPGrammar.g:274:26: or_expression
            {
            pushFollow(FOLLOW_or_expression_in_conditional_expression2885);
            or_expression246=or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_or_expression.add(or_expression246.getTree());

            // AST REWRITE
            // elements: or_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 274:40: -> or_expression
            {
                adaptor.addChild(root_0, stream_or_expression.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // CPPGrammar.g:275:9: ( '?' expr ':' conditional_expression -> ^( COND_EXPR ^( CONDITION or_expression ) '?' expr ':' conditional_expression ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==QMARK) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // CPPGrammar.g:275:10: '?' expr ':' conditional_expression
                    {
                    char_literal247=(Token)match(input,QMARK,FOLLOW_QMARK_in_conditional_expression2901); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QMARK.add(char_literal247);


                    pushFollow(FOLLOW_expr_in_conditional_expression2903);
                    expr248=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr.add(expr248.getTree());

                    char_literal249=(Token)match(input,COLON,FOLLOW_COLON_in_conditional_expression2905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON.add(char_literal249);


                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression2907);
                    conditional_expression250=conditional_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_conditional_expression.add(conditional_expression250.getTree());

                    // AST REWRITE
                    // elements: QMARK, expr, COLON, or_expression, conditional_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 275:46: -> ^( COND_EXPR ^( CONDITION or_expression ) '?' expr ':' conditional_expression )
                    {
                        // CPPGrammar.g:275:49: ^( COND_EXPR ^( CONDITION or_expression ) '?' expr ':' conditional_expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COND_EXPR, "COND_EXPR")
                        , root_1);

                        // CPPGrammar.g:275:61: ^( CONDITION or_expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONDITION, "CONDITION")
                        , root_2);

                        adaptor.addChild(root_2, stream_or_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        stream_QMARK.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_COLON.nextNode()
                        );

                        adaptor.addChild(root_1, stream_conditional_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conditional_expression"


    public static class or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_expression"
    // CPPGrammar.g:277:1: or_expression : ( and_expression -> and_expression ) ( '||' or_expression -> ^( OR ^( EXPR and_expression ) '||' ^( EXPR or_expression ) ) )? ;
    public final CPPGrammarParser.or_expression_return or_expression() throws RecognitionException {
        CPPGrammarParser.or_expression_return retval = new CPPGrammarParser.or_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal252=null;
        CPPGrammarParser.and_expression_return and_expression251 =null;

        CPPGrammarParser.or_expression_return or_expression253 =null;


        CommonTree string_literal252_tree=null;
        RewriteRuleTokenStream stream_165=new RewriteRuleTokenStream(adaptor,"token 165");
        RewriteRuleSubtreeStream stream_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule or_expression");
        RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");
        try {
            // CPPGrammar.g:277:15: ( ( and_expression -> and_expression ) ( '||' or_expression -> ^( OR ^( EXPR and_expression ) '||' ^( EXPR or_expression ) ) )? )
            // CPPGrammar.g:277:17: ( and_expression -> and_expression ) ( '||' or_expression -> ^( OR ^( EXPR and_expression ) '||' ^( EXPR or_expression ) ) )?
            {
            // CPPGrammar.g:277:17: ( and_expression -> and_expression )
            // CPPGrammar.g:277:18: and_expression
            {
            pushFollow(FOLLOW_and_expression_in_or_expression2938);
            and_expression251=and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_and_expression.add(and_expression251.getTree());

            // AST REWRITE
            // elements: and_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 277:34: -> and_expression
            {
                adaptor.addChild(root_0, stream_and_expression.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // CPPGrammar.g:278:9: ( '||' or_expression -> ^( OR ^( EXPR and_expression ) '||' ^( EXPR or_expression ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==165) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // CPPGrammar.g:278:10: '||' or_expression
                    {
                    string_literal252=(Token)match(input,165,FOLLOW_165_in_or_expression2955); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_165.add(string_literal252);


                    pushFollow(FOLLOW_or_expression_in_or_expression2957);
                    or_expression253=or_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_or_expression.add(or_expression253.getTree());

                    // AST REWRITE
                    // elements: or_expression, and_expression, 165
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 278:29: -> ^( OR ^( EXPR and_expression ) '||' ^( EXPR or_expression ) )
                    {
                        // CPPGrammar.g:278:32: ^( OR ^( EXPR and_expression ) '||' ^( EXPR or_expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(OR, "OR")
                        , root_1);

                        // CPPGrammar.g:278:37: ^( EXPR and_expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPR, "EXPR")
                        , root_2);

                        adaptor.addChild(root_2, stream_and_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        stream_165.nextNode()
                        );

                        // CPPGrammar.g:278:65: ^( EXPR or_expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPR, "EXPR")
                        , root_2);

                        adaptor.addChild(root_2, stream_or_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or_expression"


    public static class and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expression"
    // CPPGrammar.g:280:1: and_expression : ( inclusive_or_expression -> inclusive_or_expression ) ( '&&' and_expression -> ^( AND ^( EXPR inclusive_or_expression ) '&&' ^( EXPR and_expression ) ) )? ;
    public final CPPGrammarParser.and_expression_return and_expression() throws RecognitionException {
        CPPGrammarParser.and_expression_return retval = new CPPGrammarParser.and_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal255=null;
        CPPGrammarParser.inclusive_or_expression_return inclusive_or_expression254 =null;

        CPPGrammarParser.and_expression_return and_expression256 =null;


        CommonTree string_literal255_tree=null;
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");
        RewriteRuleSubtreeStream stream_inclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule inclusive_or_expression");
        try {
            // CPPGrammar.g:280:16: ( ( inclusive_or_expression -> inclusive_or_expression ) ( '&&' and_expression -> ^( AND ^( EXPR inclusive_or_expression ) '&&' ^( EXPR and_expression ) ) )? )
            // CPPGrammar.g:280:18: ( inclusive_or_expression -> inclusive_or_expression ) ( '&&' and_expression -> ^( AND ^( EXPR inclusive_or_expression ) '&&' ^( EXPR and_expression ) ) )?
            {
            // CPPGrammar.g:280:18: ( inclusive_or_expression -> inclusive_or_expression )
            // CPPGrammar.g:280:19: inclusive_or_expression
            {
            pushFollow(FOLLOW_inclusive_or_expression_in_and_expression2990);
            inclusive_or_expression254=inclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_inclusive_or_expression.add(inclusive_or_expression254.getTree());

            // AST REWRITE
            // elements: inclusive_or_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 280:43: -> inclusive_or_expression
            {
                adaptor.addChild(root_0, stream_inclusive_or_expression.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // CPPGrammar.g:281:9: ( '&&' and_expression -> ^( AND ^( EXPR inclusive_or_expression ) '&&' ^( EXPR and_expression ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==89) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // CPPGrammar.g:281:10: '&&' and_expression
                    {
                    string_literal255=(Token)match(input,89,FOLLOW_89_in_and_expression3006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_89.add(string_literal255);


                    pushFollow(FOLLOW_and_expression_in_and_expression3008);
                    and_expression256=and_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_and_expression.add(and_expression256.getTree());

                    // AST REWRITE
                    // elements: inclusive_or_expression, and_expression, 89
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 281:30: -> ^( AND ^( EXPR inclusive_or_expression ) '&&' ^( EXPR and_expression ) )
                    {
                        // CPPGrammar.g:281:33: ^( AND ^( EXPR inclusive_or_expression ) '&&' ^( EXPR and_expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(AND, "AND")
                        , root_1);

                        // CPPGrammar.g:281:39: ^( EXPR inclusive_or_expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPR, "EXPR")
                        , root_2);

                        adaptor.addChild(root_2, stream_inclusive_or_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        stream_89.nextNode()
                        );

                        // CPPGrammar.g:281:76: ^( EXPR and_expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(EXPR, "EXPR")
                        , root_2);

                        adaptor.addChild(root_2, stream_and_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_expression"


    public static class inclusive_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inclusive_or_expression"
    // CPPGrammar.g:284:1: inclusive_or_expression : ( exclusive_or_expression -> exclusive_or_expression ) ( '|' inclusive_or_expression -> ^( BIT_OR ^( BIT_OR_ELEM exclusive_or_expression ) '|' ^( BIT_OR_ELEM inclusive_or_expression ) ) )? ;
    public final CPPGrammarParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
        CPPGrammarParser.inclusive_or_expression_return retval = new CPPGrammarParser.inclusive_or_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal258=null;
        CPPGrammarParser.exclusive_or_expression_return exclusive_or_expression257 =null;

        CPPGrammarParser.inclusive_or_expression_return inclusive_or_expression259 =null;


        CommonTree char_literal258_tree=null;
        RewriteRuleTokenStream stream_163=new RewriteRuleTokenStream(adaptor,"token 163");
        RewriteRuleSubtreeStream stream_exclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule exclusive_or_expression");
        RewriteRuleSubtreeStream stream_inclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule inclusive_or_expression");
        try {
            // CPPGrammar.g:284:24: ( ( exclusive_or_expression -> exclusive_or_expression ) ( '|' inclusive_or_expression -> ^( BIT_OR ^( BIT_OR_ELEM exclusive_or_expression ) '|' ^( BIT_OR_ELEM inclusive_or_expression ) ) )? )
            // CPPGrammar.g:284:26: ( exclusive_or_expression -> exclusive_or_expression ) ( '|' inclusive_or_expression -> ^( BIT_OR ^( BIT_OR_ELEM exclusive_or_expression ) '|' ^( BIT_OR_ELEM inclusive_or_expression ) ) )?
            {
            // CPPGrammar.g:284:26: ( exclusive_or_expression -> exclusive_or_expression )
            // CPPGrammar.g:284:27: exclusive_or_expression
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression3039);
            exclusive_or_expression257=exclusive_or_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression257.getTree());

            // AST REWRITE
            // elements: exclusive_or_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 284:51: -> exclusive_or_expression
            {
                adaptor.addChild(root_0, stream_exclusive_or_expression.nextTree());

            }


            retval.tree = root_0;
            }

            }


            // CPPGrammar.g:284:79: ( '|' inclusive_or_expression -> ^( BIT_OR ^( BIT_OR_ELEM exclusive_or_expression ) '|' ^( BIT_OR_ELEM inclusive_or_expression ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==163) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // CPPGrammar.g:284:80: '|' inclusive_or_expression
                    {
                    char_literal258=(Token)match(input,163,FOLLOW_163_in_inclusive_or_expression3047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_163.add(char_literal258);


                    pushFollow(FOLLOW_inclusive_or_expression_in_inclusive_or_expression3049);
                    inclusive_or_expression259=inclusive_or_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inclusive_or_expression.add(inclusive_or_expression259.getTree());

                    // AST REWRITE
                    // elements: inclusive_or_expression, 163, exclusive_or_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 285:13: -> ^( BIT_OR ^( BIT_OR_ELEM exclusive_or_expression ) '|' ^( BIT_OR_ELEM inclusive_or_expression ) )
                    {
                        // CPPGrammar.g:285:16: ^( BIT_OR ^( BIT_OR_ELEM exclusive_or_expression ) '|' ^( BIT_OR_ELEM inclusive_or_expression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(BIT_OR, "BIT_OR")
                        , root_1);

                        // CPPGrammar.g:285:25: ^( BIT_OR_ELEM exclusive_or_expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(BIT_OR_ELEM, "BIT_OR_ELEM")
                        , root_2);

                        adaptor.addChild(root_2, stream_exclusive_or_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, 
                        stream_163.nextNode()
                        );

                        // CPPGrammar.g:285:68: ^( BIT_OR_ELEM inclusive_or_expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(BIT_OR_ELEM, "BIT_OR_ELEM")
                        , root_2);

                        adaptor.addChild(root_2, stream_inclusive_or_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inclusive_or_expression"


    public static class exclusive_or_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exclusive_or_expression"
    // CPPGrammar.g:288:1: exclusive_or_expression : bit_and_expression ( '^' exclusive_or_expression )? ;
    public final CPPGrammarParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
        CPPGrammarParser.exclusive_or_expression_return retval = new CPPGrammarParser.exclusive_or_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal261=null;
        CPPGrammarParser.bit_and_expression_return bit_and_expression260 =null;

        CPPGrammarParser.exclusive_or_expression_return exclusive_or_expression262 =null;


        CommonTree char_literal261_tree=null;

        try {
            // CPPGrammar.g:288:24: ( bit_and_expression ( '^' exclusive_or_expression )? )
            // CPPGrammar.g:288:26: bit_and_expression ( '^' exclusive_or_expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_bit_and_expression_in_exclusive_or_expression3091);
            bit_and_expression260=bit_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, bit_and_expression260.getTree());

            // CPPGrammar.g:288:45: ( '^' exclusive_or_expression )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==121) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // CPPGrammar.g:288:46: '^' exclusive_or_expression
                    {
                    char_literal261=(Token)match(input,121,FOLLOW_121_in_exclusive_or_expression3094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal261_tree = 
                    (CommonTree)adaptor.create(char_literal261)
                    ;
                    adaptor.addChild(root_0, char_literal261_tree);
                    }

                    pushFollow(FOLLOW_exclusive_or_expression_in_exclusive_or_expression3096);
                    exclusive_or_expression262=exclusive_or_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression262.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "exclusive_or_expression"


    public static class bit_and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bit_and_expression"
    // CPPGrammar.g:291:1: bit_and_expression : equality_expression ( '&' bit_and_expression )? ;
    public final CPPGrammarParser.bit_and_expression_return bit_and_expression() throws RecognitionException {
        CPPGrammarParser.bit_and_expression_return retval = new CPPGrammarParser.bit_and_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal264=null;
        CPPGrammarParser.equality_expression_return equality_expression263 =null;

        CPPGrammarParser.bit_and_expression_return bit_and_expression265 =null;


        CommonTree char_literal264_tree=null;

        try {
            // CPPGrammar.g:291:19: ( equality_expression ( '&' bit_and_expression )? )
            // CPPGrammar.g:291:21: equality_expression ( '&' bit_and_expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equality_expression_in_bit_and_expression3106);
            equality_expression263=equality_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression263.getTree());

            // CPPGrammar.g:291:41: ( '&' bit_and_expression )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==90) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // CPPGrammar.g:291:42: '&' bit_and_expression
                    {
                    char_literal264=(Token)match(input,90,FOLLOW_90_in_bit_and_expression3109); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal264_tree = 
                    (CommonTree)adaptor.create(char_literal264)
                    ;
                    adaptor.addChild(root_0, char_literal264_tree);
                    }

                    pushFollow(FOLLOW_bit_and_expression_in_bit_and_expression3111);
                    bit_and_expression265=bit_and_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bit_and_expression265.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bit_and_expression"


    public static class equality_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_expression"
    // CPPGrammar.g:293:1: equality_expression : relational_expression ( equality_operator equality_expression )? ;
    public final CPPGrammarParser.equality_expression_return equality_expression() throws RecognitionException {
        CPPGrammarParser.equality_expression_return retval = new CPPGrammarParser.equality_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.relational_expression_return relational_expression266 =null;

        CPPGrammarParser.equality_operator_return equality_operator267 =null;

        CPPGrammarParser.equality_expression_return equality_expression268 =null;



        try {
            // CPPGrammar.g:293:20: ( relational_expression ( equality_operator equality_expression )? )
            // CPPGrammar.g:293:22: relational_expression ( equality_operator equality_expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_equality_expression3120);
            relational_expression266=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression266.getTree());

            // CPPGrammar.g:293:44: ( equality_operator equality_expression )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==84||LA84_0==114) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // CPPGrammar.g:293:45: equality_operator equality_expression
                    {
                    pushFollow(FOLLOW_equality_operator_in_equality_expression3123);
                    equality_operator267=equality_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_operator267.getTree());

                    pushFollow(FOLLOW_equality_expression_in_equality_expression3125);
                    equality_expression268=equality_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression268.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equality_expression"


    public static class equality_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_operator"
    // CPPGrammar.g:295:1: equality_operator : equality_operator_ -> ^( EQ_OPERATOR equality_operator_ ) ;
    public final CPPGrammarParser.equality_operator_return equality_operator() throws RecognitionException {
        CPPGrammarParser.equality_operator_return retval = new CPPGrammarParser.equality_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.equality_operator__return equality_operator_269 =null;


        RewriteRuleSubtreeStream stream_equality_operator_=new RewriteRuleSubtreeStream(adaptor,"rule equality_operator_");
        try {
            // CPPGrammar.g:295:18: ( equality_operator_ -> ^( EQ_OPERATOR equality_operator_ ) )
            // CPPGrammar.g:295:20: equality_operator_
            {
            pushFollow(FOLLOW_equality_operator__in_equality_operator3134);
            equality_operator_269=equality_operator_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_equality_operator_.add(equality_operator_269.getTree());

            // AST REWRITE
            // elements: equality_operator_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 295:39: -> ^( EQ_OPERATOR equality_operator_ )
            {
                // CPPGrammar.g:295:42: ^( EQ_OPERATOR equality_operator_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(EQ_OPERATOR, "EQ_OPERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_equality_operator_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equality_operator"


    public static class equality_operator__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equality_operator_"
    // CPPGrammar.g:296:1: equality_operator_ : ( '==' | '!=' ) ;
    public final CPPGrammarParser.equality_operator__return equality_operator_() throws RecognitionException {
        CPPGrammarParser.equality_operator__return retval = new CPPGrammarParser.equality_operator__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set270=null;

        CommonTree set270_tree=null;

        try {
            // CPPGrammar.g:296:19: ( ( '==' | '!=' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set270=(Token)input.LT(1);

            if ( input.LA(1)==84||input.LA(1)==114 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set270)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equality_operator_"


    public static class relational_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // CPPGrammar.g:298:1: relational_expression : shift_expression ( relational_operator relational_expression )? ;
    public final CPPGrammarParser.relational_expression_return relational_expression() throws RecognitionException {
        CPPGrammarParser.relational_expression_return retval = new CPPGrammarParser.relational_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.shift_expression_return shift_expression271 =null;

        CPPGrammarParser.relational_operator_return relational_operator272 =null;

        CPPGrammarParser.relational_expression_return relational_expression273 =null;



        try {
            // CPPGrammar.g:298:22: ( shift_expression ( relational_operator relational_expression )? )
            // CPPGrammar.g:298:24: shift_expression ( relational_operator relational_expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_shift_expression_in_relational_expression3160);
            shift_expression271=shift_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression271.getTree());

            // CPPGrammar.g:298:41: ( relational_operator relational_expression )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==109||LA85_0==112||(LA85_0 >= 115 && LA85_0 <= 116)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // CPPGrammar.g:298:42: relational_operator relational_expression
                    {
                    pushFollow(FOLLOW_relational_operator_in_relational_expression3163);
                    relational_operator272=relational_operator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_operator272.getTree());

                    pushFollow(FOLLOW_relational_expression_in_relational_expression3165);
                    relational_expression273=relational_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression273.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class relational_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_operator"
    // CPPGrammar.g:300:1: relational_operator : relational_operator_ -> ^( REL_OPERATOR relational_operator_ ) ;
    public final CPPGrammarParser.relational_operator_return relational_operator() throws RecognitionException {
        CPPGrammarParser.relational_operator_return retval = new CPPGrammarParser.relational_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.relational_operator__return relational_operator_274 =null;


        RewriteRuleSubtreeStream stream_relational_operator_=new RewriteRuleSubtreeStream(adaptor,"rule relational_operator_");
        try {
            // CPPGrammar.g:300:20: ( relational_operator_ -> ^( REL_OPERATOR relational_operator_ ) )
            // CPPGrammar.g:300:22: relational_operator_
            {
            pushFollow(FOLLOW_relational_operator__in_relational_operator3174);
            relational_operator_274=relational_operator_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relational_operator_.add(relational_operator_274.getTree());

            // AST REWRITE
            // elements: relational_operator_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 300:43: -> ^( REL_OPERATOR relational_operator_ )
            {
                // CPPGrammar.g:300:46: ^( REL_OPERATOR relational_operator_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(REL_OPERATOR, "REL_OPERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_relational_operator_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_operator"


    public static class relational_operator__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_operator_"
    // CPPGrammar.g:301:1: relational_operator_ : ( '<' | '>' | '<=' | '>=' ) ;
    public final CPPGrammarParser.relational_operator__return relational_operator_() throws RecognitionException {
        CPPGrammarParser.relational_operator__return retval = new CPPGrammarParser.relational_operator__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set275=null;

        CommonTree set275_tree=null;

        try {
            // CPPGrammar.g:301:21: ( ( '<' | '>' | '<=' | '>=' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set275=(Token)input.LT(1);

            if ( input.LA(1)==109||input.LA(1)==112||(input.LA(1) >= 115 && input.LA(1) <= 116) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set275)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_operator_"


    public static class shift_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shift_expression"
    // CPPGrammar.g:303:1: shift_expression : additive_expression ( ( '<<' | '>>' ) shift_expression )? ;
    public final CPPGrammarParser.shift_expression_return shift_expression() throws RecognitionException {
        CPPGrammarParser.shift_expression_return retval = new CPPGrammarParser.shift_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set277=null;
        CPPGrammarParser.additive_expression_return additive_expression276 =null;

        CPPGrammarParser.shift_expression_return shift_expression278 =null;


        CommonTree set277_tree=null;

        try {
            // CPPGrammar.g:303:17: ( additive_expression ( ( '<<' | '>>' ) shift_expression )? )
            // CPPGrammar.g:303:19: additive_expression ( ( '<<' | '>>' ) shift_expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_shift_expression3203);
            additive_expression276=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression276.getTree());

            // CPPGrammar.g:303:39: ( ( '<<' | '>>' ) shift_expression )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==110||LA86_0==117) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // CPPGrammar.g:303:41: ( '<<' | '>>' ) shift_expression
                    {
                    set277=(Token)input.LT(1);

                    if ( input.LA(1)==110||input.LA(1)==117 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set277)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_shift_expression_in_shift_expression3213);
                    shift_expression278=shift_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression278.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shift_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // CPPGrammar.g:305:1: additive_expression : multiplicative_expression ( ( '+' | '-' ) additive_expression )? ;
    public final CPPGrammarParser.additive_expression_return additive_expression() throws RecognitionException {
        CPPGrammarParser.additive_expression_return retval = new CPPGrammarParser.additive_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set280=null;
        CPPGrammarParser.multiplicative_expression_return multiplicative_expression279 =null;

        CPPGrammarParser.additive_expression_return additive_expression281 =null;


        CommonTree set280_tree=null;

        try {
            // CPPGrammar.g:305:20: ( multiplicative_expression ( ( '+' | '-' ) additive_expression )? )
            // CPPGrammar.g:305:22: multiplicative_expression ( ( '+' | '-' ) additive_expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression3222);
            multiplicative_expression279=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression279.getTree());

            // CPPGrammar.g:305:48: ( ( '+' | '-' ) additive_expression )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==96||LA87_0==100) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // CPPGrammar.g:305:49: ( '+' | '-' ) additive_expression
                    {
                    set280=(Token)input.LT(1);

                    if ( input.LA(1)==96||input.LA(1)==100 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set280)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_additive_expression_in_additive_expression3232);
                    additive_expression281=additive_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression281.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additive_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // CPPGrammar.g:307:1: multiplicative_expression : cast_expression ( ( '*' | '/' | '%' ) cast_expression )? ;
    public final CPPGrammarParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        CPPGrammarParser.multiplicative_expression_return retval = new CPPGrammarParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set283=null;
        CPPGrammarParser.cast_expression_return cast_expression282 =null;

        CPPGrammarParser.cast_expression_return cast_expression284 =null;


        CommonTree set283_tree=null;

        try {
            // CPPGrammar.g:307:26: ( cast_expression ( ( '*' | '/' | '%' ) cast_expression )? )
            // CPPGrammar.g:307:28: cast_expression ( ( '*' | '/' | '%' ) cast_expression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3241);
            cast_expression282=cast_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression282.getTree());

            // CPPGrammar.g:307:44: ( ( '*' | '/' | '%' ) cast_expression )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==87||LA88_0==94||LA88_0==105) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // CPPGrammar.g:307:46: ( '*' | '/' | '%' ) cast_expression
                    {
                    set283=(Token)input.LT(1);

                    if ( input.LA(1)==87||input.LA(1)==94||input.LA(1)==105 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set283)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression3255);
                    cast_expression284=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression284.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"


    public static class cast_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cast_expression"
    // CPPGrammar.g:309:1: cast_expression : ( ( ( '(' type_name ( ptr_operator )* ')' )=> '(' type_name ( ptr_operator )* ')' cast_expression ) | unary_expression );
    public final CPPGrammarParser.cast_expression_return cast_expression() throws RecognitionException {
        CPPGrammarParser.cast_expression_return retval = new CPPGrammarParser.cast_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal285=null;
        Token char_literal288=null;
        CPPGrammarParser.type_name_return type_name286 =null;

        CPPGrammarParser.ptr_operator_return ptr_operator287 =null;

        CPPGrammarParser.cast_expression_return cast_expression289 =null;

        CPPGrammarParser.unary_expression_return unary_expression290 =null;


        CommonTree char_literal285_tree=null;
        CommonTree char_literal288_tree=null;

        try {
            // CPPGrammar.g:309:16: ( ( ( '(' type_name ( ptr_operator )* ')' )=> '(' type_name ( ptr_operator )* ')' cast_expression ) | unary_expression )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==92) ) {
                int LA90_1 = input.LA(2);

                if ( (synpred11_CPPGrammar()) ) {
                    alt90=1;
                }
                else if ( (true) ) {
                    alt90=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA90_0==ALPHA_NUMERIC||LA90_0==DECIMAL_LITERAL||LA90_0==FLOATING_POINT_LITERAL||LA90_0==HEX_LITERAL||LA90_0==OCTAL_LITERAL||LA90_0==STRING||LA90_0==83||LA90_0==90||LA90_0==94||(LA90_0 >= 96 && LA90_0 <= 97)||(LA90_0 >= 100 && LA90_0 <= 101)||LA90_0==167) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;

            }
            switch (alt90) {
                case 1 :
                    // CPPGrammar.g:309:18: ( ( '(' type_name ( ptr_operator )* ')' )=> '(' type_name ( ptr_operator )* ')' cast_expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:309:18: ( ( '(' type_name ( ptr_operator )* ')' )=> '(' type_name ( ptr_operator )* ')' cast_expression )
                    // CPPGrammar.g:309:19: ( '(' type_name ( ptr_operator )* ')' )=> '(' type_name ( ptr_operator )* ')' cast_expression
                    {
                    char_literal285=(Token)match(input,92,FOLLOW_92_in_cast_expression3278); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal285_tree = 
                    (CommonTree)adaptor.create(char_literal285)
                    ;
                    adaptor.addChild(root_0, char_literal285_tree);
                    }

                    pushFollow(FOLLOW_type_name_in_cast_expression3280);
                    type_name286=type_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name286.getTree());

                    // CPPGrammar.g:309:70: ( ptr_operator )*
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==90||LA89_0==94) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // CPPGrammar.g:309:70: ptr_operator
                    	    {
                    	    pushFollow(FOLLOW_ptr_operator_in_cast_expression3282);
                    	    ptr_operator287=ptr_operator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ptr_operator287.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop89;
                        }
                    } while (true);


                    char_literal288=(Token)match(input,93,FOLLOW_93_in_cast_expression3285); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal288_tree = 
                    (CommonTree)adaptor.create(char_literal288)
                    ;
                    adaptor.addChild(root_0, char_literal288_tree);
                    }

                    pushFollow(FOLLOW_cast_expression_in_cast_expression3287);
                    cast_expression289=cast_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression289.getTree());

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:310:7: unary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unary_expression_in_cast_expression3296);
                    unary_expression290=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression290.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cast_expression"


    public static class call_template_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_template_list"
    // CPPGrammar.g:313:1: call_template_list : ( '<' template_param_list '>' ) ;
    public final CPPGrammarParser.call_template_list_return call_template_list() throws RecognitionException {
        CPPGrammarParser.call_template_list_return retval = new CPPGrammarParser.call_template_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal291=null;
        Token char_literal293=null;
        CPPGrammarParser.template_param_list_return template_param_list292 =null;


        CommonTree char_literal291_tree=null;
        CommonTree char_literal293_tree=null;

        try {
            // CPPGrammar.g:313:19: ( ( '<' template_param_list '>' ) )
            // CPPGrammar.g:313:21: ( '<' template_param_list '>' )
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:313:21: ( '<' template_param_list '>' )
            // CPPGrammar.g:313:22: '<' template_param_list '>'
            {
            char_literal291=(Token)match(input,109,FOLLOW_109_in_call_template_list3309); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal291_tree = 
            (CommonTree)adaptor.create(char_literal291)
            ;
            adaptor.addChild(root_0, char_literal291_tree);
            }

            pushFollow(FOLLOW_template_param_list_in_call_template_list3311);
            template_param_list292=template_param_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, template_param_list292.getTree());

            char_literal293=(Token)match(input,115,FOLLOW_115_in_call_template_list3313); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal293_tree = 
            (CommonTree)adaptor.create(char_literal293)
            ;
            adaptor.addChild(root_0, char_literal293_tree);
            }

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "call_template_list"


    public static class function_argument_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_argument_list"
    // CPPGrammar.g:315:1: function_argument_list : '(' ( function_argument ( ',' function_argument )* )? ')' ;
    public final CPPGrammarParser.function_argument_list_return function_argument_list() throws RecognitionException {
        CPPGrammarParser.function_argument_list_return retval = new CPPGrammarParser.function_argument_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal294=null;
        Token char_literal296=null;
        Token char_literal298=null;
        CPPGrammarParser.function_argument_return function_argument295 =null;

        CPPGrammarParser.function_argument_return function_argument297 =null;


        CommonTree char_literal294_tree=null;
        CommonTree char_literal296_tree=null;
        CommonTree char_literal298_tree=null;

        try {
            // CPPGrammar.g:315:23: ( '(' ( function_argument ( ',' function_argument )* )? ')' )
            // CPPGrammar.g:315:25: '(' ( function_argument ( ',' function_argument )* )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal294=(Token)match(input,92,FOLLOW_92_in_function_argument_list3322); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal294_tree = 
            (CommonTree)adaptor.create(char_literal294)
            ;
            adaptor.addChild(root_0, char_literal294_tree);
            }

            // CPPGrammar.g:315:29: ( function_argument ( ',' function_argument )* )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==ALPHA_NUMERIC||LA92_0==DECIMAL_LITERAL||LA92_0==FLOATING_POINT_LITERAL||LA92_0==HEX_LITERAL||LA92_0==OCTAL_LITERAL||LA92_0==STRING||LA92_0==83||LA92_0==90||LA92_0==92||LA92_0==94||(LA92_0 >= 96 && LA92_0 <= 97)||(LA92_0 >= 100 && LA92_0 <= 101)||LA92_0==167) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // CPPGrammar.g:315:31: function_argument ( ',' function_argument )*
                    {
                    pushFollow(FOLLOW_function_argument_in_function_argument_list3326);
                    function_argument295=function_argument();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument295.getTree());

                    // CPPGrammar.g:315:49: ( ',' function_argument )*
                    loop91:
                    do {
                        int alt91=2;
                        int LA91_0 = input.LA(1);

                        if ( (LA91_0==99) ) {
                            alt91=1;
                        }


                        switch (alt91) {
                    	case 1 :
                    	    // CPPGrammar.g:315:50: ',' function_argument
                    	    {
                    	    char_literal296=(Token)match(input,99,FOLLOW_99_in_function_argument_list3329); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal296_tree = 
                    	    (CommonTree)adaptor.create(char_literal296)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal296_tree);
                    	    }

                    	    pushFollow(FOLLOW_function_argument_in_function_argument_list3331);
                    	    function_argument297=function_argument();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument297.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop91;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal298=(Token)match(input,93,FOLLOW_93_in_function_argument_list3338); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal298_tree = 
            (CommonTree)adaptor.create(char_literal298)
            ;
            adaptor.addChild(root_0, char_literal298_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_argument_list"


    public static class function_argument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_argument"
    // CPPGrammar.g:316:1: function_argument : assign_expr -> ^( ARGUMENT assign_expr ) ;
    public final CPPGrammarParser.function_argument_return function_argument() throws RecognitionException {
        CPPGrammarParser.function_argument_return retval = new CPPGrammarParser.function_argument_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.assign_expr_return assign_expr299 =null;


        RewriteRuleSubtreeStream stream_assign_expr=new RewriteRuleSubtreeStream(adaptor,"rule assign_expr");
        try {
            // CPPGrammar.g:316:18: ( assign_expr -> ^( ARGUMENT assign_expr ) )
            // CPPGrammar.g:316:20: assign_expr
            {
            pushFollow(FOLLOW_assign_expr_in_function_argument3344);
            assign_expr299=assign_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_assign_expr.add(assign_expr299.getTree());

            // AST REWRITE
            // elements: assign_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 316:32: -> ^( ARGUMENT assign_expr )
            {
                // CPPGrammar.g:316:35: ^( ARGUMENT assign_expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARGUMENT, "ARGUMENT")
                , root_1);

                adaptor.addChild(root_1, stream_assign_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_argument"


    public static class unary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expression"
    // CPPGrammar.g:318:1: unary_expression : ( ( postfix_expression -> postfix_expression ) | '--' unary_expression | '++' unary_expression | ( ( unary_operator )+ postfix_expression ) -> ^( UNARY_EXPR ( unary_operator )+ postfix_expression ) );
    public final CPPGrammarParser.unary_expression_return unary_expression() throws RecognitionException {
        CPPGrammarParser.unary_expression_return retval = new CPPGrammarParser.unary_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal301=null;
        Token string_literal303=null;
        CPPGrammarParser.postfix_expression_return postfix_expression300 =null;

        CPPGrammarParser.unary_expression_return unary_expression302 =null;

        CPPGrammarParser.unary_expression_return unary_expression304 =null;

        CPPGrammarParser.unary_operator_return unary_operator305 =null;

        CPPGrammarParser.postfix_expression_return postfix_expression306 =null;


        CommonTree string_literal301_tree=null;
        CommonTree string_literal303_tree=null;
        RewriteRuleSubtreeStream stream_unary_operator=new RewriteRuleSubtreeStream(adaptor,"rule unary_operator");
        RewriteRuleSubtreeStream stream_postfix_expression=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression");
        try {
            // CPPGrammar.g:318:17: ( ( postfix_expression -> postfix_expression ) | '--' unary_expression | '++' unary_expression | ( ( unary_operator )+ postfix_expression ) -> ^( UNARY_EXPR ( unary_operator )+ postfix_expression ) )
            int alt94=4;
            switch ( input.LA(1) ) {
            case ALPHA_NUMERIC:
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case STRING:
            case 92:
                {
                alt94=1;
                }
                break;
            case 101:
                {
                alt94=2;
                }
                break;
            case 97:
                {
                alt94=3;
                }
                break;
            case 83:
            case 90:
            case 94:
            case 96:
            case 100:
            case 167:
                {
                alt94=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;

            }

            switch (alt94) {
                case 1 :
                    // CPPGrammar.g:318:19: ( postfix_expression -> postfix_expression )
                    {
                    // CPPGrammar.g:318:19: ( postfix_expression -> postfix_expression )
                    // CPPGrammar.g:318:20: postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3360);
                    postfix_expression300=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression300.getTree());

                    // AST REWRITE
                    // elements: postfix_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 318:39: -> postfix_expression
                    {
                        adaptor.addChild(root_0, stream_postfix_expression.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:319:3: '--' unary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal301=(Token)match(input,101,FOLLOW_101_in_unary_expression3369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal301_tree = 
                    (CommonTree)adaptor.create(string_literal301)
                    ;
                    adaptor.addChild(root_0, string_literal301_tree);
                    }

                    pushFollow(FOLLOW_unary_expression_in_unary_expression3371);
                    unary_expression302=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression302.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:320:3: '++' unary_expression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal303=(Token)match(input,97,FOLLOW_97_in_unary_expression3375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal303_tree = 
                    (CommonTree)adaptor.create(string_literal303)
                    ;
                    adaptor.addChild(root_0, string_literal303_tree);
                    }

                    pushFollow(FOLLOW_unary_expression_in_unary_expression3377);
                    unary_expression304=unary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression304.getTree());

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:321:3: ( ( unary_operator )+ postfix_expression )
                    {
                    // CPPGrammar.g:321:3: ( ( unary_operator )+ postfix_expression )
                    // CPPGrammar.g:321:4: ( unary_operator )+ postfix_expression
                    {
                    // CPPGrammar.g:321:4: ( unary_operator )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==83||LA93_0==90||LA93_0==94||LA93_0==96||LA93_0==100||LA93_0==167) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // CPPGrammar.g:321:4: unary_operator
                    	    {
                    	    pushFollow(FOLLOW_unary_operator_in_unary_expression3382);
                    	    unary_operator305=unary_operator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_unary_operator.add(unary_operator305.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt93 >= 1 ) break loop93;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
                    } while (true);


                    pushFollow(FOLLOW_postfix_expression_in_unary_expression3385);
                    postfix_expression306=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression306.getTree());

                    }


                    // AST REWRITE
                    // elements: unary_operator, postfix_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 321:40: -> ^( UNARY_EXPR ( unary_operator )+ postfix_expression )
                    {
                        // CPPGrammar.g:321:43: ^( UNARY_EXPR ( unary_operator )+ postfix_expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(UNARY_EXPR, "UNARY_EXPR")
                        , root_1);

                        if ( !(stream_unary_operator.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_unary_operator.hasNext() ) {
                            adaptor.addChild(root_1, stream_unary_operator.nextTree());

                        }
                        stream_unary_operator.reset();

                        adaptor.addChild(root_1, stream_postfix_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_expression"


    protected static class postfix_expression_scope {
        CommonTree callTail;
        Token openingBracket;
    }
    protected Stack postfix_expression_stack = new Stack();


    public static class postfix_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expression"
    // CPPGrammar.g:324:1: postfix_expression : (func_called= callee ( ( function_call_tail )=>x= function_call_tail (tail= postfix_tail )? )? ) -> {$postfix_expression::callTail != null}? ^( FUNCTION_CALL ^( CALLEE $func_called) $x) ( $tail)? -> {$postfix_expression::openingBracket == null}? ( ^( FIELD $func_called ( $tail)? ) )? -> ( $func_called ( $tail)? )? ;
    public final CPPGrammarParser.postfix_expression_return postfix_expression() throws RecognitionException {
        postfix_expression_stack.push(new postfix_expression_scope());
        CPPGrammarParser.postfix_expression_return retval = new CPPGrammarParser.postfix_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.callee_return func_called =null;

        CPPGrammarParser.function_call_tail_return x =null;

        CPPGrammarParser.postfix_tail_return tail =null;


        RewriteRuleSubtreeStream stream_function_call_tail=new RewriteRuleSubtreeStream(adaptor,"rule function_call_tail");
        RewriteRuleSubtreeStream stream_postfix_tail=new RewriteRuleSubtreeStream(adaptor,"rule postfix_tail");
        RewriteRuleSubtreeStream stream_callee=new RewriteRuleSubtreeStream(adaptor,"rule callee");
        try {
            // CPPGrammar.g:329:3: ( (func_called= callee ( ( function_call_tail )=>x= function_call_tail (tail= postfix_tail )? )? ) -> {$postfix_expression::callTail != null}? ^( FUNCTION_CALL ^( CALLEE $func_called) $x) ( $tail)? -> {$postfix_expression::openingBracket == null}? ( ^( FIELD $func_called ( $tail)? ) )? -> ( $func_called ( $tail)? )? )
            // CPPGrammar.g:329:3: (func_called= callee ( ( function_call_tail )=>x= function_call_tail (tail= postfix_tail )? )? )
            {
            // CPPGrammar.g:329:3: (func_called= callee ( ( function_call_tail )=>x= function_call_tail (tail= postfix_tail )? )? )
            // CPPGrammar.g:329:5: func_called= callee ( ( function_call_tail )=>x= function_call_tail (tail= postfix_tail )? )?
            {
            pushFollow(FOLLOW_callee_in_postfix_expression3413);
            func_called=callee();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_callee.add(func_called.getTree());

            // CPPGrammar.g:329:24: ( ( function_call_tail )=>x= function_call_tail (tail= postfix_tail )? )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==109) ) {
                int LA96_1 = input.LA(2);

                if ( (synpred12_CPPGrammar()) ) {
                    alt96=1;
                }
            }
            else if ( (LA96_0==92) && (synpred12_CPPGrammar())) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // CPPGrammar.g:329:25: ( function_call_tail )=>x= function_call_tail (tail= postfix_tail )?
                    {
                    pushFollow(FOLLOW_function_call_tail_in_postfix_expression3423);
                    x=function_call_tail();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_call_tail.add(x.getTree());

                    if ( state.backtracking==0 ) {((postfix_expression_scope)postfix_expression_stack.peek()).callTail = (CommonTree) x.getTree();}

                    // CPPGrammar.g:329:133: (tail= postfix_tail )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==DOT||LA95_0==103||LA95_0==119) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // CPPGrammar.g:329:133: tail= postfix_tail
                            {
                            pushFollow(FOLLOW_postfix_tail_in_postfix_expression3429);
                            tail=postfix_tail();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_postfix_tail.add(tail.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: tail, x, func_called, func_called, tail, tail, func_called
            // token labels: 
            // rule labels: tail, x, func_called, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_tail=new RewriteRuleSubtreeStream(adaptor,"rule tail",tail!=null?tail.tree:null);
            RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"rule x",x!=null?x.tree:null);
            RewriteRuleSubtreeStream stream_func_called=new RewriteRuleSubtreeStream(adaptor,"rule func_called",func_called!=null?func_called.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 330:5: -> {$postfix_expression::callTail != null}? ^( FUNCTION_CALL ^( CALLEE $func_called) $x) ( $tail)?
            if (((postfix_expression_scope)postfix_expression_stack.peek()).callTail != null) {
                // CPPGrammar.g:330:49: ^( FUNCTION_CALL ^( CALLEE $func_called) $x)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL")
                , root_1);

                // CPPGrammar.g:330:65: ^( CALLEE $func_called)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CALLEE, "CALLEE")
                , root_2);

                adaptor.addChild(root_2, stream_func_called.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_x.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // CPPGrammar.g:330:93: ( $tail)?
                if ( stream_tail.hasNext() ) {
                    adaptor.addChild(root_0, stream_tail.nextTree());

                }
                stream_tail.reset();

            }

            else // 331:5: -> {$postfix_expression::openingBracket == null}? ( ^( FIELD $func_called ( $tail)? ) )?
            if (((postfix_expression_scope)postfix_expression_stack.peek()).openingBracket == null) {
                // CPPGrammar.g:331:55: ( ^( FIELD $func_called ( $tail)? ) )?
                if ( stream_tail.hasNext()||stream_func_called.hasNext() ) {
                    // CPPGrammar.g:331:55: ^( FIELD $func_called ( $tail)? )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(FIELD, "FIELD")
                    , root_1);

                    adaptor.addChild(root_1, stream_func_called.nextTree());

                    // CPPGrammar.g:331:77: ( $tail)?
                    if ( stream_tail.hasNext() ) {
                        adaptor.addChild(root_1, stream_tail.nextTree());

                    }
                    stream_tail.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_tail.reset();
                stream_func_called.reset();

            }

            else // 332:5: -> ( $func_called ( $tail)? )?
            {
                // CPPGrammar.g:332:8: ( $func_called ( $tail)? )?
                if ( stream_tail.hasNext()||stream_func_called.hasNext() ) {
                    adaptor.addChild(root_0, stream_func_called.nextTree());

                    // CPPGrammar.g:332:23: ( $tail)?
                    if ( stream_tail.hasNext() ) {
                        adaptor.addChild(root_0, stream_tail.nextTree());

                    }
                    stream_tail.reset();

                }
                stream_tail.reset();
                stream_func_called.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            postfix_expression_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"


    public static class callee_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callee"
    // CPPGrammar.g:335:1: callee : ( primary_expression ( postfix )* ) ;
    public final CPPGrammarParser.callee_return callee() throws RecognitionException {
        CPPGrammarParser.callee_return retval = new CPPGrammarParser.callee_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.primary_expression_return primary_expression307 =null;

        CPPGrammarParser.postfix_return postfix308 =null;



        try {
            // CPPGrammar.g:335:7: ( ( primary_expression ( postfix )* ) )
            // CPPGrammar.g:335:9: ( primary_expression ( postfix )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:335:9: ( primary_expression ( postfix )* )
            // CPPGrammar.g:335:10: primary_expression ( postfix )*
            {
            pushFollow(FOLLOW_primary_expression_in_callee3504);
            primary_expression307=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression307.getTree());

            // CPPGrammar.g:335:29: ( postfix )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==DOT||LA97_0==97||LA97_0==101||LA97_0==103||LA97_0==119) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // CPPGrammar.g:335:29: postfix
            	    {
            	    pushFollow(FOLLOW_postfix_in_callee3506);
            	    postfix308=postfix();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix308.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callee"


    public static class postfix_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_tail"
    // CPPGrammar.g:336:1: postfix_tail : ( ( ( '.' | '->' ) primary_expression ) | '[' primary_expression ']' );
    public final CPPGrammarParser.postfix_tail_return postfix_tail() throws RecognitionException {
        CPPGrammarParser.postfix_tail_return retval = new CPPGrammarParser.postfix_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set309=null;
        Token char_literal311=null;
        Token char_literal313=null;
        CPPGrammarParser.primary_expression_return primary_expression310 =null;

        CPPGrammarParser.primary_expression_return primary_expression312 =null;


        CommonTree set309_tree=null;
        CommonTree char_literal311_tree=null;
        CommonTree char_literal313_tree=null;

        try {
            // CPPGrammar.g:336:13: ( ( ( '.' | '->' ) primary_expression ) | '[' primary_expression ']' )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==DOT||LA98_0==103) ) {
                alt98=1;
            }
            else if ( (LA98_0==119) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // CPPGrammar.g:336:15: ( ( '.' | '->' ) primary_expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:336:15: ( ( '.' | '->' ) primary_expression )
                    // CPPGrammar.g:336:16: ( '.' | '->' ) primary_expression
                    {
                    set309=(Token)input.LT(1);

                    if ( input.LA(1)==DOT||input.LA(1)==103 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set309)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_primary_expression_in_postfix_tail3521);
                    primary_expression310=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression310.getTree());

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:337:15: '[' primary_expression ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal311=(Token)match(input,119,FOLLOW_119_in_postfix_tail3538); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal311_tree = 
                    (CommonTree)adaptor.create(char_literal311)
                    ;
                    adaptor.addChild(root_0, char_literal311_tree);
                    }

                    pushFollow(FOLLOW_primary_expression_in_postfix_tail3540);
                    primary_expression312=primary_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression312.getTree());

                    char_literal313=(Token)match(input,120,FOLLOW_120_in_postfix_tail3542); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal313_tree = 
                    (CommonTree)adaptor.create(char_literal313)
                    ;
                    adaptor.addChild(root_0, char_literal313_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfix_tail"


    public static class postfix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix"
    // CPPGrammar.g:340:1: postfix : ( ( '.' identifier | '->' identifier | '[' expr ']' ) | '++' | '--' );
    public final CPPGrammarParser.postfix_return postfix() throws RecognitionException {
        CPPGrammarParser.postfix_return retval = new CPPGrammarParser.postfix_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal314=null;
        Token string_literal316=null;
        Token char_literal318=null;
        Token char_literal320=null;
        Token string_literal321=null;
        Token string_literal322=null;
        CPPGrammarParser.identifier_return identifier315 =null;

        CPPGrammarParser.identifier_return identifier317 =null;

        CPPGrammarParser.expr_return expr319 =null;


        CommonTree char_literal314_tree=null;
        CommonTree string_literal316_tree=null;
        CommonTree char_literal318_tree=null;
        CommonTree char_literal320_tree=null;
        CommonTree string_literal321_tree=null;
        CommonTree string_literal322_tree=null;

        try {
            // CPPGrammar.g:340:8: ( ( '.' identifier | '->' identifier | '[' expr ']' ) | '++' | '--' )
            int alt100=3;
            switch ( input.LA(1) ) {
            case DOT:
            case 103:
            case 119:
                {
                alt100=1;
                }
                break;
            case 97:
                {
                alt100=2;
                }
                break;
            case 101:
                {
                alt100=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;

            }

            switch (alt100) {
                case 1 :
                    // CPPGrammar.g:340:10: ( '.' identifier | '->' identifier | '[' expr ']' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:340:10: ( '.' identifier | '->' identifier | '[' expr ']' )
                    int alt99=3;
                    switch ( input.LA(1) ) {
                    case DOT:
                        {
                        alt99=1;
                        }
                        break;
                    case 103:
                        {
                        alt99=2;
                        }
                        break;
                    case 119:
                        {
                        alt99=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;

                    }

                    switch (alt99) {
                        case 1 :
                            // CPPGrammar.g:340:11: '.' identifier
                            {
                            char_literal314=(Token)match(input,DOT,FOLLOW_DOT_in_postfix3551); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal314_tree = 
                            (CommonTree)adaptor.create(char_literal314)
                            ;
                            adaptor.addChild(root_0, char_literal314_tree);
                            }

                            pushFollow(FOLLOW_identifier_in_postfix3553);
                            identifier315=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier315.getTree());

                            }
                            break;
                        case 2 :
                            // CPPGrammar.g:341:12: '->' identifier
                            {
                            string_literal316=(Token)match(input,103,FOLLOW_103_in_postfix3566); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal316_tree = 
                            (CommonTree)adaptor.create(string_literal316)
                            ;
                            adaptor.addChild(root_0, string_literal316_tree);
                            }

                            pushFollow(FOLLOW_identifier_in_postfix3568);
                            identifier317=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier317.getTree());

                            }
                            break;
                        case 3 :
                            // CPPGrammar.g:342:12: '[' expr ']'
                            {
                            char_literal318=(Token)match(input,119,FOLLOW_119_in_postfix3581); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal318_tree = 
                            (CommonTree)adaptor.create(char_literal318)
                            ;
                            adaptor.addChild(root_0, char_literal318_tree);
                            }

                            pushFollow(FOLLOW_expr_in_postfix3583);
                            expr319=expr();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr319.getTree());

                            char_literal320=(Token)match(input,120,FOLLOW_120_in_postfix3585); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal320_tree = 
                            (CommonTree)adaptor.create(char_literal320)
                            ;
                            adaptor.addChild(root_0, char_literal320_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:343:12: '++'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal321=(Token)match(input,97,FOLLOW_97_in_postfix3599); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal321_tree = 
                    (CommonTree)adaptor.create(string_literal321)
                    ;
                    adaptor.addChild(root_0, string_literal321_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:344:12: '--'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal322=(Token)match(input,101,FOLLOW_101_in_postfix3612); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal322_tree = 
                    (CommonTree)adaptor.create(string_literal322)
                    ;
                    adaptor.addChild(root_0, string_literal322_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfix"


    public static class function_call_tail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_call_tail"
    // CPPGrammar.g:348:1: function_call_tail : ( call_template_list function_argument_list | function_argument_list );
    public final CPPGrammarParser.function_call_tail_return function_call_tail() throws RecognitionException {
        CPPGrammarParser.function_call_tail_return retval = new CPPGrammarParser.function_call_tail_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.call_template_list_return call_template_list323 =null;

        CPPGrammarParser.function_argument_list_return function_argument_list324 =null;

        CPPGrammarParser.function_argument_list_return function_argument_list325 =null;



        try {
            // CPPGrammar.g:348:19: ( call_template_list function_argument_list | function_argument_list )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==109) ) {
                alt101=1;
            }
            else if ( (LA101_0==92) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;

            }
            switch (alt101) {
                case 1 :
                    // CPPGrammar.g:348:21: call_template_list function_argument_list
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_call_template_list_in_function_call_tail3621);
                    call_template_list323=call_template_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call_template_list323.getTree());

                    pushFollow(FOLLOW_function_argument_list_in_function_call_tail3623);
                    function_argument_list324=function_argument_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument_list324.getTree());

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:349:21: function_argument_list
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_function_argument_list_in_function_call_tail3645);
                    function_argument_list325=function_argument_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_argument_list325.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_call_tail"


    public static class primary_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary_expression"
    // CPPGrammar.g:352:1: primary_expression : (x= '(' expr_ ')' | identifier | constant ) ;
    public final CPPGrammarParser.primary_expression_return primary_expression() throws RecognitionException {
        CPPGrammarParser.primary_expression_return retval = new CPPGrammarParser.primary_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token x=null;
        Token char_literal327=null;
        CPPGrammarParser.expr__return expr_326 =null;

        CPPGrammarParser.identifier_return identifier328 =null;

        CPPGrammarParser.constant_return constant329 =null;


        CommonTree x_tree=null;
        CommonTree char_literal327_tree=null;

        try {
            // CPPGrammar.g:352:19: ( (x= '(' expr_ ')' | identifier | constant ) )
            // CPPGrammar.g:352:21: (x= '(' expr_ ')' | identifier | constant )
            {
            root_0 = (CommonTree)adaptor.nil();


            // CPPGrammar.g:352:21: (x= '(' expr_ ')' | identifier | constant )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt102=1;
                }
                break;
            case ALPHA_NUMERIC:
                {
                alt102=2;
                }
                break;
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case STRING:
                {
                alt102=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }

            switch (alt102) {
                case 1 :
                    // CPPGrammar.g:352:22: x= '(' expr_ ')'
                    {
                    x=(Token)match(input,92,FOLLOW_92_in_primary_expression3674); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    x_tree = 
                    (CommonTree)adaptor.create(x)
                    ;
                    adaptor.addChild(root_0, x_tree);
                    }

                    pushFollow(FOLLOW_expr__in_primary_expression3676);
                    expr_326=expr_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_326.getTree());

                    char_literal327=(Token)match(input,93,FOLLOW_93_in_primary_expression3678); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal327_tree = 
                    (CommonTree)adaptor.create(char_literal327)
                    ;
                    adaptor.addChild(root_0, char_literal327_tree);
                    }

                    }
                    break;
                case 2 :
                    // CPPGrammar.g:352:40: identifier
                    {
                    pushFollow(FOLLOW_identifier_in_primary_expression3682);
                    identifier328=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier328.getTree());

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:352:53: constant
                    {
                    pushFollow(FOLLOW_constant_in_primary_expression3686);
                    constant329=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant329.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) { if(x != null) ((postfix_expression_scope)postfix_expression_stack.peek()).openingBracket = x; }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "primary_expression"


    public static class unary_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_operator"
    // CPPGrammar.g:354:1: unary_operator : unary_operator_ -> ^( UNARY_OPERATOR unary_operator_ ) ;
    public final CPPGrammarParser.unary_operator_return unary_operator() throws RecognitionException {
        CPPGrammarParser.unary_operator_return retval = new CPPGrammarParser.unary_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.unary_operator__return unary_operator_330 =null;


        RewriteRuleSubtreeStream stream_unary_operator_=new RewriteRuleSubtreeStream(adaptor,"rule unary_operator_");
        try {
            // CPPGrammar.g:354:15: ( unary_operator_ -> ^( UNARY_OPERATOR unary_operator_ ) )
            // CPPGrammar.g:354:17: unary_operator_
            {
            pushFollow(FOLLOW_unary_operator__in_unary_operator3697);
            unary_operator_330=unary_operator_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unary_operator_.add(unary_operator_330.getTree());

            // AST REWRITE
            // elements: unary_operator_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 354:33: -> ^( UNARY_OPERATOR unary_operator_ )
            {
                // CPPGrammar.g:354:36: ^( UNARY_OPERATOR unary_operator_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UNARY_OPERATOR, "UNARY_OPERATOR")
                , root_1);

                adaptor.addChild(root_1, stream_unary_operator_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_operator"


    public static class unary_operator__return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_operator_"
    // CPPGrammar.g:356:1: unary_operator_ : ( '&' | '*' | '+' | '-' | '~' | '!' );
    public final CPPGrammarParser.unary_operator__return unary_operator_() throws RecognitionException {
        CPPGrammarParser.unary_operator__return retval = new CPPGrammarParser.unary_operator__return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set331=null;

        CommonTree set331_tree=null;

        try {
            // CPPGrammar.g:357:2: ( '&' | '*' | '+' | '-' | '~' | '!' )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set331=(Token)input.LT(1);

            if ( input.LA(1)==83||input.LA(1)==90||input.LA(1)==94||input.LA(1)==96||input.LA(1)==100||input.LA(1)==167 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set331)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_operator_"


    public static class constant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // CPPGrammar.g:365:1: constant : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | STRING | FLOATING_POINT_LITERAL );
    public final CPPGrammarParser.constant_return constant() throws RecognitionException {
        CPPGrammarParser.constant_return retval = new CPPGrammarParser.constant_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set332=null;

        CommonTree set332_tree=null;

        try {
            // CPPGrammar.g:366:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | STRING | FLOATING_POINT_LITERAL )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set332=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_LITERAL||input.LA(1)==FLOATING_POINT_LITERAL||input.LA(1)==HEX_LITERAL||input.LA(1)==OCTAL_LITERAL||input.LA(1)==STRING ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set332)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant"


    public static class no_brackets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_brackets"
    // CPPGrammar.g:375:1: no_brackets : ~ ( '(' | ')' ) ;
    public final CPPGrammarParser.no_brackets_return no_brackets() throws RecognitionException {
        CPPGrammarParser.no_brackets_return retval = new CPPGrammarParser.no_brackets_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set333=null;

        CommonTree set333_tree=null;

        try {
            // CPPGrammar.g:375:12: (~ ( '(' | ')' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set333=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 91)||(input.LA(1) >= 94 && input.LA(1) <= 167) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set333)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_brackets"


    public static class no_brackets_curlies_or_squares_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_brackets_curlies_or_squares"
    // CPPGrammar.g:376:1: no_brackets_curlies_or_squares : ~ ( '(' | ')' | '{' | '}' | '[' | ']' ) ;
    public final CPPGrammarParser.no_brackets_curlies_or_squares_return no_brackets_curlies_or_squares() throws RecognitionException {
        CPPGrammarParser.no_brackets_curlies_or_squares_return retval = new CPPGrammarParser.no_brackets_curlies_or_squares_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set334=null;

        CommonTree set334_tree=null;

        try {
            // CPPGrammar.g:376:31: (~ ( '(' | ')' | '{' | '}' | '[' | ']' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set334=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 91)||(input.LA(1) >= 94 && input.LA(1) <= 118)||(input.LA(1) >= 121 && input.LA(1) <= 161)||(input.LA(1) >= 163 && input.LA(1) <= 165)||input.LA(1)==167 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set334)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_brackets_curlies_or_squares"


    public static class no_brackets_or_semicolon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_brackets_or_semicolon"
    // CPPGrammar.g:377:1: no_brackets_or_semicolon : ~ ( '(' | ')' | ';' ) ;
    public final CPPGrammarParser.no_brackets_or_semicolon_return no_brackets_or_semicolon() throws RecognitionException {
        CPPGrammarParser.no_brackets_or_semicolon_return retval = new CPPGrammarParser.no_brackets_or_semicolon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set335=null;

        CommonTree set335_tree=null;

        try {
            // CPPGrammar.g:377:25: (~ ( '(' | ')' | ';' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set335=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 91)||(input.LA(1) >= 94 && input.LA(1) <= 107)||(input.LA(1) >= 109 && input.LA(1) <= 167) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set335)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_brackets_or_semicolon"


    public static class no_angle_brackets_or_brackets_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_angle_brackets_or_brackets"
    // CPPGrammar.g:378:1: no_angle_brackets_or_brackets : ~ ( '<' | '>' | '(' | ')' ) ;
    public final CPPGrammarParser.no_angle_brackets_or_brackets_return no_angle_brackets_or_brackets() throws RecognitionException {
        CPPGrammarParser.no_angle_brackets_or_brackets_return retval = new CPPGrammarParser.no_angle_brackets_or_brackets_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set336=null;

        CommonTree set336_tree=null;

        try {
            // CPPGrammar.g:378:31: (~ ( '<' | '>' | '(' | ')' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set336=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 91)||(input.LA(1) >= 94 && input.LA(1) <= 108)||(input.LA(1) >= 110 && input.LA(1) <= 114)||(input.LA(1) >= 116 && input.LA(1) <= 167) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set336)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_angle_brackets_or_brackets"


    public static class no_curlies_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_curlies"
    // CPPGrammar.g:379:1: no_curlies : ~ ( '{' | '}' ) ;
    public final CPPGrammarParser.no_curlies_return no_curlies() throws RecognitionException {
        CPPGrammarParser.no_curlies_return retval = new CPPGrammarParser.no_curlies_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set337=null;

        CommonTree set337_tree=null;

        try {
            // CPPGrammar.g:379:11: (~ ( '{' | '}' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set337=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 161)||(input.LA(1) >= 163 && input.LA(1) <= 165)||input.LA(1)==167 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set337)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_curlies"


    public static class no_squares_or_semicolon_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "no_squares_or_semicolon"
    // CPPGrammar.g:380:1: no_squares_or_semicolon : ~ ( '[' | ']' | ';' ) ;
    public final CPPGrammarParser.no_squares_or_semicolon_return no_squares_or_semicolon() throws RecognitionException {
        CPPGrammarParser.no_squares_or_semicolon_return retval = new CPPGrammarParser.no_squares_or_semicolon_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set338=null;

        CommonTree set338_tree=null;

        try {
            // CPPGrammar.g:380:24: (~ ( '[' | ']' | ';' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set338=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= 107)||(input.LA(1) >= 109 && input.LA(1) <= 118)||(input.LA(1) >= 121 && input.LA(1) <= 167) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set338)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "no_squares_or_semicolon"


    public static class cv_qualifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cv_qualifier"
    // CPPGrammar.g:384:1: cv_qualifier : ( 'const' | 'volatile' );
    public final CPPGrammarParser.cv_qualifier_return cv_qualifier() throws RecognitionException {
        CPPGrammarParser.cv_qualifier_return retval = new CPPGrammarParser.cv_qualifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set339=null;

        CommonTree set339_tree=null;

        try {
            // CPPGrammar.g:384:14: ( 'const' | 'volatile' )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set339=(Token)input.LT(1);

            if ( input.LA(1)==128||input.LA(1)==160 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set339)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cv_qualifier"


    public static class function_decl_specifiers_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_decl_specifiers"
    // CPPGrammar.g:385:1: function_decl_specifiers : ( 'inline' | 'virtual' | 'explicit' | 'friend' | 'static' ) ;
    public final CPPGrammarParser.function_decl_specifiers_return function_decl_specifiers() throws RecognitionException {
        CPPGrammarParser.function_decl_specifiers_return retval = new CPPGrammarParser.function_decl_specifiers_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set340=null;

        CommonTree set340_tree=null;

        try {
            // CPPGrammar.g:385:25: ( ( 'inline' | 'virtual' | 'explicit' | 'friend' | 'static' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set340=(Token)input.LT(1);

            if ( input.LA(1)==134||input.LA(1)==136||input.LA(1)==139||input.LA(1)==149||input.LA(1)==159 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set340)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_decl_specifiers"


    public static class class_key_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "class_key"
    // CPPGrammar.g:386:1: class_key : ( 'struct' | 'class' | 'union' | 'enum' ) ;
    public final CPPGrammarParser.class_key_return class_key() throws RecognitionException {
        CPPGrammarParser.class_key_return retval = new CPPGrammarParser.class_key_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set341=null;

        CommonTree set341_tree=null;

        try {
            // CPPGrammar.g:386:10: ( ( 'struct' | 'class' | 'union' | 'enum' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set341=(Token)input.LT(1);

            if ( input.LA(1)==127||input.LA(1)==133||input.LA(1)==150||input.LA(1)==156 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set341)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "class_key"


    public static class ptr_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ptr_operator"
    // CPPGrammar.g:387:1: ptr_operator : ( '*' | '&' ) ;
    public final CPPGrammarParser.ptr_operator_return ptr_operator() throws RecognitionException {
        CPPGrammarParser.ptr_operator_return retval = new CPPGrammarParser.ptr_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set342=null;

        CommonTree set342_tree=null;

        try {
            // CPPGrammar.g:387:13: ( ( '*' | '&' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set342=(Token)input.LT(1);

            if ( input.LA(1)==90||input.LA(1)==94 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set342)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ptr_operator"


    public static class access_specifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "access_specifier"
    // CPPGrammar.g:389:1: access_specifier : ( 'public' | 'private' | 'protected' ) ;
    public final CPPGrammarParser.access_specifier_return access_specifier() throws RecognitionException {
        CPPGrammarParser.access_specifier_return retval = new CPPGrammarParser.access_specifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set343=null;

        CommonTree set343_tree=null;

        try {
            // CPPGrammar.g:389:17: ( ( 'public' | 'private' | 'protected' ) )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set343=(Token)input.LT(1);

            if ( (input.LA(1) >= 143 && input.LA(1) <= 145) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set343)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "access_specifier"


    public static class operator_function_id_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator_function_id"
    // CPPGrammar.g:390:1: operator_function_id : 'operator' operator ;
    public final CPPGrammarParser.operator_function_id_return operator_function_id() throws RecognitionException {
        CPPGrammarParser.operator_function_id_return retval = new CPPGrammarParser.operator_function_id_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal344=null;
        CPPGrammarParser.operator_return operator345 =null;


        CommonTree string_literal344_tree=null;

        try {
            // CPPGrammar.g:390:21: ( 'operator' operator )
            // CPPGrammar.g:390:23: 'operator' operator
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal344=(Token)match(input,142,FOLLOW_142_in_operator_function_id4003); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal344_tree = 
            (CommonTree)adaptor.create(string_literal344)
            ;
            adaptor.addChild(root_0, string_literal344_tree);
            }

            pushFollow(FOLLOW_operator_in_operator_function_id4005);
            operator345=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, operator345.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operator_function_id"


    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operator"
    // CPPGrammar.g:392:1: operator : ( ( ( 'new' | 'delete' ) ( '[' ']' )? ) | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '>>' | '<<' | '>>=' | '<<=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | '(' ')' | '[' ']' );
    public final CPPGrammarParser.operator_return operator() throws RecognitionException {
        CPPGrammarParser.operator_return retval = new CPPGrammarParser.operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set346=null;
        Token char_literal347=null;
        Token char_literal348=null;
        Token char_literal349=null;
        Token char_literal350=null;
        Token char_literal351=null;
        Token char_literal352=null;
        Token char_literal353=null;
        Token char_literal354=null;
        Token char_literal355=null;
        Token char_literal356=null;
        Token char_literal357=null;
        Token char_literal358=null;
        Token char_literal359=null;
        Token char_literal360=null;
        Token char_literal361=null;
        Token string_literal362=null;
        Token string_literal363=null;
        Token string_literal364=null;
        Token string_literal365=null;
        Token string_literal366=null;
        Token string_literal367=null;
        Token string_literal368=null;
        Token string_literal369=null;
        Token string_literal370=null;
        Token string_literal371=null;
        Token string_literal372=null;
        Token string_literal373=null;
        Token string_literal374=null;
        Token string_literal375=null;
        Token string_literal376=null;
        Token string_literal377=null;
        Token string_literal378=null;
        Token string_literal379=null;
        Token string_literal380=null;
        Token string_literal381=null;
        Token char_literal382=null;
        Token string_literal383=null;
        Token string_literal384=null;
        Token char_literal385=null;
        Token char_literal386=null;
        Token char_literal387=null;
        Token char_literal388=null;

        CommonTree set346_tree=null;
        CommonTree char_literal347_tree=null;
        CommonTree char_literal348_tree=null;
        CommonTree char_literal349_tree=null;
        CommonTree char_literal350_tree=null;
        CommonTree char_literal351_tree=null;
        CommonTree char_literal352_tree=null;
        CommonTree char_literal353_tree=null;
        CommonTree char_literal354_tree=null;
        CommonTree char_literal355_tree=null;
        CommonTree char_literal356_tree=null;
        CommonTree char_literal357_tree=null;
        CommonTree char_literal358_tree=null;
        CommonTree char_literal359_tree=null;
        CommonTree char_literal360_tree=null;
        CommonTree char_literal361_tree=null;
        CommonTree string_literal362_tree=null;
        CommonTree string_literal363_tree=null;
        CommonTree string_literal364_tree=null;
        CommonTree string_literal365_tree=null;
        CommonTree string_literal366_tree=null;
        CommonTree string_literal367_tree=null;
        CommonTree string_literal368_tree=null;
        CommonTree string_literal369_tree=null;
        CommonTree string_literal370_tree=null;
        CommonTree string_literal371_tree=null;
        CommonTree string_literal372_tree=null;
        CommonTree string_literal373_tree=null;
        CommonTree string_literal374_tree=null;
        CommonTree string_literal375_tree=null;
        CommonTree string_literal376_tree=null;
        CommonTree string_literal377_tree=null;
        CommonTree string_literal378_tree=null;
        CommonTree string_literal379_tree=null;
        CommonTree string_literal380_tree=null;
        CommonTree string_literal381_tree=null;
        CommonTree char_literal382_tree=null;
        CommonTree string_literal383_tree=null;
        CommonTree string_literal384_tree=null;
        CommonTree char_literal385_tree=null;
        CommonTree char_literal386_tree=null;
        CommonTree char_literal387_tree=null;
        CommonTree char_literal388_tree=null;

        try {
            // CPPGrammar.g:392:9: ( ( ( 'new' | 'delete' ) ( '[' ']' )? ) | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '>>' | '<<' | '>>=' | '<<=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | '(' ')' | '[' ']' )
            int alt104=39;
            switch ( input.LA(1) ) {
            case 130:
            case 141:
                {
                alt104=1;
                }
                break;
            case 96:
                {
                alt104=2;
                }
                break;
            case 100:
                {
                alt104=3;
                }
                break;
            case 94:
                {
                alt104=4;
                }
                break;
            case 105:
                {
                alt104=5;
                }
                break;
            case 87:
                {
                alt104=6;
                }
                break;
            case 121:
                {
                alt104=7;
                }
                break;
            case 90:
                {
                alt104=8;
                }
                break;
            case 163:
                {
                alt104=9;
                }
                break;
            case 167:
                {
                alt104=10;
                }
                break;
            case 83:
                {
                alt104=11;
                }
                break;
            case 113:
                {
                alt104=12;
                }
                break;
            case 109:
                {
                alt104=13;
                }
                break;
            case 115:
                {
                alt104=14;
                }
                break;
            case 98:
                {
                alt104=15;
                }
                break;
            case 102:
                {
                alt104=16;
                }
                break;
            case 95:
                {
                alt104=17;
                }
                break;
            case 106:
                {
                alt104=18;
                }
                break;
            case 88:
                {
                alt104=19;
                }
                break;
            case 122:
                {
                alt104=20;
                }
                break;
            case 91:
                {
                alt104=21;
                }
                break;
            case 164:
                {
                alt104=22;
                }
                break;
            case 117:
                {
                alt104=23;
                }
                break;
            case 110:
                {
                alt104=24;
                }
                break;
            case 118:
                {
                alt104=25;
                }
                break;
            case 111:
                {
                alt104=26;
                }
                break;
            case 114:
                {
                alt104=27;
                }
                break;
            case 84:
                {
                alt104=28;
                }
                break;
            case 112:
                {
                alt104=29;
                }
                break;
            case 116:
                {
                alt104=30;
                }
                break;
            case 89:
                {
                alt104=31;
                }
                break;
            case 165:
                {
                alt104=32;
                }
                break;
            case 97:
                {
                alt104=33;
                }
                break;
            case 101:
                {
                alt104=34;
                }
                break;
            case 99:
                {
                alt104=35;
                }
                break;
            case 104:
                {
                alt104=36;
                }
                break;
            case 103:
                {
                alt104=37;
                }
                break;
            case 92:
                {
                alt104=38;
                }
                break;
            case 119:
                {
                alt104=39;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }

            switch (alt104) {
                case 1 :
                    // CPPGrammar.g:392:11: ( ( 'new' | 'delete' ) ( '[' ']' )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // CPPGrammar.g:392:11: ( ( 'new' | 'delete' ) ( '[' ']' )? )
                    // CPPGrammar.g:392:12: ( 'new' | 'delete' ) ( '[' ']' )?
                    {
                    set346=(Token)input.LT(1);

                    if ( input.LA(1)==130||input.LA(1)==141 ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(set346)
                        );
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // CPPGrammar.g:392:32: ( '[' ']' )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==119) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // CPPGrammar.g:392:33: '[' ']'
                            {
                            char_literal347=(Token)match(input,119,FOLLOW_119_in_operator4023); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal347_tree = 
                            (CommonTree)adaptor.create(char_literal347)
                            ;
                            adaptor.addChild(root_0, char_literal347_tree);
                            }

                            char_literal348=(Token)match(input,120,FOLLOW_120_in_operator4025); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal348_tree = 
                            (CommonTree)adaptor.create(char_literal348)
                            ;
                            adaptor.addChild(root_0, char_literal348_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // CPPGrammar.g:393:5: '+'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal349=(Token)match(input,96,FOLLOW_96_in_operator4034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal349_tree = 
                    (CommonTree)adaptor.create(char_literal349)
                    ;
                    adaptor.addChild(root_0, char_literal349_tree);
                    }

                    }
                    break;
                case 3 :
                    // CPPGrammar.g:393:11: '-'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal350=(Token)match(input,100,FOLLOW_100_in_operator4038); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal350_tree = 
                    (CommonTree)adaptor.create(char_literal350)
                    ;
                    adaptor.addChild(root_0, char_literal350_tree);
                    }

                    }
                    break;
                case 4 :
                    // CPPGrammar.g:393:17: '*'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal351=(Token)match(input,94,FOLLOW_94_in_operator4042); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal351_tree = 
                    (CommonTree)adaptor.create(char_literal351)
                    ;
                    adaptor.addChild(root_0, char_literal351_tree);
                    }

                    }
                    break;
                case 5 :
                    // CPPGrammar.g:393:23: '/'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal352=(Token)match(input,105,FOLLOW_105_in_operator4046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal352_tree = 
                    (CommonTree)adaptor.create(char_literal352)
                    ;
                    adaptor.addChild(root_0, char_literal352_tree);
                    }

                    }
                    break;
                case 6 :
                    // CPPGrammar.g:393:29: '%'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal353=(Token)match(input,87,FOLLOW_87_in_operator4050); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal353_tree = 
                    (CommonTree)adaptor.create(char_literal353)
                    ;
                    adaptor.addChild(root_0, char_literal353_tree);
                    }

                    }
                    break;
                case 7 :
                    // CPPGrammar.g:393:34: '^'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal354=(Token)match(input,121,FOLLOW_121_in_operator4053); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal354_tree = 
                    (CommonTree)adaptor.create(char_literal354)
                    ;
                    adaptor.addChild(root_0, char_literal354_tree);
                    }

                    }
                    break;
                case 8 :
                    // CPPGrammar.g:393:40: '&'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal355=(Token)match(input,90,FOLLOW_90_in_operator4057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal355_tree = 
                    (CommonTree)adaptor.create(char_literal355)
                    ;
                    adaptor.addChild(root_0, char_literal355_tree);
                    }

                    }
                    break;
                case 9 :
                    // CPPGrammar.g:393:46: '|'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal356=(Token)match(input,163,FOLLOW_163_in_operator4061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal356_tree = 
                    (CommonTree)adaptor.create(char_literal356)
                    ;
                    adaptor.addChild(root_0, char_literal356_tree);
                    }

                    }
                    break;
                case 10 :
                    // CPPGrammar.g:393:52: '~'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal357=(Token)match(input,167,FOLLOW_167_in_operator4065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal357_tree = 
                    (CommonTree)adaptor.create(char_literal357)
                    ;
                    adaptor.addChild(root_0, char_literal357_tree);
                    }

                    }
                    break;
                case 11 :
                    // CPPGrammar.g:394:5: '!'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal358=(Token)match(input,83,FOLLOW_83_in_operator4071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal358_tree = 
                    (CommonTree)adaptor.create(char_literal358)
                    ;
                    adaptor.addChild(root_0, char_literal358_tree);
                    }

                    }
                    break;
                case 12 :
                    // CPPGrammar.g:394:11: '='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal359=(Token)match(input,113,FOLLOW_113_in_operator4075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal359_tree = 
                    (CommonTree)adaptor.create(char_literal359)
                    ;
                    adaptor.addChild(root_0, char_literal359_tree);
                    }

                    }
                    break;
                case 13 :
                    // CPPGrammar.g:394:17: '<'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal360=(Token)match(input,109,FOLLOW_109_in_operator4079); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal360_tree = 
                    (CommonTree)adaptor.create(char_literal360)
                    ;
                    adaptor.addChild(root_0, char_literal360_tree);
                    }

                    }
                    break;
                case 14 :
                    // CPPGrammar.g:394:23: '>'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal361=(Token)match(input,115,FOLLOW_115_in_operator4083); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal361_tree = 
                    (CommonTree)adaptor.create(char_literal361)
                    ;
                    adaptor.addChild(root_0, char_literal361_tree);
                    }

                    }
                    break;
                case 15 :
                    // CPPGrammar.g:394:29: '+='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal362=(Token)match(input,98,FOLLOW_98_in_operator4087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal362_tree = 
                    (CommonTree)adaptor.create(string_literal362)
                    ;
                    adaptor.addChild(root_0, string_literal362_tree);
                    }

                    }
                    break;
                case 16 :
                    // CPPGrammar.g:394:36: '-='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal363=(Token)match(input,102,FOLLOW_102_in_operator4091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal363_tree = 
                    (CommonTree)adaptor.create(string_literal363)
                    ;
                    adaptor.addChild(root_0, string_literal363_tree);
                    }

                    }
                    break;
                case 17 :
                    // CPPGrammar.g:394:43: '*='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal364=(Token)match(input,95,FOLLOW_95_in_operator4095); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal364_tree = 
                    (CommonTree)adaptor.create(string_literal364)
                    ;
                    adaptor.addChild(root_0, string_literal364_tree);
                    }

                    }
                    break;
                case 18 :
                    // CPPGrammar.g:395:5: '/='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal365=(Token)match(input,106,FOLLOW_106_in_operator4101); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal365_tree = 
                    (CommonTree)adaptor.create(string_literal365)
                    ;
                    adaptor.addChild(root_0, string_literal365_tree);
                    }

                    }
                    break;
                case 19 :
                    // CPPGrammar.g:395:12: '%='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal366=(Token)match(input,88,FOLLOW_88_in_operator4105); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal366_tree = 
                    (CommonTree)adaptor.create(string_literal366)
                    ;
                    adaptor.addChild(root_0, string_literal366_tree);
                    }

                    }
                    break;
                case 20 :
                    // CPPGrammar.g:395:19: '^='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal367=(Token)match(input,122,FOLLOW_122_in_operator4109); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal367_tree = 
                    (CommonTree)adaptor.create(string_literal367)
                    ;
                    adaptor.addChild(root_0, string_literal367_tree);
                    }

                    }
                    break;
                case 21 :
                    // CPPGrammar.g:395:26: '&='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal368=(Token)match(input,91,FOLLOW_91_in_operator4113); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal368_tree = 
                    (CommonTree)adaptor.create(string_literal368)
                    ;
                    adaptor.addChild(root_0, string_literal368_tree);
                    }

                    }
                    break;
                case 22 :
                    // CPPGrammar.g:395:33: '|='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal369=(Token)match(input,164,FOLLOW_164_in_operator4117); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal369_tree = 
                    (CommonTree)adaptor.create(string_literal369)
                    ;
                    adaptor.addChild(root_0, string_literal369_tree);
                    }

                    }
                    break;
                case 23 :
                    // CPPGrammar.g:395:40: '>>'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal370=(Token)match(input,117,FOLLOW_117_in_operator4121); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal370_tree = 
                    (CommonTree)adaptor.create(string_literal370)
                    ;
                    adaptor.addChild(root_0, string_literal370_tree);
                    }

                    }
                    break;
                case 24 :
                    // CPPGrammar.g:396:4: '<<'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal371=(Token)match(input,110,FOLLOW_110_in_operator4126); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal371_tree = 
                    (CommonTree)adaptor.create(string_literal371)
                    ;
                    adaptor.addChild(root_0, string_literal371_tree);
                    }

                    }
                    break;
                case 25 :
                    // CPPGrammar.g:396:10: '>>='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal372=(Token)match(input,118,FOLLOW_118_in_operator4129); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal372_tree = 
                    (CommonTree)adaptor.create(string_literal372)
                    ;
                    adaptor.addChild(root_0, string_literal372_tree);
                    }

                    }
                    break;
                case 26 :
                    // CPPGrammar.g:396:18: '<<='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal373=(Token)match(input,111,FOLLOW_111_in_operator4133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal373_tree = 
                    (CommonTree)adaptor.create(string_literal373)
                    ;
                    adaptor.addChild(root_0, string_literal373_tree);
                    }

                    }
                    break;
                case 27 :
                    // CPPGrammar.g:396:26: '=='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal374=(Token)match(input,114,FOLLOW_114_in_operator4137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal374_tree = 
                    (CommonTree)adaptor.create(string_literal374)
                    ;
                    adaptor.addChild(root_0, string_literal374_tree);
                    }

                    }
                    break;
                case 28 :
                    // CPPGrammar.g:396:33: '!='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal375=(Token)match(input,84,FOLLOW_84_in_operator4141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal375_tree = 
                    (CommonTree)adaptor.create(string_literal375)
                    ;
                    adaptor.addChild(root_0, string_literal375_tree);
                    }

                    }
                    break;
                case 29 :
                    // CPPGrammar.g:397:5: '<='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal376=(Token)match(input,112,FOLLOW_112_in_operator4147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal376_tree = 
                    (CommonTree)adaptor.create(string_literal376)
                    ;
                    adaptor.addChild(root_0, string_literal376_tree);
                    }

                    }
                    break;
                case 30 :
                    // CPPGrammar.g:397:12: '>='
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal377=(Token)match(input,116,FOLLOW_116_in_operator4151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal377_tree = 
                    (CommonTree)adaptor.create(string_literal377)
                    ;
                    adaptor.addChild(root_0, string_literal377_tree);
                    }

                    }
                    break;
                case 31 :
                    // CPPGrammar.g:397:19: '&&'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal378=(Token)match(input,89,FOLLOW_89_in_operator4155); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal378_tree = 
                    (CommonTree)adaptor.create(string_literal378)
                    ;
                    adaptor.addChild(root_0, string_literal378_tree);
                    }

                    }
                    break;
                case 32 :
                    // CPPGrammar.g:397:26: '||'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal379=(Token)match(input,165,FOLLOW_165_in_operator4159); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal379_tree = 
                    (CommonTree)adaptor.create(string_literal379)
                    ;
                    adaptor.addChild(root_0, string_literal379_tree);
                    }

                    }
                    break;
                case 33 :
                    // CPPGrammar.g:397:33: '++'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal380=(Token)match(input,97,FOLLOW_97_in_operator4163); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal380_tree = 
                    (CommonTree)adaptor.create(string_literal380)
                    ;
                    adaptor.addChild(root_0, string_literal380_tree);
                    }

                    }
                    break;
                case 34 :
                    // CPPGrammar.g:397:40: '--'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal381=(Token)match(input,101,FOLLOW_101_in_operator4167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal381_tree = 
                    (CommonTree)adaptor.create(string_literal381)
                    ;
                    adaptor.addChild(root_0, string_literal381_tree);
                    }

                    }
                    break;
                case 35 :
                    // CPPGrammar.g:398:5: ','
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal382=(Token)match(input,99,FOLLOW_99_in_operator4173); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal382_tree = 
                    (CommonTree)adaptor.create(char_literal382)
                    ;
                    adaptor.addChild(root_0, char_literal382_tree);
                    }

                    }
                    break;
                case 36 :
                    // CPPGrammar.g:398:11: '->*'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal383=(Token)match(input,104,FOLLOW_104_in_operator4177); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal383_tree = 
                    (CommonTree)adaptor.create(string_literal383)
                    ;
                    adaptor.addChild(root_0, string_literal383_tree);
                    }

                    }
                    break;
                case 37 :
                    // CPPGrammar.g:398:19: '->'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal384=(Token)match(input,103,FOLLOW_103_in_operator4181); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal384_tree = 
                    (CommonTree)adaptor.create(string_literal384)
                    ;
                    adaptor.addChild(root_0, string_literal384_tree);
                    }

                    }
                    break;
                case 38 :
                    // CPPGrammar.g:398:26: '(' ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal385=(Token)match(input,92,FOLLOW_92_in_operator4185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal385_tree = 
                    (CommonTree)adaptor.create(char_literal385)
                    ;
                    adaptor.addChild(root_0, char_literal385_tree);
                    }

                    char_literal386=(Token)match(input,93,FOLLOW_93_in_operator4187); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal386_tree = 
                    (CommonTree)adaptor.create(char_literal386)
                    ;
                    adaptor.addChild(root_0, char_literal386_tree);
                    }

                    }
                    break;
                case 39 :
                    // CPPGrammar.g:398:36: '[' ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal387=(Token)match(input,119,FOLLOW_119_in_operator4191); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal387_tree = 
                    (CommonTree)adaptor.create(char_literal387)
                    ;
                    adaptor.addChild(root_0, char_literal387_tree);
                    }

                    char_literal388=(Token)match(input,120,FOLLOW_120_in_operator4193); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal388_tree = 
                    (CommonTree)adaptor.create(char_literal388)
                    ;
                    adaptor.addChild(root_0, char_literal388_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operator"


    public static class assignment_operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_operator"
    // CPPGrammar.g:401:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final CPPGrammarParser.assignment_operator_return assignment_operator() throws RecognitionException {
        CPPGrammarParser.assignment_operator_return retval = new CPPGrammarParser.assignment_operator_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set389=null;

        CommonTree set389_tree=null;

        try {
            // CPPGrammar.g:401:20: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set389=(Token)input.LT(1);

            if ( input.LA(1)==88||input.LA(1)==91||input.LA(1)==95||input.LA(1)==98||input.LA(1)==102||input.LA(1)==106||input.LA(1)==111||input.LA(1)==113||input.LA(1)==118||input.LA(1)==122||input.LA(1)==164 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set389)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_operator"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // CPPGrammar.g:403:1: identifier : ALPHA_NUMERIC ( '::' ALPHA_NUMERIC )* ;
    public final CPPGrammarParser.identifier_return identifier() throws RecognitionException {
        CPPGrammarParser.identifier_return retval = new CPPGrammarParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ALPHA_NUMERIC390=null;
        Token string_literal391=null;
        Token ALPHA_NUMERIC392=null;

        CommonTree ALPHA_NUMERIC390_tree=null;
        CommonTree string_literal391_tree=null;
        CommonTree ALPHA_NUMERIC392_tree=null;

        try {
            // CPPGrammar.g:403:12: ( ALPHA_NUMERIC ( '::' ALPHA_NUMERIC )* )
            // CPPGrammar.g:403:14: ALPHA_NUMERIC ( '::' ALPHA_NUMERIC )*
            {
            root_0 = (CommonTree)adaptor.nil();


            ALPHA_NUMERIC390=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_identifier4252); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ALPHA_NUMERIC390_tree = 
            (CommonTree)adaptor.create(ALPHA_NUMERIC390)
            ;
            adaptor.addChild(root_0, ALPHA_NUMERIC390_tree);
            }

            // CPPGrammar.g:403:28: ( '::' ALPHA_NUMERIC )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==107) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // CPPGrammar.g:403:29: '::' ALPHA_NUMERIC
            	    {
            	    string_literal391=(Token)match(input,107,FOLLOW_107_in_identifier4255); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal391_tree = 
            	    (CommonTree)adaptor.create(string_literal391)
            	    ;
            	    adaptor.addChild(root_0, string_literal391_tree);
            	    }

            	    ALPHA_NUMERIC392=(Token)match(input,ALPHA_NUMERIC,FOLLOW_ALPHA_NUMERIC_in_identifier4257); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    ALPHA_NUMERIC392_tree = 
            	    (CommonTree)adaptor.create(ALPHA_NUMERIC392)
            	    ;
            	    adaptor.addChild(root_0, ALPHA_NUMERIC392_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class water_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "water"
    // CPPGrammar.g:405:1: water : ~ OTHER ;
    public final CPPGrammarParser.water_return water() throws RecognitionException {
        CPPGrammarParser.water_return retval = new CPPGrammarParser.water_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set393=null;

        CommonTree set393_tree=null;

        try {
            // CPPGrammar.g:405:7: (~ OTHER )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set393=(Token)input.LT(1);

            if ( (input.LA(1) >= ALPHA_NUMERIC && input.LA(1) <= OR)||(input.LA(1) >= PARAMETER_DECL && input.LA(1) <= 167) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set393)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "water"


    public static class function_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_def"
    // CPPGrammar.g:408:1: function_def : function_def_ -> ^( FUNCTION_DEF function_def_ ) ;
    public final CPPGrammarParser.function_def_return function_def() throws RecognitionException {
        CPPGrammarParser.function_def_return retval = new CPPGrammarParser.function_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_def__return function_def_394 =null;


        RewriteRuleSubtreeStream stream_function_def_=new RewriteRuleSubtreeStream(adaptor,"rule function_def_");
        try {
            // CPPGrammar.g:408:13: ( function_def_ -> ^( FUNCTION_DEF function_def_ ) )
            // CPPGrammar.g:408:15: function_def_
            {
            pushFollow(FOLLOW_function_def__in_function_def4276);
            function_def_394=function_def_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_def_.add(function_def_394.getTree());

            // AST REWRITE
            // elements: function_def_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 408:29: -> ^( FUNCTION_DEF function_def_ )
            {
                // CPPGrammar.g:408:32: ^( FUNCTION_DEF function_def_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCTION_DEF, "FUNCTION_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_function_def_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_def"


    public static class function_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_name"
    // CPPGrammar.g:409:1: function_name : function_name_ -> ^( FUNCTION_NAME function_name_ ) ;
    public final CPPGrammarParser.function_name_return function_name() throws RecognitionException {
        CPPGrammarParser.function_name_return retval = new CPPGrammarParser.function_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.function_name__return function_name_395 =null;


        RewriteRuleSubtreeStream stream_function_name_=new RewriteRuleSubtreeStream(adaptor,"rule function_name_");
        try {
            // CPPGrammar.g:409:14: ( function_name_ -> ^( FUNCTION_NAME function_name_ ) )
            // CPPGrammar.g:409:16: function_name_
            {
            pushFollow(FOLLOW_function_name__in_function_name4290);
            function_name_395=function_name_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_function_name_.add(function_name_395.getTree());

            // AST REWRITE
            // elements: function_name_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 409:31: -> ^( FUNCTION_NAME function_name_ )
            {
                // CPPGrammar.g:409:34: ^( FUNCTION_NAME function_name_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUNCTION_NAME, "FUNCTION_NAME")
                , root_1);

                adaptor.addChild(root_1, stream_function_name_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_name"


    public static class parameter_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_decl"
    // CPPGrammar.g:410:1: parameter_decl : parameter_decl_ -> ^( PARAMETER_DECL parameter_decl_ ) ;
    public final CPPGrammarParser.parameter_decl_return parameter_decl() throws RecognitionException {
        CPPGrammarParser.parameter_decl_return retval = new CPPGrammarParser.parameter_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.parameter_decl__return parameter_decl_396 =null;


        RewriteRuleSubtreeStream stream_parameter_decl_=new RewriteRuleSubtreeStream(adaptor,"rule parameter_decl_");
        try {
            // CPPGrammar.g:410:15: ( parameter_decl_ -> ^( PARAMETER_DECL parameter_decl_ ) )
            // CPPGrammar.g:410:17: parameter_decl_
            {
            pushFollow(FOLLOW_parameter_decl__in_parameter_decl4304);
            parameter_decl_396=parameter_decl_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter_decl_.add(parameter_decl_396.getTree());

            // AST REWRITE
            // elements: parameter_decl_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 410:33: -> ^( PARAMETER_DECL parameter_decl_ )
            {
                // CPPGrammar.g:410:36: ^( PARAMETER_DECL parameter_decl_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_parameter_decl_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_decl"


    public static class parameter_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter_name"
    // CPPGrammar.g:411:1: parameter_name : parameter_name_ -> ^( NAME parameter_name_ ) ;
    public final CPPGrammarParser.parameter_name_return parameter_name() throws RecognitionException {
        CPPGrammarParser.parameter_name_return retval = new CPPGrammarParser.parameter_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.parameter_name__return parameter_name_397 =null;


        RewriteRuleSubtreeStream stream_parameter_name_=new RewriteRuleSubtreeStream(adaptor,"rule parameter_name_");
        try {
            // CPPGrammar.g:411:15: ( parameter_name_ -> ^( NAME parameter_name_ ) )
            // CPPGrammar.g:411:17: parameter_name_
            {
            pushFollow(FOLLOW_parameter_name__in_parameter_name4318);
            parameter_name_397=parameter_name_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter_name_.add(parameter_name_397.getTree());

            // AST REWRITE
            // elements: parameter_name_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 411:33: -> ^( NAME parameter_name_ )
            {
                // CPPGrammar.g:411:36: ^( NAME parameter_name_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, stream_parameter_name_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter_name"


    public static class condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // CPPGrammar.g:413:1: condition : ( condition_ )? -> ^( CONDITION ( condition_ )? ) ;
    public final CPPGrammarParser.condition_return condition() throws RecognitionException {
        CPPGrammarParser.condition_return retval = new CPPGrammarParser.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.condition__return condition_398 =null;


        RewriteRuleSubtreeStream stream_condition_=new RewriteRuleSubtreeStream(adaptor,"rule condition_");
        try {
            // CPPGrammar.g:413:10: ( ( condition_ )? -> ^( CONDITION ( condition_ )? ) )
            // CPPGrammar.g:413:12: ( condition_ )?
            {
            // CPPGrammar.g:413:12: ( condition_ )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==ALPHA_NUMERIC||LA106_0==DECIMAL_LITERAL||LA106_0==FLOATING_POINT_LITERAL||LA106_0==HEX_LITERAL||LA106_0==OCTAL_LITERAL||LA106_0==STRING||LA106_0==83||LA106_0==90||LA106_0==92||LA106_0==94||(LA106_0 >= 96 && LA106_0 <= 97)||(LA106_0 >= 100 && LA106_0 <= 101)||LA106_0==167) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // CPPGrammar.g:413:12: condition_
                    {
                    pushFollow(FOLLOW_condition__in_condition4333);
                    condition_398=condition_();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_.add(condition_398.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: condition_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 413:24: -> ^( CONDITION ( condition_ )? )
            {
                // CPPGrammar.g:413:27: ^( CONDITION ( condition_ )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION, "CONDITION")
                , root_1);

                // CPPGrammar.g:413:39: ( condition_ )?
                if ( stream_condition_.hasNext() ) {
                    adaptor.addChild(root_1, stream_condition_.nextTree());

                }
                stream_condition_.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class namespace_def_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "namespace_def"
    // CPPGrammar.g:415:1: namespace_def : namespace_def_ -> ^( NAMESPACE_DEF namespace_def_ ) ;
    public final CPPGrammarParser.namespace_def_return namespace_def() throws RecognitionException {
        CPPGrammarParser.namespace_def_return retval = new CPPGrammarParser.namespace_def_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.namespace_def__return namespace_def_399 =null;


        RewriteRuleSubtreeStream stream_namespace_def_=new RewriteRuleSubtreeStream(adaptor,"rule namespace_def_");
        try {
            // CPPGrammar.g:415:14: ( namespace_def_ -> ^( NAMESPACE_DEF namespace_def_ ) )
            // CPPGrammar.g:415:16: namespace_def_
            {
            pushFollow(FOLLOW_namespace_def__in_namespace_def4350);
            namespace_def_399=namespace_def_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_namespace_def_.add(namespace_def_399.getTree());

            // AST REWRITE
            // elements: namespace_def_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 415:31: -> ^( NAMESPACE_DEF namespace_def_ )
            {
                // CPPGrammar.g:415:34: ^( NAMESPACE_DEF namespace_def_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAMESPACE_DEF, "NAMESPACE_DEF")
                , root_1);

                adaptor.addChild(root_1, stream_namespace_def_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "namespace_def"


    public static class using_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "using_directive"
    // CPPGrammar.g:416:1: using_directive : using_directive_ -> ^( USING_DIRECTIVE using_directive_ ) ;
    public final CPPGrammarParser.using_directive_return using_directive() throws RecognitionException {
        CPPGrammarParser.using_directive_return retval = new CPPGrammarParser.using_directive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.using_directive__return using_directive_400 =null;


        RewriteRuleSubtreeStream stream_using_directive_=new RewriteRuleSubtreeStream(adaptor,"rule using_directive_");
        try {
            // CPPGrammar.g:416:16: ( using_directive_ -> ^( USING_DIRECTIVE using_directive_ ) )
            // CPPGrammar.g:416:18: using_directive_
            {
            pushFollow(FOLLOW_using_directive__in_using_directive4364);
            using_directive_400=using_directive_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_using_directive_.add(using_directive_400.getTree());

            // AST REWRITE
            // elements: using_directive_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 416:35: -> ^( USING_DIRECTIVE using_directive_ )
            {
                // CPPGrammar.g:416:38: ^( USING_DIRECTIVE using_directive_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(USING_DIRECTIVE, "USING_DIRECTIVE")
                , root_1);

                adaptor.addChild(root_1, stream_using_directive_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "using_directive"


    public static class simple_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "simple_decl"
    // CPPGrammar.g:417:1: simple_decl : simple_decl_ -> ^( SIMPLE_DECL simple_decl_ ) ;
    public final CPPGrammarParser.simple_decl_return simple_decl() throws RecognitionException {
        CPPGrammarParser.simple_decl_return retval = new CPPGrammarParser.simple_decl_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.simple_decl__return simple_decl_401 =null;


        RewriteRuleSubtreeStream stream_simple_decl_=new RewriteRuleSubtreeStream(adaptor,"rule simple_decl_");
        try {
            // CPPGrammar.g:417:12: ( simple_decl_ -> ^( SIMPLE_DECL simple_decl_ ) )
            // CPPGrammar.g:417:14: simple_decl_
            {
            pushFollow(FOLLOW_simple_decl__in_simple_decl4378);
            simple_decl_401=simple_decl_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simple_decl_.add(simple_decl_401.getTree());

            // AST REWRITE
            // elements: simple_decl_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 417:27: -> ^( SIMPLE_DECL simple_decl_ )
            {
                // CPPGrammar.g:417:30: ^( SIMPLE_DECL simple_decl_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SIMPLE_DECL, "SIMPLE_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_simple_decl_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "simple_decl"


    public static class jump_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "jump_statement"
    // CPPGrammar.g:418:1: jump_statement : jump_statement_ -> ^( JUMP_STATEMENT jump_statement_ ) ;
    public final CPPGrammarParser.jump_statement_return jump_statement() throws RecognitionException {
        CPPGrammarParser.jump_statement_return retval = new CPPGrammarParser.jump_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.jump_statement__return jump_statement_402 =null;


        RewriteRuleSubtreeStream stream_jump_statement_=new RewriteRuleSubtreeStream(adaptor,"rule jump_statement_");
        try {
            // CPPGrammar.g:418:15: ( jump_statement_ -> ^( JUMP_STATEMENT jump_statement_ ) )
            // CPPGrammar.g:418:17: jump_statement_
            {
            pushFollow(FOLLOW_jump_statement__in_jump_statement4392);
            jump_statement_402=jump_statement_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_jump_statement_.add(jump_statement_402.getTree());

            // AST REWRITE
            // elements: jump_statement_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 418:33: -> ^( JUMP_STATEMENT jump_statement_ )
            {
                // CPPGrammar.g:418:36: ^( JUMP_STATEMENT jump_statement_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT")
                , root_1);

                adaptor.addChild(root_1, stream_jump_statement_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "jump_statement"


    public static class init_decl_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "init_decl_name"
    // CPPGrammar.g:420:1: init_decl_name : init_decl_name_ -> ^( NAME init_decl_name_ ) ;
    public final CPPGrammarParser.init_decl_name_return init_decl_name() throws RecognitionException {
        CPPGrammarParser.init_decl_name_return retval = new CPPGrammarParser.init_decl_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.init_decl_name__return init_decl_name_403 =null;


        RewriteRuleSubtreeStream stream_init_decl_name_=new RewriteRuleSubtreeStream(adaptor,"rule init_decl_name_");
        try {
            // CPPGrammar.g:420:15: ( init_decl_name_ -> ^( NAME init_decl_name_ ) )
            // CPPGrammar.g:420:17: init_decl_name_
            {
            pushFollow(FOLLOW_init_decl_name__in_init_decl_name4407);
            init_decl_name_403=init_decl_name_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init_decl_name_.add(init_decl_name_403.getTree());

            // AST REWRITE
            // elements: init_decl_name_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 420:33: -> ^( NAME init_decl_name_ )
            {
                // CPPGrammar.g:420:36: ^( NAME init_decl_name_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(NAME, "NAME")
                , root_1);

                adaptor.addChild(root_1, stream_init_decl_name_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "init_decl_name"


    public static class include_directive_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "include_directive"
    // CPPGrammar.g:422:1: include_directive : include_directive_ -> ^( INCLUDE_DIRECTIVE include_directive_ ) ;
    public final CPPGrammarParser.include_directive_return include_directive() throws RecognitionException {
        CPPGrammarParser.include_directive_return retval = new CPPGrammarParser.include_directive_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.include_directive__return include_directive_404 =null;


        RewriteRuleSubtreeStream stream_include_directive_=new RewriteRuleSubtreeStream(adaptor,"rule include_directive_");
        try {
            // CPPGrammar.g:422:18: ( include_directive_ -> ^( INCLUDE_DIRECTIVE include_directive_ ) )
            // CPPGrammar.g:422:20: include_directive_
            {
            pushFollow(FOLLOW_include_directive__in_include_directive4422);
            include_directive_404=include_directive_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_include_directive_.add(include_directive_404.getTree());

            // AST REWRITE
            // elements: include_directive_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 422:39: -> ^( INCLUDE_DIRECTIVE include_directive_ )
            {
                // CPPGrammar.g:422:42: ^( INCLUDE_DIRECTIVE include_directive_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INCLUDE_DIRECTIVE, "INCLUDE_DIRECTIVE")
                , root_1);

                adaptor.addChild(root_1, stream_include_directive_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "include_directive"


    public static class label_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "label"
    // CPPGrammar.g:423:1: label : label_ -> ^( LABEL label_ ) ;
    public final CPPGrammarParser.label_return label() throws RecognitionException {
        CPPGrammarParser.label_return retval = new CPPGrammarParser.label_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CPPGrammarParser.label__return label_405 =null;


        RewriteRuleSubtreeStream stream_label_=new RewriteRuleSubtreeStream(adaptor,"rule label_");
        try {
            // CPPGrammar.g:423:6: ( label_ -> ^( LABEL label_ ) )
            // CPPGrammar.g:423:8: label_
            {
            pushFollow(FOLLOW_label__in_label4436);
            label_405=label_();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_label_.add(label_405.getTree());

            // AST REWRITE
            // elements: label_
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 423:15: -> ^( LABEL label_ )
            {
                // CPPGrammar.g:423:18: ^( LABEL label_ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(LABEL, "LABEL")
                , root_1);

                adaptor.addChild(root_1, stream_label_.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "label"


    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "number"
    // CPPGrammar.g:425:1: number : ( HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL );
    public final CPPGrammarParser.number_return number() throws RecognitionException {
        CPPGrammarParser.number_return retval = new CPPGrammarParser.number_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set406=null;

        CommonTree set406_tree=null;

        try {
            // CPPGrammar.g:425:7: ( HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL )
            // CPPGrammar.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set406=(Token)input.LT(1);

            if ( input.LA(1)==DECIMAL_LITERAL||input.LA(1)==HEX_LITERAL||input.LA(1)==OCTAL_LITERAL ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set406)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "number"

    // $ANTLR start synpred1_CPPGrammar
    public final void synpred1_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:61:7: ( declaration )
        // CPPGrammar.g:61:8: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred1_CPPGrammar306);
        declaration();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_CPPGrammar

    // $ANTLR start synpred2_CPPGrammar
    public final void synpred2_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:65:14: ( simple_decl )
        // CPPGrammar.g:65:15: simple_decl
        {
        pushFollow(FOLLOW_simple_decl_in_synpred2_CPPGrammar334);
        simple_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_CPPGrammar

    // $ANTLR start synpred3_CPPGrammar
    public final void synpred3_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:107:22: ( simple_decl )
        // CPPGrammar.g:107:23: simple_decl
        {
        pushFollow(FOLLOW_simple_decl_in_synpred3_CPPGrammar738);
        simple_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_CPPGrammar

    // $ANTLR start synpred4_CPPGrammar
    public final void synpred4_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:108:5: ( function_def )
        // CPPGrammar.g:108:6: function_def
        {
        pushFollow(FOLLOW_function_def_in_synpred4_CPPGrammar750);
        function_def();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_CPPGrammar

    // $ANTLR start synpred5_CPPGrammar
    public final void synpred5_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:109:5: ( label )
        // CPPGrammar.g:109:6: label
        {
        pushFollow(FOLLOW_label_in_synpred5_CPPGrammar762);
        label();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_CPPGrammar

    // $ANTLR start synpred6_CPPGrammar
    public final void synpred6_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:205:26: ( non_expr_statement )
        // CPPGrammar.g:205:27: non_expr_statement
        {
        pushFollow(FOLLOW_non_expr_statement_in_synpred6_CPPGrammar1954);
        non_expr_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_CPPGrammar

    // $ANTLR start synpred7_CPPGrammar
    public final void synpred7_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:206:7: ( expr_statement )
        // CPPGrammar.g:206:8: expr_statement
        {
        pushFollow(FOLLOW_expr_statement_in_synpred7_CPPGrammar1968);
        expr_statement();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_CPPGrammar

    // $ANTLR start synpred8_CPPGrammar
    public final void synpred8_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:243:22: ( simple_decl )
        // CPPGrammar.g:243:23: simple_decl
        {
        pushFollow(FOLLOW_simple_decl_in_synpred8_CPPGrammar2536);
        simple_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_CPPGrammar

    // $ANTLR start synpred9_CPPGrammar
    public final void synpred9_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:250:25: ( simple_decl )
        // CPPGrammar.g:250:26: simple_decl
        {
        pushFollow(FOLLOW_simple_decl_in_synpred9_CPPGrammar2637);
        simple_decl();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_CPPGrammar

    // $ANTLR start synpred10_CPPGrammar
    public final void synpred10_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:251:5: ( function_def )
        // CPPGrammar.g:251:6: function_def
        {
        pushFollow(FOLLOW_function_def_in_synpred10_CPPGrammar2649);
        function_def();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_CPPGrammar

    // $ANTLR start synpred11_CPPGrammar
    public final void synpred11_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:309:19: ( '(' type_name ( ptr_operator )* ')' )
        // CPPGrammar.g:309:20: '(' type_name ( ptr_operator )* ')'
        {
        match(input,92,FOLLOW_92_in_synpred11_CPPGrammar3266); if (state.failed) return ;

        pushFollow(FOLLOW_type_name_in_synpred11_CPPGrammar3268);
        type_name();

        state._fsp--;
        if (state.failed) return ;

        // CPPGrammar.g:309:34: ( ptr_operator )*
        loop107:
        do {
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==90||LA107_0==94) ) {
                alt107=1;
            }


            switch (alt107) {
        	case 1 :
        	    // CPPGrammar.g:309:34: ptr_operator
        	    {
        	    pushFollow(FOLLOW_ptr_operator_in_synpred11_CPPGrammar3270);
        	    ptr_operator();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop107;
            }
        } while (true);


        match(input,93,FOLLOW_93_in_synpred11_CPPGrammar3273); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_CPPGrammar

    // $ANTLR start synpred12_CPPGrammar
    public final void synpred12_CPPGrammar_fragment() throws RecognitionException {
        // CPPGrammar.g:329:25: ( function_call_tail )
        // CPPGrammar.g:329:26: function_call_tail
        {
        pushFollow(FOLLOW_function_call_tail_in_synpred12_CPPGrammar3417);
        function_call_tail();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_CPPGrammar

    // Delegated rules

    public final boolean synpred3_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_CPPGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_CPPGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA9_eotS =
        "\7\uffff";
    static final String DFA9_eofS =
        "\7\uffff";
    static final String DFA9_minS =
        "\1\4\1\uffff\2\4\1\uffff\2\4";
    static final String DFA9_maxS =
        "\1\u00a0\1\uffff\2\u00a2\1\uffff\1\4\1\u00a2";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\2\uffff";
    static final String DFA9_specialS =
        "\7\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\172\uffff\1\2\1\1\4\uffff\1\2\16\uffff\1\1\1\uffff\1\2"+
            "\5\uffff\1\2\1\1\2\uffff\1\1",
            "",
            "\1\3\15\uffff\1\4\u0081\uffff\1\1\10\uffff\1\1\4\uffff\1\4",
            "\1\1\15\uffff\1\4\107\uffff\1\1\3\uffff\1\1\14\uffff\1\5\1"+
            "\uffff\1\1\64\uffff\1\4",
            "",
            "\1\6",
            "\1\1\15\uffff\1\4\107\uffff\1\1\3\uffff\1\1\14\uffff\1\5\1"+
            "\uffff\1\1\64\uffff\1\4"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "86:1: var_decl : ( (t0= type_name ) init_declarator_list -> init_declarator_list | (t1= class_def -> ^( CLASS_DEF class_def ) ) ( init_declarator_list -> init_declarator_list )? );";
        }
    }
    static final String DFA26_eotS =
        "\14\uffff";
    static final String DFA26_eofS =
        "\14\uffff";
    static final String DFA26_minS =
        "\2\4\1\uffff\1\4\1\uffff\5\4\1\22\1\4";
    static final String DFA26_maxS =
        "\2\u00a0\1\uffff\1\u009f\1\uffff\1\4\1\u00a0\1\u009f\1\155\1\4\1"+
        "\u00a2\1\155";
    static final String DFA26_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\7\uffff";
    static final String DFA26_specialS =
        "\14\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\3\125\uffff\1\4\1\uffff\1\4\1\uffff\1\4\40\uffff\2\2\4\uffff"+
            "\1\2\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\1\4\5\uffff\1\2\1\1"+
            "\1\2\5\uffff\2\2\1\uffff\1\1\1\2",
            "\1\3\125\uffff\1\4\1\uffff\1\4\1\uffff\1\4\40\uffff\2\2\4\uffff"+
            "\1\2\1\1\1\uffff\1\1\2\uffff\1\1\2\uffff\1\4\5\uffff\1\2\1\1"+
            "\1\2\5\uffff\2\2\1\uffff\1\1\1\2",
            "",
            "\1\2\125\uffff\1\2\1\uffff\1\6\1\uffff\1\2\14\uffff\1\5\1\uffff"+
            "\1\2\30\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\6\uffff"+
            "\1\2\11\uffff\1\2",
            "",
            "\1\7",
            "\1\10\127\uffff\1\2\1\4\35\uffff\1\4\3\uffff\2\4\4\uffff\1"+
            "\4\10\uffff\1\2\3\uffff\1\4\1\uffff\1\4\1\uffff\1\4\5\uffff"+
            "\2\4\2\uffff\1\4",
            "\1\2\125\uffff\1\2\1\uffff\1\6\1\uffff\1\2\14\uffff\1\5\1\uffff"+
            "\1\2\30\uffff\1\2\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\6\uffff"+
            "\1\2\11\uffff\1\2",
            "\1\4\125\uffff\1\4\1\uffff\1\4\1\12\1\4\4\uffff\1\4\7\uffff"+
            "\1\11\1\uffff\1\4",
            "\1\13",
            "\1\4\111\uffff\1\2\43\uffff\1\4\30\uffff\1\4\6\uffff\1\4\1"+
            "\uffff\1\4",
            "\1\4\125\uffff\1\4\1\uffff\1\4\1\12\1\4\4\uffff\1\4\7\uffff"+
            "\1\11\1\uffff\1\4"
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "166:15: ( ( function_decl_specifiers )* type_name )?";
        }
    }
    static final String DFA39_eotS =
        "\6\uffff";
    static final String DFA39_eofS =
        "\6\uffff";
    static final String DFA39_minS =
        "\1\4\1\uffff\2\4\1\uffff\1\4";
    static final String DFA39_maxS =
        "\1\u00a0\1\uffff\1\155\1\4\1\uffff\1\155";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA39_specialS =
        "\6\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\2\166\uffff\1\1\3\uffff\2\1\4\uffff\1\1\14\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\1\1\5\uffff\2\1\2\uffff\1\1",
            "",
            "\1\1\125\uffff\1\1\1\uffff\1\1\1\4\1\1\4\uffff\1\4\7\uffff"+
            "\1\3\1\uffff\1\1",
            "\1\5",
            "",
            "\1\1\125\uffff\1\1\1\uffff\1\1\1\4\1\1\4\uffff\1\4\7\uffff"+
            "\1\3\1\uffff\1\1"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "179:1: parameter_decl_ : ( param_decl_specifiers ( ( ( ptr_operator )+ parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ) parameter_name -> ^( TYPE param_decl_specifiers ^( POINTER ( ptr_operator )+ ) ^( TYPE_SUFFIX ) ) parameter_name ) | ( parameter_name -> {$parameter_decl_::type_suffix == null}? ^( TYPE param_decl_specifiers ) parameter_name -> ^( TYPE param_decl_specifiers ^( TYPE_SUFFIX ) ) parameter_name ) ) | identifier );";
        }
    }
    static final String DFA46_eotS =
        "\13\uffff";
    static final String DFA46_eofS =
        "\13\uffff";
    static final String DFA46_minS =
        "\1\4\6\uffff\1\4\1\uffff\2\4";
    static final String DFA46_maxS =
        "\1\u00a1\6\uffff\1\155\1\uffff\1\4\1\155";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\2\uffff";
    static final String DFA46_specialS =
        "\13\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\7\26\uffff\1\10\16\uffff\1\10\15\uffff\1\10\103\uffff\1\3"+
            "\1\10\1\5\2\6\1\3\1\uffff\1\2\1\1\1\6\1\uffff\1\2\1\uffff\1"+
            "\3\1\1\4\uffff\3\10\1\uffff\1\3\1\6\1\uffff\1\6\1\1\1\6\1\uffff"+
            "\1\4\3\6\2\uffff\1\6\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\6\15\uffff\1\10\107\uffff\1\6\3\uffff\1\6\14\uffff\1\11"+
            "\1\uffff\1\6",
            "",
            "\1\12",
            "\1\6\15\uffff\1\10\107\uffff\1\6\3\uffff\1\6\14\uffff\1\11"+
            "\1\uffff\1\6"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "210:1: non_expr_statement : ( selection_statement | iteration_statement | jump_statement | try_block | catch_block | simple_decl | label );";
        }
    }
 

    public static final BitSet FOLLOW_part_in_code288 = new BitSet(new long[]{0xFBFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_declaration_in_part310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_water_in_part319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_declaration339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_declaration347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_def_in_declaration355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_directive_in_declaration363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_directive_in_declaration371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_using_directive_381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_using_directive_383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_using_directive_385 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_using_directive_387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_include_directive_393 = new BitSet(new long[]{0x0000000000000000L,0x0000200000200000L});
    public static final BitSet FOLLOW_85_in_include_directive_396 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_85_in_include_directive_408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_include_directive_412 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_115_in_include_directive_423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_simple_decl_437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_template_var_decl_in_simple_decl_439 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_simple_decl_441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_var_decl_in_simple_decl_461 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_simple_decl_463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_simple_decl_485 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_simple_decl_487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_declaration_start_in_template_var_decl522 = new BitSet(new long[]{0x0000000000000010L,0x8000000000000000L,0x0000000130500021L});
    public static final BitSet FOLLOW_var_decl_in_template_var_decl524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_var_decl564 = new BitSet(new long[]{0x0000000000000010L,0x0000000044000000L});
    public static final BitSet FOLLOW_init_declarator_list_in_var_decl577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_def_in_var_decl604 = new BitSet(new long[]{0x0000000000000012L,0x0000000044000000L});
    public static final BitSet FOLLOW_init_declarator_list_in_var_decl630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_template_declaration_start652 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_template_declaration_start654 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_template_param_list_in_template_declaration_start656 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_template_declaration_start658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_def__in_class_def666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_key_in_class_def_680 = new BitSet(new long[]{0x0000000000040010L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_class_name_in_class_def_682 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_base_classes_in_class_def_684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_class_def_686 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_class_content_in_class_def_688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_166_in_class_def_690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_class_name696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_content__in_class_content713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_content_elem_in_class_content_728 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_simple_decl_in_class_content_elem743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_class_content_elem755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_class_content_elem767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_class_content_elem773 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_class_content__in_class_content_elem775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_166_in_class_content_elem777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_curlies_in_class_content_elem783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_classes__in_base_classes793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_base_classes_810 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000080038000L});
    public static final BitSet FOLLOW_base_class_in_base_classes_812 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_base_classes_815 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000080038000L});
    public static final BitSet FOLLOW_base_class_in_base_classes_817 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_159_in_base_class825 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_access_specifier_in_base_class828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_base_class831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list841 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_init_declarator_list857 = new BitSet(new long[]{0x0000000000000010L,0x0000000044000000L});
    public static final BitSet FOLLOW_init_declarator_list_in_init_declarator_list859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_declarator__in_init_declarator880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_decl_name_in_init_declarator_901 = new BitSet(new long[]{0x0000000000000002L,0x0002000010000000L});
    public static final BitSet FOLLOW_92_in_init_declarator_934 = new BitSet(new long[]{0x0100040808000010L,0x0000003374080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_expr_in_init_declarator_936 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_init_declarator_939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_init_declarator_1017 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_assign_expr_in_init_declarator_1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ptr_operator_in_init_decl_name_1282 = new BitSet(new long[]{0x0000000000000010L,0x0000000044000000L});
    public static final BitSet FOLLOW_identifier_in_init_decl_name_1285 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_type_suffix_in_init_decl_name_1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_type_suffix1322 = new BitSet(new long[]{0x0100040808000010L,0x0100003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_constant_expr_in_type_suffix1324 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_type_suffix1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_start_in_function_def_1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_function_param_list_in_function_def_1346 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ctor_list_in_function_def_1359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_def_1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_function_def_1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_declaration_start_in_function_start1403 = new BitSet(new long[]{0x0000000000000010L,0x8000000044000000L,0x00000001B0700961L});
    public static final BitSet FOLLOW_return_type_in_function_start1405 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_function_name_in_function_start1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_type_in_function_start1427 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_function_name_in_function_start1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_type__in_return_type1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_decl_specifiers_in_return_type_1471 = new BitSet(new long[]{0x0000000000000010L,0x8000000000000000L,0x00000001B0700961L});
    public static final BitSet FOLLOW_type_name_in_return_type_1474 = new BitSet(new long[]{0x0000000000000002L,0x0000000044000000L,0x0000000080200940L});
    public static final BitSet FOLLOW_function_decl_specifiers_in_return_type_1478 = new BitSet(new long[]{0x0000000000000002L,0x0000000044000000L,0x0000000080200940L});
    public static final BitSet FOLLOW_ptr_operator_in_return_type_1481 = new BitSet(new long[]{0x0000000000000002L,0x0000000044000000L});
    public static final BitSet FOLLOW_92_in_function_name_1489 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_function_name__in_function_name_1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_function_name_1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_function_name_1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operator_function_id_in_function_name_1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_function_param_list1510 = new BitSet(new long[]{0x0000000000000010L,0x8800000020000000L,0x0000000130540021L});
    public static final BitSet FOLLOW_parameter_declaration_clause_in_function_param_list1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_function_param_list1517 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000102000001L});
    public static final BitSet FOLLOW_cv_qualifier_in_function_param_list1519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000102000001L});
    public static final BitSet FOLLOW_exception_specification_in_function_param_list1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_exception_specification1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_exception_specification1569 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_type_id_list_in_exception_specification1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_exception_specification1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_ctor_list1580 = new BitSet(new long[]{0x0000000000000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_ctor_initializer_in_ctor_list1583 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ctor_list1586 = new BitSet(new long[]{0x0000000000000010L,0x0000080000000000L});
    public static final BitSet FOLLOW_ctor_initializer_in_ctor_list1588 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_107_in_ctor_initializer1602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_ctor_initializer1605 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ctor_initializer1607 = new BitSet(new long[]{0x0100040808000010L,0x0000003374080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_expr_in_ctor_initializer1609 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_ctor_initializer1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_decl_in_parameter_declaration_clause1642 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_parameter_declaration_clause1645 = new BitSet(new long[]{0x0000000000000010L,0x8800000000000000L,0x0000000130540021L});
    public static final BitSet FOLLOW_parameter_decl_in_parameter_declaration_clause1647 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_param_decl_specifiers_in_parameter_decl_1660 = new BitSet(new long[]{0x0000000000000010L,0x0000000054000000L});
    public static final BitSet FOLLOW_ptr_operator_in_parameter_decl_1673 = new BitSet(new long[]{0x0000000000000010L,0x0000000054000000L});
    public static final BitSet FOLLOW_parameter_name_in_parameter_decl_1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_name_in_parameter_decl_1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_parameter_decl_1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_name_start_in_parameter_name_1852 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_type_suffix_in_parameter_name_1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_parameter_name_start1873 = new BitSet(new long[]{0x0000000000000010L,0x0000000010000000L});
    public static final BitSet FOLLOW_parameter_name__in_parameter_name_start1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_parameter_name_start1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_parameter_name_start1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name_in_param_decl_specifiers1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_compound_statement_in_statement1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_compound_statement1927 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFF7FFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_statement_in_compound_statement1929 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFF7FFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_166_in_compound_statement1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_expr_statement_in_non_compound_statement1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_in_non_compound_statement1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_water_in_non_compound_statement1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_non_expr_statement1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_non_expr_statement1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_non_expr_statement2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_try_block_in_non_expr_statement2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catch_block_in_non_expr_statement2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_non_expr_statement2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_non_expr_statement2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_statement_water2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_statement_water2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement__in_expr_statement2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_statement_2068 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_expr_statement_2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement__in_selection_statement2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_selection_statement_2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_else_statement_in_selection_statement_2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switch_statement_in_selection_statement_2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement__in_iteration_statement2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_statement_in_iteration_statement_2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_iteration_statement_2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_statement_in_iteration_statement_2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_break_or_continue_in_jump_statement_2137 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_return_statement_in_jump_statement_2141 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_goto_statement_in_jump_statement_2144 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_jump_statement_2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_break_or_continue2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_break_or_continue2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_return_statement2185 = new BitSet(new long[]{0x0100040808000012L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_expr_in_return_statement2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_goto_statement2213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_goto_statement2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_try_block2244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_compound_statement_in_try_block2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_catch_block2252 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_catch_block2254 = new BitSet(new long[]{0x0000000000000010L,0x8800000000000000L,0x0000000130540021L});
    public static final BitSet FOLLOW_param_decl_specifiers_in_catch_block2255 = new BitSet(new long[]{0x0000000000000010L,0x0000000030000000L});
    public static final BitSet FOLLOW_parameter_name_in_catch_block2257 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_catch_block2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_compound_statement_in_catch_block2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_if_statement2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_if_statement2273 = new BitSet(new long[]{0x0100040808000010L,0x0000003374080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_condition_in_if_statement2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_if_statement2277 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFF7FFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_statement_in_if_statement2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_else_statement2311 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFF7FFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_statement_in_else_statement2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_switch_statement2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_switch_statement2339 = new BitSet(new long[]{0x0100040808000010L,0x0000003374080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_condition_in_switch_statement2341 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_switch_statement2343 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFF7FFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_statement_in_switch_statement2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_for_statement2377 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_for_statement2379 = new BitSet(new long[]{0x0100040808000010L,0x8000103354080100L,0x0000008139500021L});
    public static final BitSet FOLLOW_for_init_statement_in_for_statement2381 = new BitSet(new long[]{0x0100040808000010L,0x0000103354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_condition_in_for_statement2383 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_for_statement2385 = new BitSet(new long[]{0x0100040808000010L,0x0000003374080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_expr_in_for_statement2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_for_statement2391 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFF7FFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_statement_in_for_statement2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_while_statement2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_while_statement2453 = new BitSet(new long[]{0x0100040808000010L,0x0000003374080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_condition_in_while_statement2455 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_while_statement2457 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFF7FFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_statement_in_while_statement2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_do_statement2489 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFF7FFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_statement_in_do_statement2491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_161_in_do_statement2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_do_statement2495 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_expr_in_do_statement2497 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_do_statement2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_for_init_statement2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_for_init_statement2545 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_108_in_for_init_statement2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_label_2557 = new BitSet(new long[]{0x0100040008000010L});
    public static final BitSet FOLLOW_identifier_in_label_2561 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_number_in_label_2565 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_access_specifier_in_label_2572 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_label_2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_brackets_in_type_id_list2583 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_92_in_type_id_list2587 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_type_id_list_in_type_id_list2589 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_type_id_list2591 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_no_brackets_in_type_id_list2593 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_140_in_namespace_def_2602 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_identifier_in_namespace_def_2604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_162_in_namespace_def_2607 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_namespace_content_in_namespace_def_2609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_166_in_namespace_def_2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_content_elem_in_namespace_content2617 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_162_in_namespace_content2621 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_namespace_content_in_namespace_content2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_166_in_namespace_content2625 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_namespace_content_elem_in_namespace_content2627 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x000000BFFFFFFFFFL});
    public static final BitSet FOLLOW_simple_decl_in_namespace_content_elem2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_namespace_content_elem2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_curlies_in_namespace_content_elem2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_name__in_type_name2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cv_qualifier_in_type_name_2684 = new BitSet(new long[]{0x0000000000000010L,0x8000000000000000L,0x0000000130500021L});
    public static final BitSet FOLLOW_class_key_in_type_name_2687 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000020100000L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_type_name_2699 = new BitSet(new long[]{0x0000000000000002L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_type_name_2702 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_template_param_list_in_type_name_2704 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_type_name_2706 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_type_name_2712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_type_name_2714 = new BitSet(new long[]{0x0000000000000002L,0x0000280000000000L});
    public static final BitSet FOLLOW_109_in_type_name_2717 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_template_param_list_in_type_name_2719 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_type_name_2721 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_template_param_list_elem_in_template_param_list2734 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFF7FFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_109_in_template_param_list_elem2743 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_template_param_list_in_template_param_list_elem2745 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_template_param_list_elem2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_template_param_list_elem2762 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFF7FFFFFFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_template_param_list_in_template_param_list_elem2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_template_param_list_elem2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_no_angle_brackets_or_brackets_in_template_param_list_elem2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_condition_2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr__in_expr2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_expr_2811 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_expr_2814 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_assign_expr_in_expr_2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assign_expr2826 = new BitSet(new long[]{0x0000000000000002L,0x0442844489000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_assignment_operator_in_assign_expr2843 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_assign_expr_in_assign_expr2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expr2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_expression_in_conditional_expression2885 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_conditional_expression2901 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_expr_in_conditional_expression2903 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_COLON_in_conditional_expression2905 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_expression_in_or_expression2938 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_165_in_or_expression2955 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_or_expression_in_or_expression2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_and_expression2990 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_and_expression3006 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_and_expression_in_and_expression3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression3039 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_163_in_inclusive_or_expression3047 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_inclusive_or_expression3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bit_and_expression_in_exclusive_or_expression3091 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_exclusive_or_expression3094 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_exclusive_or_expression3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equality_expression_in_bit_and_expression3106 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_bit_and_expression3109 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_bit_and_expression_in_bit_and_expression3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression3120 = new BitSet(new long[]{0x0000000000000002L,0x0004000000100000L});
    public static final BitSet FOLLOW_equality_operator_in_equality_expression3123 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_equality_expression_in_equality_expression3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equality_operator__in_equality_operator3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression3160 = new BitSet(new long[]{0x0000000000000002L,0x0019200000000000L});
    public static final BitSet FOLLOW_relational_operator_in_relational_expression3163 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_relational_expression_in_relational_expression3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relational_operator__in_relational_operator3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression3203 = new BitSet(new long[]{0x0000000000000002L,0x0020400000000000L});
    public static final BitSet FOLLOW_set_in_shift_expression3207 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_shift_expression_in_shift_expression3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression3222 = new BitSet(new long[]{0x0000000000000002L,0x0000001100000000L});
    public static final BitSet FOLLOW_set_in_additive_expression3225 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_additive_expression_in_additive_expression3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3241 = new BitSet(new long[]{0x0000000000000002L,0x0000020040800000L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression3245 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_cast_expression3278 = new BitSet(new long[]{0x0000000000000010L,0x8000000000000000L,0x0000000130500021L});
    public static final BitSet FOLLOW_type_name_in_cast_expression3280 = new BitSet(new long[]{0x0000000000000000L,0x0000000064000000L});
    public static final BitSet FOLLOW_ptr_operator_in_cast_expression3282 = new BitSet(new long[]{0x0000000000000000L,0x0000000064000000L});
    public static final BitSet FOLLOW_93_in_cast_expression3285 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_call_template_list3309 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFDFFFFFFFL,0x000000FFFFFFFFFFL});
    public static final BitSet FOLLOW_template_param_list_in_call_template_list3311 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_call_template_list3313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_function_argument_list3322 = new BitSet(new long[]{0x0100040808000010L,0x0000003374080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_function_argument_in_function_argument_list3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000820000000L});
    public static final BitSet FOLLOW_99_in_function_argument_list3329 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_function_argument_in_function_argument_list3331 = new BitSet(new long[]{0x0000000000000000L,0x0000000820000000L});
    public static final BitSet FOLLOW_93_in_function_argument_list3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_function_argument3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_unary_expression3369 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_unary_expression3375 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression3382 = new BitSet(new long[]{0x0100040808000010L,0x0000001154080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callee_in_postfix_expression3413 = new BitSet(new long[]{0x0000000000000002L,0x0000200010000000L});
    public static final BitSet FOLLOW_function_call_tail_in_postfix_expression3423 = new BitSet(new long[]{0x0000000020000002L,0x0080008000000000L});
    public static final BitSet FOLLOW_postfix_tail_in_postfix_expression3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_callee3504 = new BitSet(new long[]{0x0000000020000002L,0x008000A200000000L});
    public static final BitSet FOLLOW_postfix_in_callee3506 = new BitSet(new long[]{0x0000000020000002L,0x008000A200000000L});
    public static final BitSet FOLLOW_set_in_postfix_tail3515 = new BitSet(new long[]{0x0100040808000010L,0x0000000010000100L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_tail3521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_postfix_tail3538 = new BitSet(new long[]{0x0100040808000010L,0x0000000010000100L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_tail3540 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_postfix_tail3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_postfix3551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_postfix3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_postfix3566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_postfix3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_postfix3581 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_expr_in_postfix3583 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_postfix3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_postfix3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_postfix3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_template_list_in_function_call_tail3621 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_function_argument_list_in_function_call_tail3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_argument_list_in_function_call_tail3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_primary_expression3674 = new BitSet(new long[]{0x0100040808000010L,0x0000003354080100L,0x0000008000000000L});
    public static final BitSet FOLLOW_expr__in_primary_expression3676 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_primary_expression3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_primary_expression3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator__in_unary_operator3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_operator_function_id4003 = new BitSet(new long[]{0x0000000000000000L,0x06FFE7FFDF980000L,0x000000B800002004L});
    public static final BitSet FOLLOW_operator_in_operator_function_id4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator4013 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_119_in_operator4023 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_operator4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_operator4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_operator4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_operator4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_operator4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_operator4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_operator4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_operator4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_operator4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_operator4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_operator4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_operator4075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_operator4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_operator4083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_operator4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_operator4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_operator4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_operator4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_operator4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_operator4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_operator4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_operator4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_operator4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_operator4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_operator4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_operator4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_operator4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_operator4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_operator4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_operator4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_operator4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_operator4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_operator4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_operator4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_operator4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_operator4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_operator4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_operator4185 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_operator4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_operator4191 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_operator4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_identifier4252 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_identifier4255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALPHA_NUMERIC_in_identifier4257 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_function_def__in_function_def4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_name__in_function_name4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_decl__in_parameter_decl4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_name__in_parameter_name4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition__in_condition4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespace_def__in_namespace_def4350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_using_directive__in_using_directive4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl__in_simple_decl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement__in_jump_statement4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_init_decl_name__in_init_decl_name4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_include_directive__in_include_directive4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label__in_label4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred1_CPPGrammar306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_synpred2_CPPGrammar334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_synpred3_CPPGrammar738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_synpred4_CPPGrammar750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_synpred5_CPPGrammar762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_expr_statement_in_synpred6_CPPGrammar1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_statement_in_synpred7_CPPGrammar1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_synpred8_CPPGrammar2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_decl_in_synpred9_CPPGrammar2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_def_in_synpred10_CPPGrammar2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_synpred11_CPPGrammar3266 = new BitSet(new long[]{0x0000000000000010L,0x8000000000000000L,0x0000000130500021L});
    public static final BitSet FOLLOW_type_name_in_synpred11_CPPGrammar3268 = new BitSet(new long[]{0x0000000000000000L,0x0000000064000000L});
    public static final BitSet FOLLOW_ptr_operator_in_synpred11_CPPGrammar3270 = new BitSet(new long[]{0x0000000000000000L,0x0000000064000000L});
    public static final BitSet FOLLOW_93_in_synpred11_CPPGrammar3273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_tail_in_synpred12_CPPGrammar3417 = new BitSet(new long[]{0x0000000000000002L});

}