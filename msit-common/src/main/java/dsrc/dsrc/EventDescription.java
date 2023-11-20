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
 * Define the ASN1 Type EventDescription from ASN1 Module DSRC.
 * @see Sequence
 */

public class EventDescription extends Sequence {
    
    /**
     * The default constructor.
     */
    public EventDescription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EventDescription(dsrc.itis.ITIScodes typeEvent, 
		    Description description, Priority priority, 
		    HeadingSlice heading, Extent extent, Regional regional)
    {
	setTypeEvent(typeEvent);
	setDescription(description);
	setPriority(priority);
	setHeading(heading);
	setExtent(extent);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public EventDescription(dsrc.itis.ITIScodes typeEvent)
    {
	setTypeEvent(typeEvent);
    }
    
    public void initComponents()
    {
	mComponents[0] = new dsrc.itis.ITIScodes();
	mComponents[1] = new Description();
	mComponents[2] = new Priority();
	mComponents[3] = new HeadingSlice();
	mComponents[4] = Extent.useInstantlyOnly;
	mComponents[5] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[6];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new dsrc.itis.ITIScodes();
	    case 1:
		return new Description();
	    case 2:
		return new Priority();
	    case 3:
		return new HeadingSlice();
	    case 4:
		return Extent.useInstantlyOnly;
	    case 5:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "typeEvent"
    public dsrc.itis.ITIScodes getTypeEvent()
    {
	return (dsrc.itis.ITIScodes)mComponents[0];
    }
    
    public void setTypeEvent(dsrc.itis.ITIScodes typeEvent)
    {
	mComponents[0] = typeEvent;
    }
    
    
    // Methods for field "description"
    public Description getDescription()
    {
	return (Description)mComponents[1];
    }
    
    public void setDescription(Description description)
    {
	mComponents[1] = description;
    }
    
    public boolean hasDescription()
    {
	return componentIsPresent(1);
    }
    
    public void deleteDescription()
    {
	setComponentAbsent(1);
    }
    
    
    
    /**
     * Define the ASN1 Type Description from ASN1 Module DSRC.
     * @see SequenceOf
     */
    public static class Description extends SequenceOf<dsrc.itis.ITIScodes> {
	
	/**
	 * The default constructor.
	 */
	public Description()
	{
	}
	
	/**
	 * Construct from an array of components.
	 */
	public Description(dsrc.itis.ITIScodes[] elements)
	{
	    super(elements);
	}
	
	/**
	 * Create an instance of  SEQUENCE OF/SET OF.
	 */
	public AbstractData createInstance()
	{
	    return (AbstractData)new dsrc.itis.ITIScodes();
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ContainerInfo c_typeinfo = new ContainerInfo (
	    new Tags (
		new short[] {
		    (short)0x8001
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"EventDescription$Description"
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
			new INTEGER(8),
			0
		    )
		)
	    ),
	    new Bounds (
		Long.valueOf(1),
		Long.valueOf(8)
	    ),
	    new TypeInfoRef (
		new QName (
		    "dsrc.itis",
		    "ITIScodes"
		)
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Description object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Description object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Description

    // Methods for field "priority"
    public Priority getPriority()
    {
	return (Priority)mComponents[2];
    }
    
    public void setPriority(Priority priority)
    {
	mComponents[2] = priority;
    }
    
    public boolean hasPriority()
    {
	return componentIsPresent(2);
    }
    
    public void deletePriority()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "heading"
    public HeadingSlice getHeading()
    {
	return (HeadingSlice)mComponents[3];
    }
    
    public void setHeading(HeadingSlice heading)
    {
	mComponents[3] = heading;
    }
    
    public boolean hasHeading()
    {
	return componentIsPresent(3);
    }
    
    public void deleteHeading()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "extent"
    public Extent getExtent()
    {
	return (Extent)mComponents[4];
    }
    
    public void setExtent(Extent extent)
    {
	mComponents[4] = extent;
    }
    
    public boolean hasExtent()
    {
	return componentIsPresent(4);
    }
    
    public void deleteExtent()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[5];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[5] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(5);
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
		    "EventDescription$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_EventDescription,
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
					    dsrc.region.REGION.reg_EventDescription,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "EventDescription$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_EventDescription,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "EventDescription$Regional$Sequence_"
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"EventDescription$Regional"
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
		    "EventDescription$Regional$Sequence_"
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
	    "EventDescription"
	),
	new QName (
	    "DSRC",
	    "EventDescription"
	),
	274454,
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
				"dsrc.itis",
				"ITIScodes"
			    ),
			    new QName (
				"ITIS",
				"ITIScodes"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.itis.ITIScodes(0), 
				    new dsrc.itis.ITIScodes(65535),
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
		    "typeEvent",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "EventDescription$Description"
			)
		    ),
		    "description",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"Priority"
			    ),
			    new QName (
				"DSRC",
				"Priority"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(1)
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(1)
			    )
			)
		    ),
		    "priority",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"HeadingSlice"
			    ),
			    new QName (
				"DSRC",
				"HeadingSlice"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(16)
				)
			    ),
			    new Bounds (
				Long.valueOf(16),
				Long.valueOf(16)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"from000-0to022-5degrees",
					0
				    ),
				    new MemberListElement (
					"from022-5to045-0degrees",
					1
				    ),
				    new MemberListElement (
					"from045-0to067-5degrees",
					2
				    ),
				    new MemberListElement (
					"from067-5to090-0degrees",
					3
				    ),
				    new MemberListElement (
					"from090-0to112-5degrees",
					4
				    ),
				    new MemberListElement (
					"from112-5to135-0degrees",
					5
				    ),
				    new MemberListElement (
					"from135-0to157-5degrees",
					6
				    ),
				    new MemberListElement (
					"from157-5to180-0degrees",
					7
				    ),
				    new MemberListElement (
					"from180-0to202-5degrees",
					8
				    ),
				    new MemberListElement (
					"from202-5to225-0degrees",
					9
				    ),
				    new MemberListElement (
					"from225-0to247-5degrees",
					10
				    ),
				    new MemberListElement (
					"from247-5to270-0degrees",
					11
				    ),
				    new MemberListElement (
					"from270-0to292-5degrees",
					12
				    ),
				    new MemberListElement (
					"from292-5to315-0degrees",
					13
				    ),
				    new MemberListElement (
					"from315-0to337-5degrees",
					14
				    ),
				    new MemberListElement (
					"from337-5to360-0degrees",
					15
				    )
				}
			    )
			)
		    ),
		    "heading",
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
				"Extent"
			    ),
			    new QName (
				"DSRC",
				"Extent"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"useInstantlyOnly",
					0
				    ),
				    new MemberListElement (
					"useFor3meters",
					1
				    ),
				    new MemberListElement (
					"useFor10meters",
					2
				    ),
				    new MemberListElement (
					"useFor50meters",
					3
				    ),
				    new MemberListElement (
					"useFor100meters",
					4
				    ),
				    new MemberListElement (
					"useFor500meters",
					5
				    ),
				    new MemberListElement (
					"useFor1000meters",
					6
				    ),
				    new MemberListElement (
					"useFor5000meters",
					7
				    ),
				    new MemberListElement (
					"useFor10000meters",
					8
				    ),
				    new MemberListElement (
					"useFor50000meters",
					9
				    ),
				    new MemberListElement (
					"useFor100000meters",
					10
				    ),
				    new MemberListElement (
					"useFor500000meters",
					11
				    ),
				    new MemberListElement (
					"useFor1000000meters",
					12
				    ),
				    new MemberListElement (
					"useFor5000000meters",
					13
				    ),
				    new MemberListElement (
					"useFor10000000meters",
					14
				    ),
				    new MemberListElement (
					"forever",
					15
				    )
				}
			    ),
			    0,
			    Extent.useInstantlyOnly
			)
		    ),
		    "extent",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "EventDescription$Regional"
			)
		    ),
		    "regional",
		    5,
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EventDescription object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EventDescription object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EventDescription
