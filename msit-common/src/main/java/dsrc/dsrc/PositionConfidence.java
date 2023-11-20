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

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type PositionConfidence from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class PositionConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private PositionConfidence()
    {
	super(cFirstNumber);
    }
    
    protected PositionConfidence(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long a500m = 1;
	public static final long a200m = 2;
	public static final long a100m = 3;
	public static final long a50m = 4;
	public static final long a20m = 5;
	public static final long a10m = 6;
	public static final long a5m = 7;
	public static final long a2m = 8;
	public static final long a1m = 9;
	public static final long a50cm = 10;
	public static final long a20cm = 11;
	public static final long a10cm = 12;
	public static final long a5cm = 13;
	public static final long a2cm = 14;
	public static final long a1cm = 15;
    }
    // Named list definitions.
    private final static PositionConfidence cNamedNumbers[] = {
	new PositionConfidence(), 
	new PositionConfidence(1), 
	new PositionConfidence(2), 
	new PositionConfidence(3), 
	new PositionConfidence(4), 
	new PositionConfidence(5), 
	new PositionConfidence(6), 
	new PositionConfidence(7), 
	new PositionConfidence(8), 
	new PositionConfidence(9), 
	new PositionConfidence(10), 
	new PositionConfidence(11), 
	new PositionConfidence(12), 
	new PositionConfidence(13), 
	new PositionConfidence(14), 
	new PositionConfidence(15)
    };
    public static final PositionConfidence unavailable = cNamedNumbers[0];
    public static final PositionConfidence a500m = cNamedNumbers[1];
    public static final PositionConfidence a200m = cNamedNumbers[2];
    public static final PositionConfidence a100m = cNamedNumbers[3];
    public static final PositionConfidence a50m = cNamedNumbers[4];
    public static final PositionConfidence a20m = cNamedNumbers[5];
    public static final PositionConfidence a10m = cNamedNumbers[6];
    public static final PositionConfidence a5m = cNamedNumbers[7];
    public static final PositionConfidence a2m = cNamedNumbers[8];
    public static final PositionConfidence a1m = cNamedNumbers[9];
    public static final PositionConfidence a50cm = cNamedNumbers[10];
    public static final PositionConfidence a20cm = cNamedNumbers[11];
    public static final PositionConfidence a10cm = cNamedNumbers[12];
    public static final PositionConfidence a5cm = cNamedNumbers[13];
    public static final PositionConfidence a2cm = cNamedNumbers[14];
    public static final PositionConfidence a1cm = cNamedNumbers[15];
    
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
    
    public static PositionConfidence valueOf(long value)
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
	    "dsrc.dsrc",
	    "PositionConfidence"
	),
	new QName (
	    "DSRC",
	    "PositionConfidence"
	),
	274450,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "unavailable",
		    0
		),
		new MemberListElement (
		    "a500m",
		    1
		),
		new MemberListElement (
		    "a200m",
		    2
		),
		new MemberListElement (
		    "a100m",
		    3
		),
		new MemberListElement (
		    "a50m",
		    4
		),
		new MemberListElement (
		    "a20m",
		    5
		),
		new MemberListElement (
		    "a10m",
		    6
		),
		new MemberListElement (
		    "a5m",
		    7
		),
		new MemberListElement (
		    "a2m",
		    8
		),
		new MemberListElement (
		    "a1m",
		    9
		),
		new MemberListElement (
		    "a50cm",
		    10
		),
		new MemberListElement (
		    "a20cm",
		    11
		),
		new MemberListElement (
		    "a10cm",
		    12
		),
		new MemberListElement (
		    "a5cm",
		    13
		),
		new MemberListElement (
		    "a2cm",
		    14
		),
		new MemberListElement (
		    "a1cm",
		    15
		)
	    }
	),
	0,
	unavailable
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' PositionConfidence object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PositionConfidence object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PositionConfidence
