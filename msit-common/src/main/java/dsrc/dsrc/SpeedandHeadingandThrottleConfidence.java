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
 * Define the ASN1 Type SpeedandHeadingandThrottleConfidence from ASN1 Module DSRC.
 * @see Sequence
 */

public class SpeedandHeadingandThrottleConfidence extends Sequence {
    
    /**
     * The default constructor.
     */
    public SpeedandHeadingandThrottleConfidence()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SpeedandHeadingandThrottleConfidence(HeadingConfidence heading, 
		    SpeedConfidence speed, ThrottleConfidence throttle)
    {
	setHeading(heading);
	setSpeed(speed);
	setThrottle(throttle);
    }
    
    public void initComponents()
    {
	mComponents[0] = HeadingConfidence.unavailable;
	mComponents[1] = SpeedConfidence.unavailable;
	mComponents[2] = ThrottleConfidence.unavailable;
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
		return HeadingConfidence.unavailable;
	    case 1:
		return SpeedConfidence.unavailable;
	    case 2:
		return ThrottleConfidence.unavailable;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "heading"
    public HeadingConfidence getHeading()
    {
	return (HeadingConfidence)mComponents[0];
    }
    
    public void setHeading(HeadingConfidence heading)
    {
	mComponents[0] = heading;
    }
    
    
    // Methods for field "speed"
    public SpeedConfidence getSpeed()
    {
	return (SpeedConfidence)mComponents[1];
    }
    
    public void setSpeed(SpeedConfidence speed)
    {
	mComponents[1] = speed;
    }
    
    
    // Methods for field "throttle"
    public ThrottleConfidence getThrottle()
    {
	return (ThrottleConfidence)mComponents[2];
    }
    
    public void setThrottle(ThrottleConfidence throttle)
    {
	mComponents[2] = throttle;
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
	    "SpeedandHeadingandThrottleConfidence"
	),
	new QName (
	    "DSRC",
	    "SpeedandHeadingandThrottleConfidence"
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
		    "heading",
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
				"SpeedConfidence"
			    ),
			    new QName (
				"DSRC",
				"SpeedConfidence"
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
					"prec100ms",
					1
				    ),
				    new MemberListElement (
					"prec10ms",
					2
				    ),
				    new MemberListElement (
					"prec5ms",
					3
				    ),
				    new MemberListElement (
					"prec1ms",
					4
				    ),
				    new MemberListElement (
					"prec0-1ms",
					5
				    ),
				    new MemberListElement (
					"prec0-05ms",
					6
				    ),
				    new MemberListElement (
					"prec0-01ms",
					7
				    )
				}
			    ),
			    0,
			    SpeedConfidence.unavailable
			)
		    ),
		    "speed",
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
		    "throttle",
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
     * Get the type descriptor (TypeInfo) of 'this' SpeedandHeadingandThrottleConfidence object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SpeedandHeadingandThrottleConfidence object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SpeedandHeadingandThrottleConfidence
