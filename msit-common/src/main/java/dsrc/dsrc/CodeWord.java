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

import com.oss.asn1.INTEGER;
import com.oss.asn1.OctetString;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CodeWord from ASN1 Module DSRC.
 * @see OctetString
 */

public class CodeWord extends OctetString {
    
    /**
     * The default constructor.
     */
    public CodeWord()
    {
    }
    
    /**
     * Construct from a byte[] type.
     * @param value the byte[] to set this object to.
     */
    
    public CodeWord(byte[] value)
    {
	super(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final VectorInfo c_typeinfo = new VectorInfo (
	new Tags (
	    new short[] {
		0x0004
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "CodeWord"
	),
	new QName (
	    "DSRC",
	    "CodeWord"
	),
	274450,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new INTEGER(1),
		    new INTEGER(16),
		    0
		)
	    )
	),
	new Bounds (
	    Long.valueOf(1),
	    Long.valueOf(16)
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' CodeWord object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CodeWord object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * The type is a PDU.
     */
    public boolean isPDU()
    {
	return true;
    }
    
} // End class definition for CodeWord
