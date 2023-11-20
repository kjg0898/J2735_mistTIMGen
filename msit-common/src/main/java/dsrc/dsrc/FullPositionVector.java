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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type FullPositionVector from ASN1 Module DSRC.
 * @see Sequence
 */

public class FullPositionVector extends Sequence {
    
    /**
     * The default constructor.
     */
    public FullPositionVector()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public FullPositionVector(DDateTime utcTime, Longitude _long, 
		    Latitude lat, Elevation elevation, Heading heading, 
		    TransmissionAndSpeed speed, 
		    PositionalAccuracy posAccuracy, 
		    TimeConfidence timeConfidence, 
		    PositionConfidenceSet posConfidence, 
		    SpeedandHeadingandThrottleConfidence speedConfidence)
    {
	setUtcTime(utcTime);
	set_long(_long);
	setLat(lat);
	setElevation(elevation);
	setHeading(heading);
	setSpeed(speed);
	setPosAccuracy(posAccuracy);
	setTimeConfidence(timeConfidence);
	setPosConfidence(posConfidence);
	setSpeedConfidence(speedConfidence);
    }
    
    /**
     * Construct with required components.
     */
    public FullPositionVector(Longitude _long, Latitude lat)
    {
	set_long(_long);
	setLat(lat);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DDateTime();
	mComponents[1] = new Longitude();
	mComponents[2] = new Latitude();
	mComponents[3] = new Elevation();
	mComponents[4] = new Heading();
	mComponents[5] = new TransmissionAndSpeed();
	mComponents[6] = new PositionalAccuracy();
	mComponents[7] = TimeConfidence.unavailable;
	mComponents[8] = new PositionConfidenceSet();
	mComponents[9] = new SpeedandHeadingandThrottleConfidence();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[10];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new DDateTime();
	    case 1:
		return new Longitude();
	    case 2:
		return new Latitude();
	    case 3:
		return new Elevation();
	    case 4:
		return new Heading();
	    case 5:
		return new TransmissionAndSpeed();
	    case 6:
		return new PositionalAccuracy();
	    case 7:
		return TimeConfidence.unavailable;
	    case 8:
		return new PositionConfidenceSet();
	    case 9:
		return new SpeedandHeadingandThrottleConfidence();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "utcTime"
    public DDateTime getUtcTime()
    {
	return (DDateTime)mComponents[0];
    }
    
    public void setUtcTime(DDateTime utcTime)
    {
	mComponents[0] = utcTime;
    }
    
    public boolean hasUtcTime()
    {
	return componentIsPresent(0);
    }
    
    public void deleteUtcTime()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "_long"
    public Longitude get_long()
    {
	return (Longitude)mComponents[1];
    }
    
    public void set_long(Longitude _long)
    {
	mComponents[1] = _long;
    }
    
    
    // Methods for field "lat"
    public Latitude getLat()
    {
	return (Latitude)mComponents[2];
    }
    
    public void setLat(Latitude lat)
    {
	mComponents[2] = lat;
    }
    
    
    // Methods for field "elevation"
    public Elevation getElevation()
    {
	return (Elevation)mComponents[3];
    }
    
    public void setElevation(Elevation elevation)
    {
	mComponents[3] = elevation;
    }
    
    public boolean hasElevation()
    {
	return componentIsPresent(3);
    }
    
    public void deleteElevation()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "heading"
    public Heading getHeading()
    {
	return (Heading)mComponents[4];
    }
    
    public void setHeading(Heading heading)
    {
	mComponents[4] = heading;
    }
    
    public boolean hasHeading()
    {
	return componentIsPresent(4);
    }
    
    public void deleteHeading()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "speed"
    public TransmissionAndSpeed getSpeed()
    {
	return (TransmissionAndSpeed)mComponents[5];
    }
    
    public void setSpeed(TransmissionAndSpeed speed)
    {
	mComponents[5] = speed;
    }
    
    public boolean hasSpeed()
    {
	return componentIsPresent(5);
    }
    
    public void deleteSpeed()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "posAccuracy"
    public PositionalAccuracy getPosAccuracy()
    {
	return (PositionalAccuracy)mComponents[6];
    }
    
    public void setPosAccuracy(PositionalAccuracy posAccuracy)
    {
	mComponents[6] = posAccuracy;
    }
    
    public boolean hasPosAccuracy()
    {
	return componentIsPresent(6);
    }
    
    public void deletePosAccuracy()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "timeConfidence"
    public TimeConfidence getTimeConfidence()
    {
	return (TimeConfidence)mComponents[7];
    }
    
    public void setTimeConfidence(TimeConfidence timeConfidence)
    {
	mComponents[7] = timeConfidence;
    }
    
    public boolean hasTimeConfidence()
    {
	return componentIsPresent(7);
    }
    
    public void deleteTimeConfidence()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "posConfidence"
    public PositionConfidenceSet getPosConfidence()
    {
	return (PositionConfidenceSet)mComponents[8];
    }
    
    public void setPosConfidence(PositionConfidenceSet posConfidence)
    {
	mComponents[8] = posConfidence;
    }
    
    public boolean hasPosConfidence()
    {
	return componentIsPresent(8);
    }
    
    public void deletePosConfidence()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "speedConfidence"
    public SpeedandHeadingandThrottleConfidence getSpeedConfidence()
    {
	return (SpeedandHeadingandThrottleConfidence)mComponents[9];
    }
    
    public void setSpeedConfidence(SpeedandHeadingandThrottleConfidence speedConfidence)
    {
	mComponents[9] = speedConfidence;
    }
    
    public boolean hasSpeedConfidence()
    {
	return componentIsPresent(9);
    }
    
    public void deleteSpeedConfidence()
    {
	setComponentAbsent(9);
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
	    "FullPositionVector"
	),
	new QName (
	    "DSRC",
	    "FullPositionVector"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DDateTime"
			    ),
			    new QName (
				"DSRC",
				"DDateTime"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "DDateTime"
				)
			    ),
			    0
			)
		    ),
		    "utcTime",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    "elevation",
		    3,
		    3,
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
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"TransmissionAndSpeed"
			    ),
			    new QName (
				"DSRC",
				"TransmissionAndSpeed"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "TransmissionAndSpeed"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "TransmissionAndSpeed"
				)
			    ),
			    0
			)
		    ),
		    "speed",
		    5,
		    3,
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
		    "posAccuracy",
		    6,
		    3,
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
			    TimeConfidence.unavailable
			)
		    ),
		    "timeConfidence",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PositionConfidenceSet"
			    ),
			    new QName (
				"DSRC",
				"PositionConfidenceSet"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PositionConfidenceSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PositionConfidenceSet"
				)
			    ),
			    0
			)
		    ),
		    "posConfidence",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SpeedandHeadingandThrottleConfidence"
			    ),
			    new QName (
				"DSRC",
				"SpeedandHeadingandThrottleConfidence"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "SpeedandHeadingandThrottleConfidence"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "SpeedandHeadingandThrottleConfidence"
				)
			    ),
			    0
			)
		    ),
		    "speedConfidence",
		    9,
		    3,
		    null
		)
	    }
	),
	0,
	new TagDecoders (
	    new TagDecoder[] {
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' FullPositionVector object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' FullPositionVector object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for FullPositionVector
