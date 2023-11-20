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
 * Define the ASN1 Type VehicleStatusDeviceTypeTag from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class VehicleStatusDeviceTypeTag extends Enumerated {
    
    /**
     * The default constructor.
     */
    private VehicleStatusDeviceTypeTag()
    {
	super(cFirstNumber);
    }
    
    protected VehicleStatusDeviceTypeTag(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long unknown = 0;
	public static final long lights = 1;
	public static final long wipers = 2;
	public static final long brakes = 3;
	public static final long stab = 4;
	public static final long trac = 5;
	public static final long abs = 6;
	public static final long sunS = 7;
	public static final long rainS = 8;
	public static final long airTemp = 9;
	public static final long steering = 10;
	public static final long vertAccelThres = 11;
	public static final long vertAccel = 12;
	public static final long hozAccelLong = 13;
	public static final long hozAccelLat = 14;
	public static final long hozAccelCon = 15;
	public static final long accel4way = 16;
	public static final long confidenceSet = 17;
	public static final long obDist = 18;
	public static final long obDirect = 19;
	public static final long yaw = 20;
	public static final long yawRateCon = 21;
	public static final long dateTime = 22;
	public static final long fullPos = 23;
	public static final long position2D = 24;
	public static final long position3D = 25;
	public static final long vehicle = 26;
	public static final long speedHeadC = 27;
	public static final long speedC = 28;
	
    }
    // Named list definitions.
    private final static VehicleStatusDeviceTypeTag cNamedNumbers[] = {
	new VehicleStatusDeviceTypeTag(), 
	new VehicleStatusDeviceTypeTag(1), 
	new VehicleStatusDeviceTypeTag(2), 
	new VehicleStatusDeviceTypeTag(3), 
	new VehicleStatusDeviceTypeTag(4), 
	new VehicleStatusDeviceTypeTag(5), 
	new VehicleStatusDeviceTypeTag(6), 
	new VehicleStatusDeviceTypeTag(7), 
	new VehicleStatusDeviceTypeTag(8), 
	new VehicleStatusDeviceTypeTag(9), 
	new VehicleStatusDeviceTypeTag(10), 
	new VehicleStatusDeviceTypeTag(11), 
	new VehicleStatusDeviceTypeTag(12), 
	new VehicleStatusDeviceTypeTag(13), 
	new VehicleStatusDeviceTypeTag(14), 
	new VehicleStatusDeviceTypeTag(15), 
	new VehicleStatusDeviceTypeTag(16), 
	new VehicleStatusDeviceTypeTag(17), 
	new VehicleStatusDeviceTypeTag(18), 
	new VehicleStatusDeviceTypeTag(19), 
	new VehicleStatusDeviceTypeTag(20), 
	new VehicleStatusDeviceTypeTag(21), 
	new VehicleStatusDeviceTypeTag(22), 
	new VehicleStatusDeviceTypeTag(23), 
	new VehicleStatusDeviceTypeTag(24), 
	new VehicleStatusDeviceTypeTag(25), 
	new VehicleStatusDeviceTypeTag(26), 
	new VehicleStatusDeviceTypeTag(27), 
	new VehicleStatusDeviceTypeTag(28)
    };
    public static final VehicleStatusDeviceTypeTag unknown = cNamedNumbers[0];
    public static final VehicleStatusDeviceTypeTag lights = cNamedNumbers[1];
    public static final VehicleStatusDeviceTypeTag wipers = cNamedNumbers[2];
    public static final VehicleStatusDeviceTypeTag brakes = cNamedNumbers[3];
    public static final VehicleStatusDeviceTypeTag stab = cNamedNumbers[4];
    public static final VehicleStatusDeviceTypeTag trac = cNamedNumbers[5];
    public static final VehicleStatusDeviceTypeTag abs = cNamedNumbers[6];
    public static final VehicleStatusDeviceTypeTag sunS = cNamedNumbers[7];
    public static final VehicleStatusDeviceTypeTag rainS = cNamedNumbers[8];
    public static final VehicleStatusDeviceTypeTag airTemp = cNamedNumbers[9];
    public static final VehicleStatusDeviceTypeTag steering = cNamedNumbers[10];
    public static final VehicleStatusDeviceTypeTag vertAccelThres = cNamedNumbers[11];
    public static final VehicleStatusDeviceTypeTag vertAccel = cNamedNumbers[12];
    public static final VehicleStatusDeviceTypeTag hozAccelLong = cNamedNumbers[13];
    public static final VehicleStatusDeviceTypeTag hozAccelLat = cNamedNumbers[14];
    public static final VehicleStatusDeviceTypeTag hozAccelCon = cNamedNumbers[15];
    public static final VehicleStatusDeviceTypeTag accel4way = cNamedNumbers[16];
    public static final VehicleStatusDeviceTypeTag confidenceSet = cNamedNumbers[17];
    public static final VehicleStatusDeviceTypeTag obDist = cNamedNumbers[18];
    public static final VehicleStatusDeviceTypeTag obDirect = cNamedNumbers[19];
    public static final VehicleStatusDeviceTypeTag yaw = cNamedNumbers[20];
    public static final VehicleStatusDeviceTypeTag yawRateCon = cNamedNumbers[21];
    public static final VehicleStatusDeviceTypeTag dateTime = cNamedNumbers[22];
    public static final VehicleStatusDeviceTypeTag fullPos = cNamedNumbers[23];
    public static final VehicleStatusDeviceTypeTag position2D = cNamedNumbers[24];
    public static final VehicleStatusDeviceTypeTag position3D = cNamedNumbers[25];
    public static final VehicleStatusDeviceTypeTag vehicle = cNamedNumbers[26];
    public static final VehicleStatusDeviceTypeTag speedHeadC = cNamedNumbers[27];
    public static final VehicleStatusDeviceTypeTag speedC = cNamedNumbers[28];
    
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
	if (value >= 0 && value <= 28)
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
    
    public static VehicleStatusDeviceTypeTag valueOf(long value)
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
	if (isUnknownEnumerator())
	    return -1;
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
	    "VehicleStatusDeviceTypeTag"
	),
	new QName (
	    "DSRC",
	    "VehicleStatusDeviceTypeTag"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "unknown",
		    0
		),
		new MemberListElement (
		    "lights",
		    1
		),
		new MemberListElement (
		    "wipers",
		    2
		),
		new MemberListElement (
		    "brakes",
		    3
		),
		new MemberListElement (
		    "stab",
		    4
		),
		new MemberListElement (
		    "trac",
		    5
		),
		new MemberListElement (
		    "abs",
		    6
		),
		new MemberListElement (
		    "sunS",
		    7
		),
		new MemberListElement (
		    "rainS",
		    8
		),
		new MemberListElement (
		    "airTemp",
		    9
		),
		new MemberListElement (
		    "steering",
		    10
		),
		new MemberListElement (
		    "vertAccelThres",
		    11
		),
		new MemberListElement (
		    "vertAccel",
		    12
		),
		new MemberListElement (
		    "hozAccelLong",
		    13
		),
		new MemberListElement (
		    "hozAccelLat",
		    14
		),
		new MemberListElement (
		    "hozAccelCon",
		    15
		),
		new MemberListElement (
		    "accel4way",
		    16
		),
		new MemberListElement (
		    "confidenceSet",
		    17
		),
		new MemberListElement (
		    "obDist",
		    18
		),
		new MemberListElement (
		    "obDirect",
		    19
		),
		new MemberListElement (
		    "yaw",
		    20
		),
		new MemberListElement (
		    "yawRateCon",
		    21
		),
		new MemberListElement (
		    "dateTime",
		    22
		),
		new MemberListElement (
		    "fullPos",
		    23
		),
		new MemberListElement (
		    "position2D",
		    24
		),
		new MemberListElement (
		    "position3D",
		    25
		),
		new MemberListElement (
		    "vehicle",
		    26
		),
		new MemberListElement (
		    "speedHeadC",
		    27
		),
		new MemberListElement (
		    "speedC",
		    28
		)
	    }
	),
	0,
	unknown
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' VehicleStatusDeviceTypeTag object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleStatusDeviceTypeTag object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final VehicleStatusDeviceTypeTag cUnknownEnumerator = 
	new VehicleStatusDeviceTypeTag(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for VehicleStatusDeviceTypeTag
