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
 * Define the ASN1 Type ConfidenceSet from ASN1 Module DSRC.
 * @see Sequence
 */

public class ConfidenceSet extends Sequence {
    
    /**
     * The default constructor.
     */
    public ConfidenceSet()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ConfidenceSet(AccelSteerYawRateConfidence accelConfidence, 
		    SpeedandHeadingandThrottleConfidence speedConfidence, 
		    TimeConfidence timeConfidence, 
		    PositionConfidenceSet posConfidence, 
		    SteeringWheelAngleConfidence steerConfidence, 
		    HeadingConfidence headingConfidence, 
		    ThrottleConfidence throttleConfidence)
    {
	setAccelConfidence(accelConfidence);
	setSpeedConfidence(speedConfidence);
	setTimeConfidence(timeConfidence);
	setPosConfidence(posConfidence);
	setSteerConfidence(steerConfidence);
	setHeadingConfidence(headingConfidence);
	setThrottleConfidence(throttleConfidence);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AccelSteerYawRateConfidence();
	mComponents[1] = new SpeedandHeadingandThrottleConfidence();
	mComponents[2] = TimeConfidence.unavailable;
	mComponents[3] = new PositionConfidenceSet();
	mComponents[4] = SteeringWheelAngleConfidence.unavailable;
	mComponents[5] = HeadingConfidence.unavailable;
	mComponents[6] = ThrottleConfidence.unavailable;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[7];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new AccelSteerYawRateConfidence();
	    case 1:
		return new SpeedandHeadingandThrottleConfidence();
	    case 2:
		return TimeConfidence.unavailable;
	    case 3:
		return new PositionConfidenceSet();
	    case 4:
		return SteeringWheelAngleConfidence.unavailable;
	    case 5:
		return HeadingConfidence.unavailable;
	    case 6:
		return ThrottleConfidence.unavailable;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "accelConfidence"
    public AccelSteerYawRateConfidence getAccelConfidence()
    {
	return (AccelSteerYawRateConfidence)mComponents[0];
    }
    
    public void setAccelConfidence(AccelSteerYawRateConfidence accelConfidence)
    {
	mComponents[0] = accelConfidence;
    }
    
    public boolean hasAccelConfidence()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAccelConfidence()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "speedConfidence"
    public SpeedandHeadingandThrottleConfidence getSpeedConfidence()
    {
	return (SpeedandHeadingandThrottleConfidence)mComponents[1];
    }
    
    public void setSpeedConfidence(SpeedandHeadingandThrottleConfidence speedConfidence)
    {
	mComponents[1] = speedConfidence;
    }
    
    public boolean hasSpeedConfidence()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSpeedConfidence()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "timeConfidence"
    public TimeConfidence getTimeConfidence()
    {
	return (TimeConfidence)mComponents[2];
    }
    
    public void setTimeConfidence(TimeConfidence timeConfidence)
    {
	mComponents[2] = timeConfidence;
    }
    
    public boolean hasTimeConfidence()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTimeConfidence()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "posConfidence"
    public PositionConfidenceSet getPosConfidence()
    {
	return (PositionConfidenceSet)mComponents[3];
    }
    
    public void setPosConfidence(PositionConfidenceSet posConfidence)
    {
	mComponents[3] = posConfidence;
    }
    
    public boolean hasPosConfidence()
    {
	return componentIsPresent(3);
    }
    
    public void deletePosConfidence()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "steerConfidence"
    public SteeringWheelAngleConfidence getSteerConfidence()
    {
	return (SteeringWheelAngleConfidence)mComponents[4];
    }
    
    public void setSteerConfidence(SteeringWheelAngleConfidence steerConfidence)
    {
	mComponents[4] = steerConfidence;
    }
    
    public boolean hasSteerConfidence()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSteerConfidence()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "headingConfidence"
    public HeadingConfidence getHeadingConfidence()
    {
	return (HeadingConfidence)mComponents[5];
    }
    
    public void setHeadingConfidence(HeadingConfidence headingConfidence)
    {
	mComponents[5] = headingConfidence;
    }
    
    public boolean hasHeadingConfidence()
    {
	return componentIsPresent(5);
    }
    
    public void deleteHeadingConfidence()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "throttleConfidence"
    public ThrottleConfidence getThrottleConfidence()
    {
	return (ThrottleConfidence)mComponents[6];
    }
    
    public void setThrottleConfidence(ThrottleConfidence throttleConfidence)
    {
	mComponents[6] = throttleConfidence;
    }
    
    public boolean hasThrottleConfidence()
    {
	return componentIsPresent(6);
    }
    
    public void deleteThrottleConfidence()
    {
	setComponentAbsent(6);
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
	    "ConfidenceSet"
	),
	new QName (
	    "DSRC",
	    "ConfidenceSet"
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
				"AccelSteerYawRateConfidence"
			    ),
			    new QName (
				"DSRC",
				"AccelSteerYawRateConfidence"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "AccelSteerYawRateConfidence"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "AccelSteerYawRateConfidence"
				)
			    ),
			    0
			)
		    ),
		    "accelConfidence",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
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
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SteeringWheelAngleConfidence"
			    ),
			    new QName (
				"DSRC",
				"SteeringWheelAngleConfidence"
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
					"prec2deg",
					1
				    ),
				    new MemberListElement (
					"prec1deg",
					2
				    ),
				    new MemberListElement (
					"prec0-02deg",
					3
				    )
				}
			    ),
			    0,
			    SteeringWheelAngleConfidence.unavailable
			)
		    ),
		    "steerConfidence",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"HeadingConfidence"
			    ),
			    new QName (
				"DSRC",
				"HeadingConfidence"
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
					"prec10deg",
					1
				    ),
				    new MemberListElement (
					"prec05deg",
					2
				    ),
				    new MemberListElement (
					"prec01deg",
					3
				    ),
				    new MemberListElement (
					"prec0-1deg",
					4
				    ),
				    new MemberListElement (
					"prec0-05deg",
					5
				    ),
				    new MemberListElement (
					"prec0-01deg",
					6
				    ),
				    new MemberListElement (
					"prec0-0125deg",
					7
				    )
				}
			    ),
			    0,
			    HeadingConfidence.unavailable
			)
		    ),
		    "headingConfidence",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ThrottleConfidence"
			    ),
			    new QName (
				"DSRC",
				"ThrottleConfidence"
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
					"prec10percent",
					1
				    ),
				    new MemberListElement (
					"prec1percent",
					2
				    ),
				    new MemberListElement (
					"prec0-5percent",
					3
				    )
				}
			    ),
			    0,
			    ThrottleConfidence.unavailable
			)
		    ),
		    "throttleConfidence",
		    6,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ConfidenceSet object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ConfidenceSet object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ConfidenceSet
