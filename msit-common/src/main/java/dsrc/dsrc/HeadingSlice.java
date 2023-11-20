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

import com.oss.asn1.BitString;
import com.oss.asn1.INTEGER;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type HeadingSlice from ASN1 Module DSRC.
 * @see BitString
 */

public class HeadingSlice extends BitString {
    
    /**
     * The default constructor.
     */
    public HeadingSlice()
    {
    }
    
    /**
     * Construct Bit String from a byte array.
     * All bits considered significant.
     * @param value the byte array to set this object to.
     */
    public HeadingSlice(byte[] value)
    {
	super(value);
    }
    
    
    /**
     * Construct Bit String from a byte array and significant bits.
     * @param value the byte array to set this object to.
     * @param sigBits the number of significant bits.
     */
    public HeadingSlice(byte[] value, int sigBits)
    {
	super(value, sigBits);
    }
    
    // Named list definitions.
    
    public static final int from000_0to022_5degrees = 0;
    public static final int from022_5to045_0degrees = 1;
    public static final int from045_0to067_5degrees = 2;
    public static final int from067_5to090_0degrees = 3;
    public static final int from090_0to112_5degrees = 4;
    public static final int from112_5to135_0degrees = 5;
    public static final int from135_0to157_5degrees = 6;
    public static final int from157_5to180_0degrees = 7;
    public static final int from180_0to202_5degrees = 8;
    public static final int from202_5to225_0degrees = 9;
    public static final int from225_0to247_5degrees = 10;
    public static final int from247_5to270_0degrees = 11;
    public static final int from270_0to292_5degrees = 12;
    public static final int from292_5to315_0degrees = 13;
    public static final int from315_0to337_5degrees = 14;
    public static final int from337_5to360_0degrees = 15;
    
    /**
     * Initialize the type descriptor.
     */
    private static final BitStringInfo c_typeinfo = new BitStringInfo (
	new Tags (
	    new short[] {
		0x0003
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "HeadingSlice"
	),
	new QName (
	    "DSRC",
	    "HeadingSlice"
	),
	274450,
	new SizeConstraint (
	    new SingleValueConstraint (
		new INTEGER(16)
	    )
	),
	new Bounds (
	    Long.valueOf(16),
	    Long.valueOf(16)
	),
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "from000-0to022-5degrees",
		    0
		),
		new MemberListElement (
		    "from022-5to045-0degrees",
		    1
		),
		new MemberListElement (
		    "from045-0to067-5degrees",
		    2
		),
		new MemberListElement (
		    "from067-5to090-0degrees",
		    3
		),
		new MemberListElement (
		    "from090-0to112-5degrees",
		    4
		),
		new MemberListElement (
		    "from112-5to135-0degrees",
		    5
		),
		new MemberListElement (
		    "from135-0to157-5degrees",
		    6
		),
		new MemberListElement (
		    "from157-5to180-0degrees",
		    7
		),
		new MemberListElement (
		    "from180-0to202-5degrees",
		    8
		),
		new MemberListElement (
		    "from202-5to225-0degrees",
		    9
		),
		new MemberListElement (
		    "from225-0to247-5degrees",
		    10
		),
		new MemberListElement (
		    "from247-5to270-0degrees",
		    11
		),
		new MemberListElement (
		    "from270-0to292-5degrees",
		    12
		),
		new MemberListElement (
		    "from292-5to315-0degrees",
		    13
		),
		new MemberListElement (
		    "from315-0to337-5degrees",
		    14
		),
		new MemberListElement (
		    "from337-5to360-0degrees",
		    15
		)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' HeadingSlice object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' HeadingSlice object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for HeadingSlice
