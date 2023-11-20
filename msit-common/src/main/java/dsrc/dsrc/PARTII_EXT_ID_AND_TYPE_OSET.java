/*************************************************************/
/* Copyright (C) 2023 OSS Nokalva, Inc.  All rights reserved.*/
/*************************************************************/

/* THIS FILE IS PROPRIETARY MATERIAL OF OSS NOKALVA, INC.
 * AND MAY BE USED ONLY BY DIRECT LICENSEES OF OSS NOKALVA, INC.
 * THIS FILE MAY NOT BE DISTRIBUTED.
 * THIS COPYRIGHT STATEMENT MAY NOT BE REMOVED. */

/* Generated for: Neighbor System, Site-based, License 17353 17353,
 * at 16th Fl. IT Venture Tower (East), 135, Jungdae-ro, Songpa-Gu, Seoul 05717, Korea. */
/* Abstract syntax: j2735_cits_20201125 */
/* ASN.1 Java project: dsrc.Dsrc */
/* Created: Wed Jul 12 11:40:42 2023 */
/* ASN.1 Compiler for Java version: 7.2 */
/* ASN.1 compiler options and file names specified:
 * -output dsrc -nouniquepdu -per -uper -ber -der -cer -json -root
 * -pdusforopentypes -messageFormat msvc
 * D:/OSS_ASN1/Project/POLICE/J2735_CITS_20201125.asn
 * C:/Users/Administrator/AppData/Local/Temp/2/asn1studio.Administrator.9592/ossSamplePOLICE/J2735_CITS_20201125.asn
 */


package dsrc.dsrc;

import com.oss.asn1.AbstractData;
import com.oss.asn1.InfoObjectSet;
import com.oss.metadata.ContainerInfo;
import com.oss.metadata.QName;
import com.oss.metadata.TypeInfo;
import com.oss.metadata.TypeInfoRef;

/**
 * Define the ASN1 Type PARTII_EXT_ID_AND_TYPE_OSET from ASN1 Module DSRC.
 * @see InfoObjectSet
 */

public class PARTII_EXT_ID_AND_TYPE_OSET extends InfoObjectSet {
    
    /**
     * The default constructor.
     */
    public PARTII_EXT_ID_AND_TYPE_OSET()
    {
    }
    
    /**
     * Construct with components.
     */
    public PARTII_EXT_ID_AND_TYPE_OSET(PARTII_EXT_ID_AND_TYPE[] objects,
		    int flags, String modname, String osetname)
    {
	super(objects, flags, modname, osetname);
    }
    
    /**
     * Initialize the type descriptor..
     */
    private static final ContainerInfo c_typeinfo = new ContainerInfo (
	null,
	new QName (
	    "dsrc.dsrc",
	    "PARTII_EXT_ID_AND_TYPE_OSET"
	),
	new QName (
	    "DSRC",
	    "PARTII-EXT-ID-AND-TYPE"
	),
	0,
	null,
	null,
	new TypeInfoRef (
	    new QName (
		"dsrc.dsrc",
		"PARTII_EXT_ID_AND_TYPE"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PARTII_EXT_ID_AND_TYPE_OSET object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PARTII_EXT_ID_AND_TYPE_OSET object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Create an instance of the class that SEQUENCE OF/SET OF holds.
     */
    public AbstractData createInstance()
    {
	return (AbstractData)new PARTII_EXT_ID_AND_TYPE();
    }
    
} // End class definition for PARTII_EXT_ID_AND_TYPE_OSET
