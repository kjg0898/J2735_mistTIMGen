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
 * Define the ASN1 Type ElevationConfidence from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class ElevationConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private ElevationConfidence()
    {
	super(cFirstNumber);
    }
    
    protected ElevationConfidence(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long elev_500_00 = 1;
	public static final long elev_200_00 = 2;
	public static final long elev_100_00 = 3;
	public static final long elev_050_00 = 4;
	public static final long elev_020_00 = 5;
	public static final long elev_010_00 = 6;
	public static final long elev_005_00 = 7;
	public static final long elev_002_00 = 8;
	public static final long elev_001_00 = 9;
	public static final long elev_000_50 = 10;
	public static final long elev_000_20 = 11;
	public static final long elev_000_10 = 12;
	public static final long elev_000_05 = 13;
	public static final long elev_000_02 = 14;
	public static final long elev_000_01 = 15;
    }
    // Named list definitions.
    private final static ElevationConfidence cNamedNumbers[] = {
	new ElevationConfidence(), 
	new ElevationConfidence(1), 
	new ElevationConfidence(2), 
	new ElevationConfidence(3), 
	new ElevationConfidence(4), 
	new ElevationConfidence(5), 
	new ElevationConfidence(6), 
	new ElevationConfidence(7), 
	new ElevationConfidence(8), 
	new ElevationConfidence(9), 
	new ElevationConfidence(10), 
	new ElevationConfidence(11), 
	new ElevationConfidence(12), 
	new ElevationConfidence(13), 
	new ElevationConfidence(14), 
	new ElevationConfidence(15)
    };
    public static final ElevationConfidence unavailable = cNamedNumbers[0];
    public static final ElevationConfidence elev_500_00 = cNamedNumbers[1];
    public static final ElevationConfidence elev_200_00 = cNamedNumbers[2];
    public static final ElevationConfidence elev_100_00 = cNamedNumbers[3];
    public static final ElevationConfidence elev_050_00 = cNamedNumbers[4];
    public static final ElevationConfidence elev_020_00 = cNamedNumbers[5];
    public static final ElevationConfidence elev_010_00 = cNamedNumbers[6];
    public static final ElevationConfidence elev_005_00 = cNamedNumbers[7];
    public static final ElevationConfidence elev_002_00 = cNamedNumbers[8];
    public static final ElevationConfidence elev_001_00 = cNamedNumbers[9];
    public static final ElevationConfidence elev_000_50 = cNamedNumbers[10];
    public static final ElevationConfidence elev_000_20 = cNamedNumbers[11];
    public static final ElevationConfidence elev_000_10 = cNamedNumbers[12];
    public static final ElevationConfidence elev_000_05 = cNamedNumbers[13];
    public static final ElevationConfidence elev_000_02 = cNamedNumbers[14];
    public static final ElevationConfidence elev_000_01 = cNamedNumbers[15];
    
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
    
    public static ElevationConfidence valueOf(long value)
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
	    "ElevationConfidence"
	),
	new QName (
	    "DSRC",
	    "ElevationConfidence"
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
		    "elev-500-00",
		    1
		),
		new MemberListElement (
		    "elev-200-00",
		    2
		),
		new MemberListElement (
		    "elev-100-00",
		    3
		),
		new MemberListElement (
		    "elev-050-00",
		    4
		),
		new MemberListElement (
		    "elev-020-00",
		    5
		),
		new MemberListElement (
		    "elev-010-00",
		    6
		),
		new MemberListElement (
		    "elev-005-00",
		    7
		),
		new MemberListElement (
		    "elev-002-00",
		    8
		),
		new MemberListElement (
		    "elev-001-00",
		    9
		),
		new MemberListElement (
		    "elev-000-50",
		    10
		),
		new MemberListElement (
		    "elev-000-20",
		    11
		),
		new MemberListElement (
		    "elev-000-10",
		    12
		),
		new MemberListElement (
		    "elev-000-05",
		    13
		),
		new MemberListElement (
		    "elev-000-02",
		    14
		),
		new MemberListElement (
		    "elev-000-01",
		    15
		)
	    }
	),
	0,
	unavailable
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ElevationConfidence object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ElevationConfidence object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ElevationConfidence
