grammar SPARQLPatternsGrammar;

sparqlTemplate : (SPARQLTEXT | patternFunction)+;

patternFunction : singleton | dotList | filterList | spaceList | joinFilterList ;

//Single element
singleton : SINGELTONSEP (baseElement | asClause) SINGELTONSEP;

//List of elements separated by space ' '
spaceList : SPACELISTSEP (baseElement | asClause) SPACELISTSEP;

//List of filters applied to elements. Each filter is a condition applied to a single element
filterList : FILTERLISTSEP  baseElement FILTERLISTSEP;

// separating elements at the pattern body, as a join of triple patterns
// no as clause in the query body (in SPARQL, as might appear in SELECT, GROUP BY, or BIND.
// BIND is the only one that might be used in the query body.
dotList : DOTLISTSEP baseElement DOTLISTSEP;

// A filter clause that performs the join by checking equivalence of two values
joinFilterList: JCSEP baseElement '=' baseElement JCSEP;

//Clause to rename an element
// MEDIAN do we need sparqlrext here?
asClause: ASCLAUSEBEGIN baseElement (AS VARAIBLEMARKER (prefix baseElement | SPARQLTEXT))? ASCLAUSEEND;

baseElement :  (elementRole | prefixedElementRole);

//simpleBaseElement : (simpleElementRole | prefixedElementRole);

//simplePrefixedElementRole : prefix simpleElementRole;
//simpleElementRole: '<' ID '>';

//Prefix for an element e.g. "SI_"
prefixedElementRole : (VARAIBLEMARKER)? prefix elementRole;
prefix : SPARQLTEXT CONCAT;

elementRole : '<' ID attribute '>';
attribute : DOTSEP ID;

VARAIBLEMARKER: '!VM';
DOTLISTSEP: '!DL';
FILTEROPENER: ' FILTER(';
FILTERCLOSER: ')';
SINGELTONSEP: '!E';
SPACELISTSEP: '!SL';
FILTERLISTSEP: '!FL';
JFLISTSEP: '!JL';
JCSEP: '!JFL';
DOTSEP: '.';
CONCAT: '!+';
ASCLAUSEBEGIN: '![' ;
ASCLAUSEEND: '!]';
AS: 'AS';
//TABLEPREFIX: 'table';

ID : [a-zA-Z0-9_][a-zA-Z0-9_\-]*;

SPARQLTEXT : '"' .*? '"' ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

