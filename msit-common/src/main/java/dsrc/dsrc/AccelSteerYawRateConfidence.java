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
 * Define the ASN1 Type AccelSteerYawRateConfidence from ASN1 Module DSRC.
 * @see Sequence
 */

public class AccelSteerYawRateConfidence extends Sequence {
    
    /**
     * The default constructor.
     */
    public AccelSteerYawRateConfidence()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public AccelSteerYawRateConfidence(YawRateConfidence yawRate, 
		    AccelerationConfidence acceleration, 
		    SteeringWheelAngleConfidence steeringWheelAngle)
    {
	setYawRate(yawRate);
	setAcceleration(acceleration);
	setSteeringWheelAngle(steeringWheelAngle);
    }
    
    public void initComponents()
    {
	mComponents[0] = YawRateConfidence.unavailable;
	mComponents[1] = AccelerationConfidence.unavailable;
	mComponents[2] = SteeringWheelAngleConfidence.unavailable;
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return YawRateConfidence.unavailable;
	    case 1:
		return AccelerationConfidence.unavailable;
	    case 2:
		return SteeringWheelAngleConfidence.unavailable;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "yawRate"
    public YawRateConfidence getYawRate()
    {
	return (YawRateConfidence)mComponents[0];
    }
    
    public void setYawRate(YawRateConfidence yawRate)
    {
	mComponents[0] = yawRate;
    }
    
    
    // Methods for field "acceleration"
    public AccelerationConfidence getAcceleration()
    {
	return (AccelerationConfidence)mComponents[1];
    }
    
    public void setAcceleration(AccelerationConfidence acceleration)
    {
	mComponents[1] = acceleration;
    }
    
    
    // Methods for field "steeringWheelAngle"
    public SteeringWheelAngleConfidence getSteeringWheelAngle()
    {
	return (SteeringWheelAngleConfidence)mComponents[2];
    }
    
    public void setSteeringWheelAngle(SteeringWheelAngleConfidence steeringWheelAngle)
    {
	mComponents[2] = steeringWheelAngle;
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
	    "AccelSteerYawRateConfidence"
	),
	new QName (
	    "DSRC",
	    "AccelSteerYawRateConfidence"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"YawRateConfidence"
			    ),
			    new QName (
				"DSRC",
				"YawRateConfidence"
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
					"degSec-100-00",
					1
				    ),
				    new MemberListElement (
					"degSec-010-00",
					2
				    ),
				    new MemberListElement (
					"degSec-005-00",
					3
				    ),
				    new MemberListElement (
					"degSec-001-00",
					4
				    ),
				    new MemberListElement (
					"degSec-000-10",
					5
				    ),
				    new MemberListElement (
					"degSec-000-05",
					6
				    ),
				    new MemberListElement (
					"degSec-000-01",
					7
				    )
				}
			    ),
			    0,
			    YawRateConfidence.unavailable
			)
		    ),
		    "yawRate",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AccelerationConfidence"
			    ),
			    new QName (
				"DSRC",
				"AccelerationConfidence"
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
					"accl-100-00",
					1
				    ),
				    new MemberListElement (
					"accl-010-00",
					2
				    ),
				    new MemberListElement (
					"accl-005-00",
					3
				    ),
				    new MemberListElement (
					"accl-001-00",
					4
				    ),
				    new MemberListElement (
					"accl-000-10",
					5
				    ),
				    new MemberListElement (
					"accl-000-05",
					6
				    ),
				    new MemberListElement (
					"accl-000-01",
					7
				    )
				}
			    ),
			    0,
			    AccelerationConfidence.unavailable
			)
		    ),
		    "acceleration",
		    1,
		    2,
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
		    "steeringWheelAngle",
		    2,
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' AccelSteerYawRateConfidence object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' AccelSteerYawRateConfidence object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for AccelSteerYawRateConfidence
