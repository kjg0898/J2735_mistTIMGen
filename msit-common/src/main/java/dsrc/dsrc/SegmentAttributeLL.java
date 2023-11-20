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
 * Define the ASN1 Type SegmentAttributeLL from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class SegmentAttributeLL extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SegmentAttributeLL()
    {
	super(cFirstNumber);
    }
    
    protected SegmentAttributeLL(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long reserved = 0;
	public static final long doNotBlock = 1;
	public static final long whiteLine = 2;
	public static final long mergingLaneLeft = 3;
	public static final long mergingLaneRight = 4;
	public static final long curbOnLeft = 5;
	public static final long curbOnRight = 6;
	public static final long loadingzoneOnLeft = 7;
	public static final long loadingzoneOnRight = 8;
	public static final long turnOutPointOnLeft = 9;
	public static final long turnOutPointOnRight = 10;
	public static final long adjacentParkingOnLeft = 11;
	public static final long adjacentParkingOnRight = 12;
	public static final long adjacentBikeLaneOnLeft = 13;
	public static final long adjacentBikeLaneOnRight = 14;
	public static final long sharedBikeLane = 15;
	public static final long bikeBoxInFront = 16;
	public static final long transitStopOnLeft = 17;
	public static final long transitStopOnRight = 18;
	public static final long transitStopInLane = 19;
	public static final long sharedWithTrackedVehicle = 20;
	public static final long safeIsland = 21;
	public static final long lowCurbsPresent = 22;
	public static final long rumbleStripPresent = 23;
	public static final long audibleSignalingPresent = 24;
	public static final long adaptiveTimingPresent = 25;
	public static final long rfSignalRequestPresent = 26;
	public static final long partialCurbIntrusion = 27;
	public static final long taperToLeft = 28;
	public static final long taperToRight = 29;
	public static final long taperToCenterLine = 30;
	public static final long parallelParking = 31;
	public static final long headInParking = 32;
	public static final long freeParking = 33;
	public static final long timeRestrictionsOnParking = 34;
	public static final long costToPark = 35;
	public static final long midBlockCurbPresent = 36;
	public static final long unEvenPavementPresent = 37;
	
    }
    // Named list definitions.
    private final static SegmentAttributeLL cNamedNumbers[] = {
	new SegmentAttributeLL(), 
	new SegmentAttributeLL(1), 
	new SegmentAttributeLL(2), 
	new SegmentAttributeLL(3), 
	new SegmentAttributeLL(4), 
	new SegmentAttributeLL(5), 
	new SegmentAttributeLL(6), 
	new SegmentAttributeLL(7), 
	new SegmentAttributeLL(8), 
	new SegmentAttributeLL(9), 
	new SegmentAttributeLL(10), 
	new SegmentAttributeLL(11), 
	new SegmentAttributeLL(12), 
	new SegmentAttributeLL(13), 
	new SegmentAttributeLL(14), 
	new SegmentAttributeLL(15), 
	new SegmentAttributeLL(16), 
	new SegmentAttributeLL(17), 
	new SegmentAttributeLL(18), 
	new SegmentAttributeLL(19), 
	new SegmentAttributeLL(20), 
	new SegmentAttributeLL(21), 
	new SegmentAttributeLL(22), 
	new SegmentAttributeLL(23), 
	new SegmentAttributeLL(24), 
	new SegmentAttributeLL(25), 
	new SegmentAttributeLL(26), 
	new SegmentAttributeLL(27), 
	new SegmentAttributeLL(28), 
	new SegmentAttributeLL(29), 
	new SegmentAttributeLL(30), 
	new SegmentAttributeLL(31), 
	new SegmentAttributeLL(32), 
	new SegmentAttributeLL(33), 
	new SegmentAttributeLL(34), 
	new SegmentAttributeLL(35), 
	new SegmentAttributeLL(36), 
	new SegmentAttributeLL(37)
    };
    public static final SegmentAttributeLL reserved = cNamedNumbers[0];
    public static final SegmentAttributeLL doNotBlock = cNamedNumbers[1];
    public static final SegmentAttributeLL whiteLine = cNamedNumbers[2];
    public static final SegmentAttributeLL mergingLaneLeft = cNamedNumbers[3];
    public static final SegmentAttributeLL mergingLaneRight = cNamedNumbers[4];
    public static final SegmentAttributeLL curbOnLeft = cNamedNumbers[5];
    public static final SegmentAttributeLL curbOnRight = cNamedNumbers[6];
    public static final SegmentAttributeLL loadingzoneOnLeft = cNamedNumbers[7];
    public static final SegmentAttributeLL loadingzoneOnRight = cNamedNumbers[8];
    public static final SegmentAttributeLL turnOutPointOnLeft = cNamedNumbers[9];
    public static final SegmentAttributeLL turnOutPointOnRight = cNamedNumbers[10];
    public static final SegmentAttributeLL adjacentParkingOnLeft = cNamedNumbers[11];
    public static final SegmentAttributeLL adjacentParkingOnRight = cNamedNumbers[12];
    public static final SegmentAttributeLL adjacentBikeLaneOnLeft = cNamedNumbers[13];
    public static final SegmentAttributeLL adjacentBikeLaneOnRight = cNamedNumbers[14];
    public static final SegmentAttributeLL sharedBikeLane = cNamedNumbers[15];
    public static final SegmentAttributeLL bikeBoxInFront = cNamedNumbers[16];
    public static final SegmentAttributeLL transitStopOnLeft = cNamedNumbers[17];
    public static final SegmentAttributeLL transitStopOnRight = cNamedNumbers[18];
    public static final SegmentAttributeLL transitStopInLane = cNamedNumbers[19];
    public static final SegmentAttributeLL sharedWithTrackedVehicle = cNamedNumbers[20];
    public static final SegmentAttributeLL safeIsland = cNamedNumbers[21];
    public static final SegmentAttributeLL lowCurbsPresent = cNamedNumbers[22];
    public static final SegmentAttributeLL rumbleStripPresent = cNamedNumbers[23];
    public static final SegmentAttributeLL audibleSignalingPresent = cNamedNumbers[24];
    public static final SegmentAttributeLL adaptiveTimingPresent = cNamedNumbers[25];
    public static final SegmentAttributeLL rfSignalRequestPresent = cNamedNumbers[26];
    public static final SegmentAttributeLL partialCurbIntrusion = cNamedNumbers[27];
    public static final SegmentAttributeLL taperToLeft = cNamedNumbers[28];
    public static final SegmentAttributeLL taperToRight = cNamedNumbers[29];
    public static final SegmentAttributeLL taperToCenterLine = cNamedNumbers[30];
    public static final SegmentAttributeLL parallelParking = cNamedNumbers[31];
    public static final SegmentAttributeLL headInParking = cNamedNumbers[32];
    public static final SegmentAttributeLL freeParking = cNamedNumbers[33];
    public static final SegmentAttributeLL timeRestrictionsOnParking = cNamedNumbers[34];
    public static final SegmentAttributeLL costToPark = cNamedNumbers[35];
    public static final SegmentAttributeLL midBlockCurbPresent = cNamedNumbers[36];
    public static final SegmentAttributeLL unEvenPavementPresent = cNamedNumbers[37];
    
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
	if (value >= 0 && value <= 37)
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
    
    public static SegmentAttributeLL valueOf(long value)
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
	    "SegmentAttributeLL"
	),
	new QName (
	    "DSRC",
	    "SegmentAttributeLL"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "reserved",
		    0
		),
		new MemberListElement (
		    "doNotBlock",
		    1
		),
		new MemberListElement (
		    "whiteLine",
		    2
		),
		new MemberListElement (
		    "mergingLaneLeft",
		    3
		),
		new MemberListElement (
		    "mergingLaneRight",
		    4
		),
		new MemberListElement (
		    "curbOnLeft",
		    5
		),
		new MemberListElement (
		    "curbOnRight",
		    6
		),
		new MemberListElement (
		    "loadingzoneOnLeft",
		    7
		),
		new MemberListElement (
		    "loadingzoneOnRight",
		    8
		),
		new MemberListElement (
		    "turnOutPointOnLeft",
		    9
		),
		new MemberListElement (
		    "turnOutPointOnRight",
		    10
		),
		new MemberListElement (
		    "adjacentParkingOnLeft",
		    11
		),
		new MemberListElement (
		    "adjacentParkingOnRight",
		    12
		),
		new MemberListElement (
		    "adjacentBikeLaneOnLeft",
		    13
		),
		new MemberListElement (
		    "adjacentBikeLaneOnRight",
		    14
		),
		new MemberListElement (
		    "sharedBikeLane",
		    15
		),
		new MemberListElement (
		    "bikeBoxInFront",
		    16
		),
		new MemberListElement (
		    "transitStopOnLeft",
		    17
		),
		new MemberListElement (
		    "transitStopOnRight",
		    18
		),
		new MemberListElement (
		    "transitStopInLane",
		    19
		),
		new MemberListElement (
		    "sharedWithTrackedVehicle",
		    20
		),
		new MemberListElement (
		    "safeIsland",
		    21
		),
		new MemberListElement (
		    "lowCurbsPresent",
		    22
		),
		new MemberListElement (
		    "rumbleStripPresent",
		    23
		),
		new MemberListElement (
		    "audibleSignalingPresent",
		    24
		),
		new MemberListElement (
		    "adaptiveTimingPresent",
		    25
		),
		new MemberListElement (
		    "rfSignalRequestPresent",
		    26
		),
		new MemberListElement (
		    "partialCurbIntrusion",
		    27
		),
		new MemberListElement (
		    "taperToLeft",
		    28
		),
		new MemberListElement (
		    "taperToRight",
		    29
		),
		new MemberListElement (
		    "taperToCenterLine",
		    30
		),
		new MemberListElement (
		    "parallelParking",
		    31
		),
		new MemberListElement (
		    "headInParking",
		    32
		),
		new MemberListElement (
		    "freeParking",
		    33
		),
		new MemberListElement (
		    "timeRestrictionsOnParking",
		    34
		),
		new MemberListElement (
		    "costToPark",
		    35
		),
		new MemberListElement (
		    "midBlockCurbPresent",
		    36
		),
		new MemberListElement (
		    "unEvenPavementPresent",
		    37
		)
	    }
	),
	0,
	reserved
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SegmentAttributeLL object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SegmentAttributeLL object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final SegmentAttributeLL cUnknownEnumerator = 
	new SegmentAttributeLL(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for SegmentAttributeLL
