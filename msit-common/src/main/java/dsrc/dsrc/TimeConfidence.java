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
 * Define the ASN1 Type TimeConfidence from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class TimeConfidence extends Enumerated {
    
    /**
     * The default constructor.
     */
    private TimeConfidence()
    {
	super(cFirstNumber);
    }
    
    protected TimeConfidence(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long time_100_000 = 1;
	public static final long time_050_000 = 2;
	public static final long time_020_000 = 3;
	public static final long time_010_000 = 4;
	public static final long time_002_000 = 5;
	public static final long time_001_000 = 6;
	public static final long time_000_500 = 7;
	public static final long time_000_200 = 8;
	public static final long time_000_100 = 9;
	public static final long time_000_050 = 10;
	public static final long time_000_020 = 11;
	public static final long time_000_010 = 12;
	public static final long time_000_005 = 13;
	public static final long time_000_002 = 14;
	public static final long time_000_001 = 15;
	public static final long time_000_000_5 = 16;
	public static final long time_000_000_2 = 17;
	public static final long time_000_000_1 = 18;
	public static final long time_000_000_05 = 19;
	public static final long time_000_000_02 = 20;
	public static final long time_000_000_01 = 21;
	public static final long time_000_000_005 = 22;
	public static final long time_000_000_002 = 23;
	public static final long time_000_000_001 = 24;
	public static final long time_000_000_000_5 = 25;
	public static final long time_000_000_000_2 = 26;
	public static final long time_000_000_000_1 = 27;
	public static final long time_000_000_000_05 = 28;
	public static final long time_000_000_000_02 = 29;
	public static final long time_000_000_000_01 = 30;
	public static final long time_000_000_000_005 = 31;
	public static final long time_000_000_000_002 = 32;
	public static final long time_000_000_000_001 = 33;
	public static final long time_000_000_000_000_5 = 34;
	public static final long time_000_000_000_000_2 = 35;
	public static final long time_000_000_000_000_1 = 36;
	public static final long time_000_000_000_000_05 = 37;
	public static final long time_000_000_000_000_02 = 38;
	public static final long time_000_000_000_000_01 = 39;
    }
    // Named list definitions.
    private final static TimeConfidence cNamedNumbers[] = {
	new TimeConfidence(), 
	new TimeConfidence(1), 
	new TimeConfidence(2), 
	new TimeConfidence(3), 
	new TimeConfidence(4), 
	new TimeConfidence(5), 
	new TimeConfidence(6), 
	new TimeConfidence(7), 
	new TimeConfidence(8), 
	new TimeConfidence(9), 
	new TimeConfidence(10), 
	new TimeConfidence(11), 
	new TimeConfidence(12), 
	new TimeConfidence(13), 
	new TimeConfidence(14), 
	new TimeConfidence(15), 
	new TimeConfidence(16), 
	new TimeConfidence(17), 
	new TimeConfidence(18), 
	new TimeConfidence(19), 
	new TimeConfidence(20), 
	new TimeConfidence(21), 
	new TimeConfidence(22), 
	new TimeConfidence(23), 
	new TimeConfidence(24), 
	new TimeConfidence(25), 
	new TimeConfidence(26), 
	new TimeConfidence(27), 
	new TimeConfidence(28), 
	new TimeConfidence(29), 
	new TimeConfidence(30), 
	new TimeConfidence(31), 
	new TimeConfidence(32), 
	new TimeConfidence(33), 
	new TimeConfidence(34), 
	new TimeConfidence(35), 
	new TimeConfidence(36), 
	new TimeConfidence(37), 
	new TimeConfidence(38), 
	new TimeConfidence(39)
    };
    public static final TimeConfidence unavailable = cNamedNumbers[0];
    public static final TimeConfidence time_100_000 = cNamedNumbers[1];
    public static final TimeConfidence time_050_000 = cNamedNumbers[2];
    public static final TimeConfidence time_020_000 = cNamedNumbers[3];
    public static final TimeConfidence time_010_000 = cNamedNumbers[4];
    public static final TimeConfidence time_002_000 = cNamedNumbers[5];
    public static final TimeConfidence time_001_000 = cNamedNumbers[6];
    public static final TimeConfidence time_000_500 = cNamedNumbers[7];
    public static final TimeConfidence time_000_200 = cNamedNumbers[8];
    public static final TimeConfidence time_000_100 = cNamedNumbers[9];
    public static final TimeConfidence time_000_050 = cNamedNumbers[10];
    public static final TimeConfidence time_000_020 = cNamedNumbers[11];
    public static final TimeConfidence time_000_010 = cNamedNumbers[12];
    public static final TimeConfidence time_000_005 = cNamedNumbers[13];
    public static final TimeConfidence time_000_002 = cNamedNumbers[14];
    public static final TimeConfidence time_000_001 = cNamedNumbers[15];
    public static final TimeConfidence time_000_000_5 = cNamedNumbers[16];
    public static final TimeConfidence time_000_000_2 = cNamedNumbers[17];
    public static final TimeConfidence time_000_000_1 = cNamedNumbers[18];
    public static final TimeConfidence time_000_000_05 = cNamedNumbers[19];
    public static final TimeConfidence time_000_000_02 = cNamedNumbers[20];
    public static final TimeConfidence time_000_000_01 = cNamedNumbers[21];
    public static final TimeConfidence time_000_000_005 = cNamedNumbers[22];
    public static final TimeConfidence time_000_000_002 = cNamedNumbers[23];
    public static final TimeConfidence time_000_000_001 = cNamedNumbers[24];
    public static final TimeConfidence time_000_000_000_5 = cNamedNumbers[25];
    public static final TimeConfidence time_000_000_000_2 = cNamedNumbers[26];
    public static final TimeConfidence time_000_000_000_1 = cNamedNumbers[27];
    public static final TimeConfidence time_000_000_000_05 = cNamedNumbers[28];
    public static final TimeConfidence time_000_000_000_02 = cNamedNumbers[29];
    public static final TimeConfidence time_000_000_000_01 = cNamedNumbers[30];
    public static final TimeConfidence time_000_000_000_005 = cNamedNumbers[31];
    public static final TimeConfidence time_000_000_000_002 = cNamedNumbers[32];
    public static final TimeConfidence time_000_000_000_001 = cNamedNumbers[33];
    public static final TimeConfidence time_000_000_000_000_5 = cNamedNumbers[34];
    public static final TimeConfidence time_000_000_000_000_2 = cNamedNumbers[35];
    public static final TimeConfidence time_000_000_000_000_1 = cNamedNumbers[36];
    public static final TimeConfidence time_000_000_000_000_05 = cNamedNumbers[37];
    public static final TimeConfidence time_000_000_000_000_02 = cNamedNumbers[38];
    public static final TimeConfidence time_000_000_000_000_01 = cNamedNumbers[39];
    
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
	if (value >= 0 && value <= 39)
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
    
    public static TimeConfidence valueOf(long value)
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
	    "TimeConfidence"
	),
	new QName (
	    "DSRC",
	    "TimeConfidence"
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
		    "time-100-000",
		    1
		),
		new MemberListElement (
		    "time-050-000",
		    2
		),
		new MemberListElement (
		    "time-020-000",
		    3
		),
		new MemberListElement (
		    "time-010-000",
		    4
		),
		new MemberListElement (
		    "time-002-000",
		    5
		),
		new MemberListElement (
		    "time-001-000",
		    6
		),
		new MemberListElement (
		    "time-000-500",
		    7
		),
		new MemberListElement (
		    "time-000-200",
		    8
		),
		new MemberListElement (
		    "time-000-100",
		    9
		),
		new MemberListElement (
		    "time-000-050",
		    10
		),
		new MemberListElement (
		    "time-000-020",
		    11
		),
		new MemberListElement (
		    "time-000-010",
		    12
		),
		new MemberListElement (
		    "time-000-005",
		    13
		),
		new MemberListElement (
		    "time-000-002",
		    14
		),
		new MemberListElement (
		    "time-000-001",
		    15
		),
		new MemberListElement (
		    "time-000-000-5",
		    16
		),
		new MemberListElement (
		    "time-000-000-2",
		    17
		),
		new MemberListElement (
		    "time-000-000-1",
		    18
		),
		new MemberListElement (
		    "time-000-000-05",
		    19
		),
		new MemberListElement (
		    "time-000-000-02",
		    20
		),
		new MemberListElement (
		    "time-000-000-01",
		    21
		),
		new MemberListElement (
		    "time-000-000-005",
		    22
		),
		new MemberListElement (
		    "time-000-000-002",
		    23
		),
		new MemberListElement (
		    "time-000-000-001",
		    24
		),
		new MemberListElement (
		    "time-000-000-000-5",
		    25
		),
		new MemberListElement (
		    "time-000-000-000-2",
		    26
		),
		new MemberListElement (
		    "time-000-000-000-1",
		    27
		),
		new MemberListElement (
		    "time-000-000-000-05",
		    28
		),
		new MemberListElement (
		    "time-000-000-000-02",
		    29
		),
		new MemberListElement (
		    "time-000-000-000-01",
		    30
		),
		new MemberListElement (
		    "time-000-000-000-005",
		    31
		),
		new MemberListElement (
		    "time-000-000-000-002",
		    32
		),
		new MemberListElement (
		    "time-000-000-000-001",
		    33
		),
		new MemberListElement (
		    "time-000-000-000-000-5",
		    34
		),
		new MemberListElement (
		    "time-000-000-000-000-2",
		    35
		),
		new MemberListElement (
		    "time-000-000-000-000-1",
		    36
		),
		new MemberListElement (
		    "time-000-000-000-000-05",
		    37
		),
		new MemberListElement (
		    "time-000-000-000-000-02",
		    38
		),
		new MemberListElement (
		    "time-000-000-000-000-01",
		    39
		)
	    }
	),
	0,
	unavailable
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' TimeConfidence object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' TimeConfidence object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for TimeConfidence
