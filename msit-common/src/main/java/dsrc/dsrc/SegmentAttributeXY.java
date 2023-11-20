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
 * Define the ASN1 Type SegmentAttributeXY from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class SegmentAttributeXY extends Enumerated {
    
    /**
     * The default constructor.
     */
    private SegmentAttributeXY()
    {
	super(cFirstNumber);
    }
    
    protected SegmentAttributeXY(long value)
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
    private final static SegmentAttributeXY cNamedNumbers[] = {
	new SegmentAttributeXY(), 
	new SegmentAttributeXY(1), 
	new SegmentAttributeXY(2), 
	new SegmentAttributeXY(3), 
	new SegmentAttributeXY(4), 
	new SegmentAttributeXY(5), 
	new SegmentAttributeXY(6), 
	new SegmentAttributeXY(7), 
	new SegmentAttributeXY(8), 
	new SegmentAttributeXY(9), 
	new SegmentAttributeXY(10), 
	new SegmentAttributeXY(11), 
	new SegmentAttributeXY(12), 
	new SegmentAttributeXY(13), 
	new SegmentAttributeXY(14), 
	new SegmentAttributeXY(15), 
	new SegmentAttributeXY(16), 
	new SegmentAttributeXY(17), 
	new SegmentAttributeXY(18), 
	new SegmentAttributeXY(19), 
	new SegmentAttributeXY(20), 
	new SegmentAttributeXY(21), 
	new SegmentAttributeXY(22), 
	new SegmentAttributeXY(23), 
	new SegmentAttributeXY(24), 
	new SegmentAttributeXY(25), 
	new SegmentAttributeXY(26), 
	new SegmentAttributeXY(27), 
	new SegmentAttributeXY(28), 
	new SegmentAttributeXY(29), 
	new SegmentAttributeXY(30), 
	new SegmentAttributeXY(31), 
	new SegmentAttributeXY(32), 
	new SegmentAttributeXY(33), 
	new SegmentAttributeXY(34), 
	new SegmentAttributeXY(35), 
	new SegmentAttributeXY(36), 
	new SegmentAttributeXY(37)
    };
    public static final SegmentAttributeXY reserved = cNamedNumbers[0];
    public static final SegmentAttributeXY doNotBlock = cNamedNumbers[1];
    public static final SegmentAttributeXY whiteLine = cNamedNumbers[2];
    public static final SegmentAttributeXY mergingLaneLeft = cNamedNumbers[3];
    public static final SegmentAttributeXY mergingLaneRight = cNamedNumbers[4];
    public static final SegmentAttributeXY curbOnLeft = cNamedNumbers[5];
    public static final SegmentAttributeXY curbOnRight = cNamedNumbers[6];
    public static final SegmentAttributeXY loadingzoneOnLeft = cNamedNumbers[7];
    public static final SegmentAttributeXY loadingzoneOnRight = cNamedNumbers[8];
    public static final SegmentAttributeXY turnOutPointOnLeft = cNamedNumbers[9];
    public static final SegmentAttributeXY turnOutPointOnRight = cNamedNumbers[10];
    public static final SegmentAttributeXY adjacentParkingOnLeft = cNamedNumbers[11];
    public static final SegmentAttributeXY adjacentParkingOnRight = cNamedNumbers[12];
    public static final SegmentAttributeXY adjacentBikeLaneOnLeft = cNamedNumbers[13];
    public static final SegmentAttributeXY adjacentBikeLaneOnRight = cNamedNumbers[14];
    public static final SegmentAttributeXY sharedBikeLane = cNamedNumbers[15];
    public static final SegmentAttributeXY bikeBoxInFront = cNamedNumbers[16];
    public static final SegmentAttributeXY transitStopOnLeft = cNamedNumbers[17];
    public static final SegmentAttributeXY transitStopOnRight = cNamedNumbers[18];
    public static final SegmentAttributeXY transitStopInLane = cNamedNumbers[19];
    public static final SegmentAttributeXY sharedWithTrackedVehicle = cNamedNumbers[20];
    public static final SegmentAttributeXY safeIsland = cNamedNumbers[21];
    public static final SegmentAttributeXY lowCurbsPresent = cNamedNumbers[22];
    public static final SegmentAttributeXY rumbleStripPresent = cNamedNumbers[23];
    public static final SegmentAttributeXY audibleSignalingPresent = cNamedNumbers[24];
    public static final SegmentAttributeXY adaptiveTimingPresent = cNamedNumbers[25];
    public static final SegmentAttributeXY rfSignalRequestPresent = cNamedNumbers[26];
    public static final SegmentAttributeXY partialCurbIntrusion = cNamedNumbers[27];
    public static final SegmentAttributeXY taperToLeft = cNamedNumbers[28];
    public static final SegmentAttributeXY taperToRight = cNamedNumbers[29];
    public static final SegmentAttributeXY taperToCenterLine = cNamedNumbers[30];
    public static final SegmentAttributeXY parallelParking = cNamedNumbers[31];
    public static final SegmentAttributeXY headInParking = cNamedNumbers[32];
    public static final SegmentAttributeXY freeParking = cNamedNumbers[33];
    public static final SegmentAttributeXY timeRestrictionsOnParking = cNamedNumbers[34];
    public static final SegmentAttributeXY costToPark = cNamedNumbers[35];
    public static final SegmentAttributeXY midBlockCurbPresent = cNamedNumbers[36];
    public static final SegmentAttributeXY unEvenPavementPresent = cNamedNumbers[37];
    
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
    
    public static SegmentAttributeXY valueOf(long value)
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
	    "SegmentAttributeXY"
	),
	new QName (
	    "DSRC",
	    "SegmentAttributeXY"
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
     * Get the type descriptor (TypeInfo) of 'this' SegmentAttributeXY object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SegmentAttributeXY object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final SegmentAttributeXY cUnknownEnumerator = 
	new SegmentAttributeXY(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for SegmentAttributeXY
