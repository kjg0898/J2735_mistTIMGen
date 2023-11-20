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


package dsrc.addgrpd;

import com.oss.asn1.Enumerated;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type DectLaneID from ASN1 Module AddGrpD.
 * @see Enumerated
 */

public final class DectLaneID extends Enumerated {
    
    /**
     * The default constructor.
     */
    private DectLaneID()
    {
	super(cFirstNumber);
    }
    
    protected DectLaneID(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unavailable = 0;
	public static final long busOnlyLane = 10;
	public static final long ctrBusLane = 11;
	public static final long rdSdBusLane = 12;
	public static final long mergingArea = 13;
	public static final long accelerationLane = 14;
	public static final long decelrationLane = 15;
	public static final long rampLane = 16;
	public static final long shoulderLane = 17;
	public static final long carLane = 20;
	public static final long car_1stLane = 21;
	public static final long car_2ndLane = 22;
	public static final long car_3rdLane = 23;
	public static final long car_4thLane = 24;
	public static final long car_5thLane = 25;
	public static final long car_6thLane = 26;
	public static final long car_7thLane = 27;
	public static final long car_8thLane = 28;
	public static final long car_9thLane = 29;
	public static final long car_10thLane = 30;
	public static final long car_11thLane = 31;
	public static final long car_12thLane = 32;
	public static final long car_13thLane = 33;
	public static final long car_14thLane = 34;
	public static final long car_15thLane = 35;
	public static final long car_16thLane = 36;
	public static final long car_17thLane = 37;
	public static final long car_18thLane = 38;
	public static final long car_19thLane = 39;
	public static final long car_20thLane = 40;
	public static final long etcLane = 99;
    }
    // Named list definitions.
    private final static DectLaneID cNamedNumbers[] = {
	new DectLaneID(), 
	new DectLaneID(10), 
	new DectLaneID(11), 
	new DectLaneID(12), 
	new DectLaneID(13), 
	new DectLaneID(14), 
	new DectLaneID(15), 
	new DectLaneID(16), 
	new DectLaneID(17), 
	new DectLaneID(20), 
	new DectLaneID(21), 
	new DectLaneID(22), 
	new DectLaneID(23), 
	new DectLaneID(24), 
	new DectLaneID(25), 
	new DectLaneID(26), 
	new DectLaneID(27), 
	new DectLaneID(28), 
	new DectLaneID(29), 
	new DectLaneID(30), 
	new DectLaneID(31), 
	new DectLaneID(32), 
	new DectLaneID(33), 
	new DectLaneID(34), 
	new DectLaneID(35), 
	new DectLaneID(36), 
	new DectLaneID(37), 
	new DectLaneID(38), 
	new DectLaneID(39), 
	new DectLaneID(40), 
	new DectLaneID(99)
    };
    public static final DectLaneID unavailable = cNamedNumbers[0];
    public static final DectLaneID busOnlyLane = cNamedNumbers[1];
    public static final DectLaneID ctrBusLane = cNamedNumbers[2];
    public static final DectLaneID rdSdBusLane = cNamedNumbers[3];
    public static final DectLaneID mergingArea = cNamedNumbers[4];
    public static final DectLaneID accelerationLane = cNamedNumbers[5];
    public static final DectLaneID decelrationLane = cNamedNumbers[6];
    public static final DectLaneID rampLane = cNamedNumbers[7];
    public static final DectLaneID shoulderLane = cNamedNumbers[8];
    public static final DectLaneID carLane = cNamedNumbers[9];
    public static final DectLaneID car_1stLane = cNamedNumbers[10];
    public static final DectLaneID car_2ndLane = cNamedNumbers[11];
    public static final DectLaneID car_3rdLane = cNamedNumbers[12];
    public static final DectLaneID car_4thLane = cNamedNumbers[13];
    public static final DectLaneID car_5thLane = cNamedNumbers[14];
    public static final DectLaneID car_6thLane = cNamedNumbers[15];
    public static final DectLaneID car_7thLane = cNamedNumbers[16];
    public static final DectLaneID car_8thLane = cNamedNumbers[17];
    public static final DectLaneID car_9thLane = cNamedNumbers[18];
    public static final DectLaneID car_10thLane = cNamedNumbers[19];
    public static final DectLaneID car_11thLane = cNamedNumbers[20];
    public static final DectLaneID car_12thLane = cNamedNumbers[21];
    public static final DectLaneID car_13thLane = cNamedNumbers[22];
    public static final DectLaneID car_14thLane = cNamedNumbers[23];
    public static final DectLaneID car_15thLane = cNamedNumbers[24];
    public static final DectLaneID car_16thLane = cNamedNumbers[25];
    public static final DectLaneID car_17thLane = cNamedNumbers[26];
    public static final DectLaneID car_18thLane = cNamedNumbers[27];
    public static final DectLaneID car_19thLane = cNamedNumbers[28];
    public static final DectLaneID car_20thLane = cNamedNumbers[29];
    public static final DectLaneID etcLane = cNamedNumbers[30];
    
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
	if (value == 0)
	    return 0;
	if (value >= 10 && value <= 17)
	    return (int)(value - 9);
	if (value >= 20 && value <= 40)
	    return (int)(value - 11);
	if (value == 99)
	    return 30;
	else
	    return -1;
    }
    
    /**
     * Returns the enumerator with the specified value or null if the value
     * is not associated with any enumerator.
     *  @param value The value of the enumerator to return.
     *  @return The enumerator with the specified value.
     */
    
    public static DectLaneID valueOf(long value)
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
	    "dsrc.addgrpd",
	    "DectLaneID"
	),
	new QName (
	    "AddGrpD",
	    "DectLaneID"
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
		    "busOnlyLane",
		    10
		),
		new MemberListElement (
		    "ctrBusLane",
		    11
		),
		new MemberListElement (
		    "rdSdBusLane",
		    12
		),
		new MemberListElement (
		    "mergingArea",
		    13
		),
		new MemberListElement (
		    "accelerationLane",
		    14
		),
		new MemberListElement (
		    "decelrationLane",
		    15
		),
		new MemberListElement (
		    "rampLane",
		    16
		),
		new MemberListElement (
		    "shoulderLane",
		    17
		),
		new MemberListElement (
		    "carLane",
		    20
		),
		new MemberListElement (
		    "car-1stLane",
		    21
		),
		new MemberListElement (
		    "car-2ndLane",
		    22
		),
		new MemberListElement (
		    "car-3rdLane",
		    23
		),
		new MemberListElement (
		    "car-4thLane",
		    24
		),
		new MemberListElement (
		    "car-5thLane",
		    25
		),
		new MemberListElement (
		    "car-6thLane",
		    26
		),
		new MemberListElement (
		    "car-7thLane",
		    27
		),
		new MemberListElement (
		    "car-8thLane",
		    28
		),
		new MemberListElement (
		    "car-9thLane",
		    29
		),
		new MemberListElement (
		    "car-10thLane",
		    30
		),
		new MemberListElement (
		    "car-11thLane",
		    31
		),
		new MemberListElement (
		    "car-12thLane",
		    32
		),
		new MemberListElement (
		    "car-13thLane",
		    33
		),
		new MemberListElement (
		    "car-14thLane",
		    34
		),
		new MemberListElement (
		    "car-15thLane",
		    35
		),
		new MemberListElement (
		    "car-16thLane",
		    36
		),
		new MemberListElement (
		    "car-17thLane",
		    37
		),
		new MemberListElement (
		    "car-18thLane",
		    38
		),
		new MemberListElement (
		    "car-19thLane",
		    39
		),
		new MemberListElement (
		    "car-20thLane",
		    40
		),
		new MemberListElement (
		    "etcLane",
		    99
		)
	    }
	),
	0,
	unavailable
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' DectLaneID object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' DectLaneID object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for DectLaneID
