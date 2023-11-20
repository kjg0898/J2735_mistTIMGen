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

import com.oss.asn1.ASN1Type;
import com.oss.asn1.AbstractData;
import com.oss.asn1.InfoObject;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type REG_EXT_ID_AND_TYPE from ASN1 Module DSRC.
 * @see InfoObject
 */

public class REG_EXT_ID_AND_TYPE extends InfoObject {
    
    /**
     * The default constructor.
     */
    public REG_EXT_ID_AND_TYPE()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public REG_EXT_ID_AND_TYPE(RegionId id, ASN1Type Type)
    {
	setId(id);
	setType(Type);
    }
    
    public void initComponents()
    {
	mComponents[0] = new RegionId();
	mComponents[1] = new ASN1Type();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[2];
    }
    
    // Unique field index initialization
    {
	mUniqueFieldIndex = 0;
    }
    
    
    // Methods for field "id"
    public RegionId getId()
    {
	return (RegionId)mComponents[0];
    }
    
    public void setId(RegionId id)
    {
	mComponents[0] = id;
    }
    
    
    // Methods for field "Type"
    public ASN1Type getType()
    {
	return (ASN1Type)mComponents[1];
    }
    
    public void setType(ASN1Type Type)
    {
	mComponents[1] = Type;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    null
	),
	new QName (
	    "dsrc.dsrc",
	    "REG_EXT_ID_AND_TYPE"
	),
	new QName (
	    "DSRC",
	    "REG-EXT-ID-AND-TYPE"
	),
	274450,
	null,
	new FieldsList (
	    new InfoObjectFieldInfo[] {
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "RegionId"
			)
		    ),
		    "id",
		    0,
		    66,
		    null
		),
		new InfoObjectFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "com.oss.asn1",
			    "ASN1Type"
			)
		    ),
		    "Type",
		    1,
		    2,
		    null
		)
	    }
	),
	0,
	null,
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' REG_EXT_ID_AND_TYPE object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' REG_EXT_ID_AND_TYPE object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for REG_EXT_ID_AND_TYPE
