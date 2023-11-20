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


package dsrc.addgrpb;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type LaneDataAttribute_addGrpB from ASN1 Module AddGrpB.
 * @see Sequence
 */

public class LaneDataAttribute_addGrpB extends Sequence {
    
    /**
     * The default constructor.
     */
    public LaneDataAttribute_addGrpB()
    {
    }
    
    public void initComponents()
    {
	
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[0];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	return null;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.addgrpb",
	    "LaneDataAttribute_addGrpB"
	),
	new QName (
	    "AddGrpB",
	    "LaneDataAttribute-addGrpB"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
	    }
	),
	0,
	null,
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LaneDataAttribute_addGrpB object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LaneDataAttribute_addGrpB object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LaneDataAttribute_addGrpB
