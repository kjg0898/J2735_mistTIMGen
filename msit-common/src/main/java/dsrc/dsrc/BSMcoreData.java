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

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type BSMcoreData from ASN1 Module DSRC.
 * @see Sequence
 */

public class BSMcoreData extends Sequence {
    
    /**
     * The default constructor.
     */
    public BSMcoreData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public BSMcoreData(MsgCount msgCnt, TemporaryID id, DSecond secMark, 
		    Latitude lat, Longitude _long, Elevation elev, 
		    PositionalAccuracy accuracy, 
		    TransmissionState transmission, Speed speed, 
		    Heading heading, SteeringWheelAngle angle, 
		    AccelerationSet4Way accelSet, BrakeSystemStatus brakes, 
		    VehicleSize size)
    {
	setMsgCnt(msgCnt);
	setId(id);
	setSecMark(secMark);
	setLat(lat);
	set_long(_long);
	setElev(elev);
	setAccuracy(accuracy);
	setTransmission(transmission);
	setSpeed(speed);
	setHeading(heading);
	setAngle(angle);
	setAccelSet(accelSet);
	setBrakes(brakes);
	setSize(size);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MsgCount();
	mComponents[1] = new TemporaryID();
	mComponents[2] = new DSecond();
	mComponents[3] = new Latitude();
	mComponents[4] = new Longitude();
	mComponents[5] = new Elevation();
	mComponents[6] = new PositionalAccuracy();
	mComponents[7] = TransmissionState.neutral;
	mComponents[8] = new Speed();
	mComponents[9] = new Heading();
	mComponents[10] = new SteeringWheelAngle();
	mComponents[11] = new AccelerationSet4Way();
	mComponents[12] = new BrakeSystemStatus();
	mComponents[13] = new VehicleSize();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[14];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MsgCount();
	    case 1:
		return new TemporaryID();
	    case 2:
		return new DSecond();
	    case 3:
		return new Latitude();
	    case 4:
		return new Longitude();
	    case 5:
		return new Elevation();
	    case 6:
		return new PositionalAccuracy();
	    case 7:
		return TransmissionState.neutral;
	    case 8:
		return new Speed();
	    case 9:
		return new Heading();
	    case 10:
		return new SteeringWheelAngle();
	    case 11:
		return new AccelerationSet4Way();
	    case 12:
		return new BrakeSystemStatus();
	    case 13:
		return new VehicleSize();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "msgCnt"
    public MsgCount getMsgCnt()
    {
	return (MsgCount)mComponents[0];
    }
    
    public void setMsgCnt(MsgCount msgCnt)
    {
	mComponents[0] = msgCnt;
    }
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return (TemporaryID)mComponents[1];
    }
    
    public void setId(TemporaryID id)
    {
	mComponents[1] = id;
    }
    
    
    // Methods for field "secMark"
    public DSecond getSecMark()
    {
	return (DSecond)mComponents[2];
    }
    
    public void setSecMark(DSecond secMark)
    {
	mComponents[2] = secMark;
    }
    
    
    // Methods for field "lat"
    public Latitude getLat()
    {
	return (Latitude)mComponents[3];
    }
    
    public void setLat(Latitude lat)
    {
	mComponents[3] = lat;
    }
    
    
    // Methods for field "_long"
    public Longitude get_long()
    {
	return (Longitude)mComponents[4];
    }
    
    public void set_long(Longitude _long)
    {
	mComponents[4] = _long;
    }
    
    
    // Methods for field "elev"
    public Elevation getElev()
    {
	return (Elevation)mComponents[5];
    }
    
    public void setElev(Elevation elev)
    {
	mComponents[5] = elev;
    }
    
    
    // Methods for field "accuracy"
    public PositionalAccuracy getAccuracy()
    {
	return (PositionalAccuracy)mComponents[6];
    }
    
    public void setAccuracy(PositionalAccuracy accuracy)
    {
	mComponents[6] = accuracy;
    }
    
    
    // Methods for field "transmission"
    public TransmissionState getTransmission()
    {
	return (TransmissionState)mComponents[7];
    }
    
    public void setTransmission(TransmissionState transmission)
    {
	mComponents[7] = transmission;
    }
    
    
    // Methods for field "speed"
    public Speed getSpeed()
    {
	return (Speed)mComponents[8];
    }
    
    public void setSpeed(Speed speed)
    {
	mComponents[8] = speed;
    }
    
    
    // Methods for field "heading"
    public Heading getHeading()
    {
	return (Heading)mComponents[9];
    }
    
    public void setHeading(Heading heading)
    {
	mComponents[9] = heading;
    }
    
    
    // Methods for field "angle"
    public SteeringWheelAngle getAngle()
    {
	return (SteeringWheelAngle)mComponents[10];
    }
    
    public void setAngle(SteeringWheelAngle angle)
    {
	mComponents[10] = angle;
    }
    
    
    // Methods for field "accelSet"
    public AccelerationSet4Way getAccelSet()
    {
	return (AccelerationSet4Way)mComponents[11];
    }
    
    public void setAccelSet(AccelerationSet4Way accelSet)
    {
	mComponents[11] = accelSet;
    }
    
    
    // Methods for field "brakes"
    public BrakeSystemStatus getBrakes()
    {
	return (BrakeSystemStatus)mComponents[12];
    }
    
    public void setBrakes(BrakeSystemStatus brakes)
    {
	mComponents[12] = brakes;
    }
    
    
    // Methods for field "size"
    public VehicleSize getSize()
    {
	return (VehicleSize)mComponents[13];
    }
    
    public void setSize(VehicleSize size)
    {
	mComponents[13] = size;
    }
    
    
    /**
     * Initialize the type descriptor.
     */
    private static final SequenceInfo c_typeinfo = new SequenceInfo (
	new Tags (
	    new short[] {
		0x0010
	    }
	),
	new QName (
	    "dsrc.dsrc",
	    "BSMcoreData"
	),
	new QName (
	    "DSRC",
	    "BSMcoreData"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MsgCount"
			    ),
			    new QName (
				"DSRC",
				"MsgCount"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MsgCount(0), 
				    new MsgCount(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "msgCnt",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TemporaryID"
			    ),
			    new QName (
				"DSRC",
				"TemporaryID"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(4)
				)
			    ),
			    new Bounds (
				Long.valueOf(4),
				Long.valueOf(4)
			    )
			)
		    ),
		    "id",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DSecond"
			    ),
			    new QName (
				"DSRC",
				"DSecond"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DSecond(0), 
				    new DSecond(65535),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(65535)
			    ),
			    null
			)
		    ),
		    "secMark",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Latitude"
			    ),
			    new QName (
				"DSRC",
				"Latitude"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Latitude(-900000000), 
				    new Latitude(900000001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-900000000),
				Long.valueOf(900000001)
			    ),
			    null
			)
		    ),
		    "lat",
		    3,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Longitude"
			    ),
			    new QName (
				"DSRC",
				"Longitude"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Longitude(-1799999999), 
				    new Longitude(1800000001),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-1799999999),
				Long.valueOf(1800000001)
			    ),
			    null
			)
		    ),
		    "long",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Elevation"
			    ),
			    new QName (
				"DSRC",
				"Elevation"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Elevation(-4096), 
				    new Elevation(61439),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-4096),
				Long.valueOf(61439)
			    ),
			    null
			)
		    ),
		    "elev",
		    5,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PositionalAccuracy"
			    ),
			    new QName (
				"DSRC",
				"PositionalAccuracy"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PositionalAccuracy"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PositionalAccuracy"
				)
			    ),
			    0
			)
		    ),
		    "accuracy",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TransmissionState"
			    ),
			    new QName (
				"DSRC",
				"TransmissionState"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"neutral",
					0
				    ),
				    new MemberListElement (
					"park",
					1
				    ),
				    new MemberListElement (
					"forwardGears",
					2
				    ),
				    new MemberListElement (
					"reverseGears",
					3
				    ),
				    new MemberListElement (
					"reserved1",
					4
				    ),
				    new MemberListElement (
					"reserved2",
					5
				    ),
				    new MemberListElement (
					"reserved3",
					6
				    ),
				    new MemberListElement (
					"unavailable",
					7
				    )
				}
			    ),
			    0,
			    TransmissionState.neutral
			)
		    ),
		    "transmission",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Speed"
			    ),
			    new QName (
				"DSRC",
				"Speed"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Speed(0), 
				    new Speed(8191),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(8191)
			    ),
			    null
			)
		    ),
		    "speed",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Heading"
			    ),
			    new QName (
				"DSRC",
				"Heading"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Heading(0), 
				    new Heading(28800),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(28800)
			    ),
			    null
			)
		    ),
		    "heading",
		    9,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x800a
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SteeringWheelAngle"
			    ),
			    new QName (
				"DSRC",
				"SteeringWheelAngle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SteeringWheelAngle(-126), 
				    new SteeringWheelAngle(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-126),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "angle",
		    10,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800b
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AccelerationSet4Way"
			    ),
			    new QName (
				"DSRC",
				"AccelerationSet4Way"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "AccelerationSet4Way"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "AccelerationSet4Way"
				)
			    ),
			    0
			)
		    ),
		    "accelSet",
		    11,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800c
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"BrakeSystemStatus"
			    ),
			    new QName (
				"DSRC",
				"BrakeSystemStatus"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "BrakeSystemStatus"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "BrakeSystemStatus"
				)
			    ),
			    0
			)
		    ),
		    "brakes",
		    12,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x800d
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleSize"
			    ),
			    new QName (
				"DSRC",
				"VehicleSize"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleSize"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleSize"
				)
			    ),
			    0
			)
		    ),
		    "size",
		    13,
		    2,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800b, 11)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800c, 12)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800d, 13)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' BSMcoreData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' BSMcoreData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for BSMcoreData
