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
 * Define the ASN1 Type BasicVehicleRole from ASN1 Module DSRC.
 * @see Enumerated
 */

public final class BasicVehicleRole extends Enumerated {
    
    /**
     * The default constructor.
     */
    private BasicVehicleRole()
    {
	super(cFirstNumber);
    }
    
    protected BasicVehicleRole(long value)
    {
	super(value);
    }
    
    public static final class Value {
	public static final long basicVehicle = 0;
	public static final long publicTransport = 1;
	public static final long specialTransport = 2;
	public static final long dangerousGoods = 3;
	public static final long roadWork = 4;
	public static final long roadRescue = 5;
	public static final long emergency = 6;
	public static final long safetyCar = 7;
	public static final long none_unknown = 8;
	public static final long truck = 9;
	public static final long motorcycle = 10;
	public static final long roadSideSource = 11;
	public static final long police = 12;
	public static final long fire = 13;
	public static final long ambulance = 14;
	public static final long dot = 15;
	public static final long transit = 16;
	public static final long slowMoving = 17;
	public static final long stopNgo = 18;
	public static final long cyclist = 19;
	public static final long pedestrian = 20;
	public static final long nonMotorized = 21;
	public static final long military = 22;
	
    }
    // Named list definitions.
    private final static BasicVehicleRole cNamedNumbers[] = {
	new BasicVehicleRole(), 
	new BasicVehicleRole(1), 
	new BasicVehicleRole(2), 
	new BasicVehicleRole(3), 
	new BasicVehicleRole(4), 
	new BasicVehicleRole(5), 
	new BasicVehicleRole(6), 
	new BasicVehicleRole(7), 
	new BasicVehicleRole(8), 
	new BasicVehicleRole(9), 
	new BasicVehicleRole(10), 
	new BasicVehicleRole(11), 
	new BasicVehicleRole(12), 
	new BasicVehicleRole(13), 
	new BasicVehicleRole(14), 
	new BasicVehicleRole(15), 
	new BasicVehicleRole(16), 
	new BasicVehicleRole(17), 
	new BasicVehicleRole(18), 
	new BasicVehicleRole(19), 
	new BasicVehicleRole(20), 
	new BasicVehicleRole(21), 
	new BasicVehicleRole(22)
    };
    public static final BasicVehicleRole basicVehicle = cNamedNumbers[0];
    public static final BasicVehicleRole publicTransport = cNamedNumbers[1];
    public static final BasicVehicleRole specialTransport = cNamedNumbers[2];
    public static final BasicVehicleRole dangerousGoods = cNamedNumbers[3];
    public static final BasicVehicleRole roadWork = cNamedNumbers[4];
    public static final BasicVehicleRole roadRescue = cNamedNumbers[5];
    public static final BasicVehicleRole emergency = cNamedNumbers[6];
    public static final BasicVehicleRole safetyCar = cNamedNumbers[7];
    public static final BasicVehicleRole none_unknown = cNamedNumbers[8];
    public static final BasicVehicleRole truck = cNamedNumbers[9];
    public static final BasicVehicleRole motorcycle = cNamedNumbers[10];
    public static final BasicVehicleRole roadSideSource = cNamedNumbers[11];
    public static final BasicVehicleRole police = cNamedNumbers[12];
    public static final BasicVehicleRole fire = cNamedNumbers[13];
    public static final BasicVehicleRole ambulance = cNamedNumbers[14];
    public static final BasicVehicleRole dot = cNamedNumbers[15];
    public static final BasicVehicleRole transit = cNamedNumbers[16];
    public static final BasicVehicleRole slowMoving = cNamedNumbers[17];
    public static final BasicVehicleRole stopNgo = cNamedNumbers[18];
    public static final BasicVehicleRole cyclist = cNamedNumbers[19];
    public static final BasicVehicleRole pedestrian = cNamedNumbers[20];
    public static final BasicVehicleRole nonMotorized = cNamedNumbers[21];
    public static final BasicVehicleRole military = cNamedNumbers[22];
    
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
	if (value >= 0 && value <= 22)
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
    
    public static BasicVehicleRole valueOf(long value)
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
	    "BasicVehicleRole"
	),
	new QName (
	    "DSRC",
	    "BasicVehicleRole"
	),
	274454,
	null,
	new MemberList (
	    new MemberListElement[] {
		new MemberListElement (
		    "basicVehicle",
		    0
		),
		new MemberListElement (
		    "publicTransport",
		    1
		),
		new MemberListElement (
		    "specialTransport",
		    2
		),
		new MemberListElement (
		    "dangerousGoods",
		    3
		),
		new MemberListElement (
		    "roadWork",
		    4
		),
		new MemberListElement (
		    "roadRescue",
		    5
		),
		new MemberListElement (
		    "emergency",
		    6
		),
		new MemberListElement (
		    "safetyCar",
		    7
		),
		new MemberListElement (
		    "none-unknown",
		    8
		),
		new MemberListElement (
		    "truck",
		    9
		),
		new MemberListElement (
		    "motorcycle",
		    10
		),
		new MemberListElement (
		    "roadSideSource",
		    11
		),
		new MemberListElement (
		    "police",
		    12
		),
		new MemberListElement (
		    "fire",
		    13
		),
		new MemberListElement (
		    "ambulance",
		    14
		),
		new MemberListElement (
		    "dot",
		    15
		),
		new MemberListElement (
		    "transit",
		    16
		),
		new MemberListElement (
		    "slowMoving",
		    17
		),
		new MemberListElement (
		    "stopNgo",
		    18
		),
		new MemberListElement (
		    "cyclist",
		    19
		),
		new MemberListElement (
		    "pedestrian",
		    20
		),
		new MemberListElement (
		    "nonMotorized",
		    21
		),
		new MemberListElement (
		    "military",
		    22
		)
	    }
	),
	0,
	basicVehicle
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BasicVehicleRole object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BasicVehicleRole object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Methods for "unknownEnumerator"
     */
    private static final BasicVehicleRole cUnknownEnumerator = 
	new BasicVehicleRole(-1);
    
    public boolean isUnknownEnumerator()
    {
	return this == cUnknownEnumerator;
    }
    
    public Enumerated getUnknownEnumerator()
    {
	return cUnknownEnumerator;
    }
    
} // End class definition for BasicVehicleRole
