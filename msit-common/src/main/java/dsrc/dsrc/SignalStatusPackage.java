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

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type SignalStatusPackage from ASN1 Module DSRC.
 * @see Sequence
 */

public class SignalStatusPackage extends Sequence {
    
    /**
     * The default constructor.
     */
    public SignalStatusPackage()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public SignalStatusPackage(SignalRequesterInfo requester, 
		    IntersectionAccessPoint inboundOn, 
		    IntersectionAccessPoint outboundOn, 
		    MinuteOfTheYear minute, DSecond second, DSecond duration, 
		    PrioritizationResponseStatus status, Regional regional)
    {
	setRequester(requester);
	setInboundOn(inboundOn);
	setOutboundOn(outboundOn);
	setMinute(minute);
	setSecond(second);
	setDuration(duration);
	setStatus(status);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public SignalStatusPackage(IntersectionAccessPoint inboundOn, 
		    PrioritizationResponseStatus status)
    {
	setInboundOn(inboundOn);
	setStatus(status);
    }
    
    public void initComponents()
    {
	mComponents[0] = new SignalRequesterInfo();
	mComponents[1] = new IntersectionAccessPoint();
	mComponents[2] = new IntersectionAccessPoint();
	mComponents[3] = new MinuteOfTheYear();
	mComponents[4] = new DSecond();
	mComponents[5] = new DSecond();
	mComponents[6] = PrioritizationResponseStatus.unknown;
	mComponents[7] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[8];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new SignalRequesterInfo();
	    case 1:
		return new IntersectionAccessPoint();
	    case 2:
		return new IntersectionAccessPoint();
	    case 3:
		return new MinuteOfTheYear();
	    case 4:
		return new DSecond();
	    case 5:
		return new DSecond();
	    case 6:
		return PrioritizationResponseStatus.unknown;
	    case 7:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "requester"
    public SignalRequesterInfo getRequester()
    {
	return (SignalRequesterInfo)mComponents[0];
    }
    
    public void setRequester(SignalRequesterInfo requester)
    {
	mComponents[0] = requester;
    }
    
    public boolean hasRequester()
    {
	return componentIsPresent(0);
    }
    
    public void deleteRequester()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "inboundOn"
    public IntersectionAccessPoint getInboundOn()
    {
	return (IntersectionAccessPoint)mComponents[1];
    }
    
    public void setInboundOn(IntersectionAccessPoint inboundOn)
    {
	mComponents[1] = inboundOn;
    }
    
    
    // Methods for field "outboundOn"
    public IntersectionAccessPoint getOutboundOn()
    {
	return (IntersectionAccessPoint)mComponents[2];
    }
    
    public void setOutboundOn(IntersectionAccessPoint outboundOn)
    {
	mComponents[2] = outboundOn;
    }
    
    public boolean hasOutboundOn()
    {
	return componentIsPresent(2);
    }
    
    public void deleteOutboundOn()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "minute"
    public MinuteOfTheYear getMinute()
    {
	return (MinuteOfTheYear)mComponents[3];
    }
    
    public void setMinute(MinuteOfTheYear minute)
    {
	mComponents[3] = minute;
    }
    
    public boolean hasMinute()
    {
	return componentIsPresent(3);
    }
    
    public void deleteMinute()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "second"
    public DSecond getSecond()
    {
	return (DSecond)mComponents[4];
    }
    
    public void setSecond(DSecond second)
    {
	mComponents[4] = second;
    }
    
    public boolean hasSecond()
    {
	return componentIsPresent(4);
    }
    
    public void deleteSecond()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "duration"
    public DSecond getDuration()
    {
	return (DSecond)mComponents[5];
    }
    
    public void setDuration(DSecond duration)
    {
	mComponents[5] = duration;
    }
    
    public boolean hasDuration()
    {
	return componentIsPresent(5);
    }
    
    public void deleteDuration()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "status"
    public PrioritizationResponseStatus getStatus()
    {
	return (PrioritizationResponseStatus)mComponents[6];
    }
    
    public void setStatus(PrioritizationResponseStatus status)
    {
	mComponents[6] = status;
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[7];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[7] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(7);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type Regional from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Regional extends SequenceOf<Regional.Sequence_> {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Regional(Sequence_[] elements)
	{
	    super(elements);
	}
	
	
	/**
	 * Define the ASN1 Type Sequence_ from ASN1 Module DSRC.
	 * @see Sequence
	 */
	public static class Sequence_ extends Sequence {
	    
	    /**
	     * The default constructor.
	     */
	    public Sequence_()
	    {
	    }
	    
	    /**
	     * Construct with AbstractData components.
	     */
	    public Sequence_(RegionId regionId, OpenType regExtValue)
	    {
		setRegionId(regionId);
		setRegExtValue(regExtValue);
	    }
	    
	    public void initComponents()
	    {
		mComponents[0] = new RegionId();
		mComponents[1] = new OpenType();
	    }
	    
	    // Instance initializer
	    {
		mComponents = new AbstractData[2];
	    }
	    
	    // Method to create a specific component instance
	    public AbstractData createInstance(int index)
	    {
		switch (index) {
		    case 0:
			return new RegionId();
		    case 1:
			return new OpenType();
		    default:
			throw new InternalError("AbstractCollection.createInstance()");
		}
		
	    }
	    
	    
	    // Methods for field "regionId"
	    public RegionId getRegionId()
	    {
		return (RegionId)mComponents[0];
	    }
	    
	    public void setRegionId(RegionId regionId)
	    {
		mComponents[0] = regionId;
	    }
	    
	    
	    // Methods for field "regExtValue"
	    public OpenType getRegExtValue()
	    {
		return (OpenType)mComponents[1];
	    }
	    
	    public void setRegExtValue(OpenType regExtValue)
	    {
		mComponents[1] = regExtValue;
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
		    "SignalStatusPackage$Regional$Sequence_"
		),
		new QName (
		    "builtin",
		    "SEQUENCE"
		),
		274962,
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
					"RegionId"
				    ),
				    new QName (
					"DSRC",
					"RegionId"
				    ),
				    274450,
				    new Intersection (
					new ValueRangeConstraint (
					    new AbstractBounds(
						new RegionId(0), 
						new RegionId(255),
						0
					    )
					),
					new TableConstraint (
					    dsrc.region.REGION.reg_SignalStatusPackage,
					    0
					)
				    ),
				    new Bounds (
					Long.valueOf(0),
					Long.valueOf(255)
				    ),
				    null
				)
			    ),
			    "regionId",
			    0,
			    274,
			    null
			),
			new SequenceFieldInfo (
			    new TypeInfoRef (
				new OpenTypeInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"com.oss.asn1",
					"OpenType"
				    ),
				    new QName (
					"builtin",
					"OpenType"
				    ),
				    1323026,
				    new ComponentRelationConstraint (
					new TableConstraint (
					    dsrc.region.REGION.reg_SignalStatusPackage,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "SignalStatusPackage$Regional$Sequence_"
							),
							0
						    ),
						    0
						)
					    }
					)
				    ),
				    new ComponentRelationConstraint (
					new TableConstraint (
					    dsrc.region.REGION.reg_SignalStatusPackage,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "SignalStatusPackage$Regional$Sequence_"
							),
							0
						    ),
						    0
						)
					    }
					)
				    )
				)
			    ),
			    "regExtValue",
			    1,
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
			)
		    }
		),
		0
	    );
	    
	    /**
	     * Get the type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Sequence_ object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Sequence_

	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new Sequence_();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8007
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"SignalStatusPackage$Regional"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE OF"
	    ),
	    274450,
	    new SizeConstraint (
		new ValueRangeConstraint (
		    new AbstractBounds(
			new INTEGER(1),
			new INTEGER(4),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(4)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.dsrc",
		    "SignalStatusPackage$Regional$Sequence_"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Regional object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Regional

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
	    "SignalStatusPackage"
	),
	new QName (
	    "DSRC",
	    "SignalStatusPackage"
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
				"SignalRequesterInfo"
			    ),
			    new QName (
				"DSRC",
				"SignalRequesterInfo"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "SignalRequesterInfo"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "SignalRequesterInfo"
				)
			    ),
			    0
			)
		    ),
		    "requester",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"IntersectionAccessPoint"
			    ),
			    new QName (
				"DSRC",
				"IntersectionAccessPoint"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionAccessPoint"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "inboundOn",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"IntersectionAccessPoint"
			    ),
			    new QName (
				"DSRC",
				"IntersectionAccessPoint"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionAccessPoint"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2)
				}
			    )
			)
		    ),
		    "outboundOn",
		    2,
		    3,
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
				"MinuteOfTheYear"
			    ),
			    new QName (
				"DSRC",
				"MinuteOfTheYear"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MinuteOfTheYear(0), 
				    new MinuteOfTheYear(527040),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(527040)
			    ),
			    null
			)
		    ),
		    "minute",
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
		    "second",
		    4,
		    3,
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
		    "duration",
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
				"PrioritizationResponseStatus"
			    ),
			    new QName (
				"DSRC",
				"PrioritizationResponseStatus"
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
					"requested",
					1
				    ),
				    new MemberListElement (
					"processing",
					2
				    ),
				    new MemberListElement (
					"watchOtherTraffic",
					3
				    ),
				    new MemberListElement (
					"granted",
					4
				    ),
				    new MemberListElement (
					"rejected",
					5
				    ),
				    new MemberListElement (
					"maxPresence",
					6
				    ),
				    new MemberListElement (
					"reserviceLocked",
					7
				    )
				}
			    ),
			    0,
			    PrioritizationResponseStatus.unknown
			)
		    ),
		    "status",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "SignalStatusPackage$Regional"
			)
		    ),
		    "regional",
		    7,
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
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' SignalStatusPackage object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' SignalStatusPackage object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for SignalStatusPackage
