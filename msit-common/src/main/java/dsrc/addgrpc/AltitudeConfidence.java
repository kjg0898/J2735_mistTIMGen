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


package dsrc.addgrpc;

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type AltitudeConfidence from ASN1 Module AddGrpC.
 * @see Enumerated
 */

public final class AltitudeConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private AltitudeConfidence()
    {
	super(cFirstNumber);
    }
    
    protected AltitudeConfidence(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long alt_000_01 = 0;
	public static final long alt_000_02 = 1;
	public static final long alt_000_05 = 2;
	public static final long alt_000_10 = 3;
	public static final long alt_000_20 = 4;
	public static final long alt_000_50 = 5;
	public static final long alt_001_00 = 6;
	public static final long alt_002_00 = 7;
	public static final long alt_005_00 = 8;
	public static final long alt_010_00 = 9;
	public static final long alt_020_00 = 10;
	public static final long alt_050_00 = 11;
	public static final long alt_100_00 = 12;
	public static final long alt_200_00 = 13;
	public static final long outOfRange = 14;
	public static final long unavailable = 15;
    }
    // Named list definitions.
    private final static AltitudeConfidence cNamedNumbers[] = {
	new AltitudeConfidence(), 
	new AltitudeConfidence(1), 
	new AltitudeConfidence(2), 
	new AltitudeConfidence(3), 
	new AltitudeConfidence(4), 
	new AltitudeConfidence(5), 
	new AltitudeConfidence(6), 
	new AltitudeConfidence(7), 
	new AltitudeConfidence(8), 
	new AltitudeConfidence(9), 
	new AltitudeConfidence(10), 
	new AltitudeConfidence(11), 
	new AltitudeConfidence(12), 
	new AltitudeConfidence(13), 
	new AltitudeConfidence(14), 
	new AltitudeConfidence(15)
    };
    public static final AltitudeConfidence alt_000_01 = cNamedNumbers[0];
    public static final AltitudeConfidence alt_000_02 = cNamedNumbers[1];
    public static final AltitudeConfidence alt_000_05 = cNamedNumbers[2];
    public static final AltitudeConfidence alt_000_10 = cNamedNumbers[3];
    public static final AltitudeConfidence alt_000_20 = cNamedNumbers[4];
    public static final AltitudeConfidence alt_000_50 = cNamedNumbers[5];
    public static final AltitudeConfidence alt_001_00 = cNamedNumbers[6];
    public static final AltitudeConfidence alt_002_00 = cNamedNumbers[7];
    public static final AltitudeConfidence alt_005_00 = cNamedNumbers[8];
    public static final AltitudeConfidence alt_010_00 = cNamedNumbers[9];
    public static final AltitudeConfidence alt_020_00 = cNamedNumbers[10];
    public static final AltitudeConfidence alt_050_00 = cNamedNumbers[11];
    public static final AltitudeConfidence alt_100_00 = cNamedNumbers[12];
    public static final AltitudeConfidence alt_200_00 = cNamedNumbers[13];
    public static final AltitudeConfidence outOfRange = cNamedNumbers[14];
    public static final AltitudeConfidence unavailable = cNamedNumbers[15];
    
    protected final static long cFirstNumber = 0;
    protected final static boolean cLinearNumbers = false;
    
    public Enumerated[] getNamedNumbers()
    {
	return cNamedNumbers;
    }
    
    public boolean hasLinearNumbers()
    {
	return cLinearNumbers;
    }
    
    public long getFirstNumber()
    {
	return cFirstNumber;
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public static int indexOfValue(long value)
    {
	if (value >= 0 && value <= 15)
	    return (int)value;
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static AltitudeConfidence valueOf(long value)
    {
	int inx = indexOfValue(value);
	
	if (inx < 0)
	    return null;
	else
	    return cNamedNumbers[inx];
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public int indexOf()
    {
	return indexOfValue(mValue);
    }
    
    /**
     * This method is reserved for internal use and must not be invoked from the application code.
     */
    public Enumerated lookupValue(long value)
    {
	return valueOf(value);
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final EnumeratedInfo c_typeinfo = new EnumeratedInfo (
	new Tags (
	    new short[] {
		0x000a
	    }
	),
	new QName (
	    "dsrc.addgrpc",
	    "AltitudeConfidence"
	),
	new QName (
	    "AddGrpC",
	    "AltitudeConfidence"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "alt-000-01",
		    0
		),
		new MemberListElement (
		    "alt-000-02",
		    1
		),
		new MemberListElement (
		    "alt-000-05",
		    2
		),
		new MemberListElement (
		    "alt-000-10",
		    3
		),
		new MemberListElement (
		    "alt-000-20",
		    4
		),
		new MemberListElement (
		    "alt-000-50",
		    5
		),
		new MemberListElement (
		    "alt-001-00",
		    6
		),
		new MemberListElement (
		    "alt-002-00",
		    7
		),
		new MemberListElement (
		    "alt-005-00",
		    8
		),
		new MemberListElement (
		    "alt-010-00",
		    9
		),
		new MemberListElement (
		    "alt-020-00",
		    10
		),
		new MemberListElement (
		    "alt-050-00",
		    11
		),
		new MemberListElement (
		    "alt-100-00",
		    12
		),
		new MemberListElement (
		    "alt-200-00",
		    13
		),
		new MemberListElement (
		    "outOfRange",
		    14
		),
		new MemberListElement (
		    "unavailable",
		    15
		)
	    }
	),
	0,
	alt_000_01
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AltitudeConfidence object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AltitudeConfidence object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AltitudeConfidence
