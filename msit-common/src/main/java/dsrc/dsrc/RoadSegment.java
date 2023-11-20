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
 * Define the ASN1 Type RoadSegment from ASN1 Module DSRC.
 * @see Sequence
 */

public class RoadSegment extends Sequence {
    
    /**
     * The default constructor.
     */
    public RoadSegment()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RoadSegment(DescriptiveName name, RoadSegmentReferenceID id, 
		    MsgCount revision, Position3D refPoint, 
		    LaneWidth laneWidth, SpeedLimitList speedLimits, 
		    RoadLaneSetList roadLaneSet, Regional regional)
    {
	setName(name);
	setId(id);
	setRevision(revision);
	setRefPoint(refPoint);
	setLaneWidth(laneWidth);
	setSpeedLimits(speedLimits);
	setRoadLaneSet(roadLaneSet);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public RoadSegment(RoadSegmentReferenceID id, MsgCount revision, 
		    Position3D refPoint, RoadLaneSetList roadLaneSet)
    {
	setId(id);
	setRevision(revision);
	setRefPoint(refPoint);
	setRoadLaneSet(roadLaneSet);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DescriptiveName();
	mComponents[1] = new RoadSegmentReferenceID();
	mComponents[2] = new MsgCount();
	mComponents[3] = new Position3D();
	mComponents[4] = new LaneWidth();
	mComponents[5] = new SpeedLimitList();
	mComponents[6] = new RoadLaneSetList();
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
		return new DescriptiveName();
	    case 1:
		return new RoadSegmentReferenceID();
	    case 2:
		return new MsgCount();
	    case 3:
		return new Position3D();
	    case 4:
		return new LaneWidth();
	    case 5:
		return new SpeedLimitList();
	    case 6:
		return new RoadLaneSetList();
	    case 7:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "name"
    public DescriptiveName getName()
    {
	return (DescriptiveName)mComponents[0];
    }
    
    public void setName(DescriptiveName name)
    {
	mComponents[0] = name;
    }
    
    public boolean hasName()
    {
	return componentIsPresent(0);
    }
    
    public void deleteName()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "id"
    public RoadSegmentReferenceID getId()
    {
	return (RoadSegmentReferenceID)mComponents[1];
    }
    
    public void setId(RoadSegmentReferenceID id)
    {
	mComponents[1] = id;
    }
    
    
    // Methods for field "revision"
    public MsgCount getRevision()
    {
	return (MsgCount)mComponents[2];
    }
    
    public void setRevision(MsgCount revision)
    {
	mComponents[2] = revision;
    }
    
    
    // Methods for field "refPoint"
    public Position3D getRefPoint()
    {
	return (Position3D)mComponents[3];
    }
    
    public void setRefPoint(Position3D refPoint)
    {
	mComponents[3] = refPoint;
    }
    
    
    // Methods for field "laneWidth"
    public LaneWidth getLaneWidth()
    {
	return (LaneWidth)mComponents[4];
    }
    
    public void setLaneWidth(LaneWidth laneWidth)
    {
	mComponents[4] = laneWidth;
    }
    
    public boolean hasLaneWidth()
    {
	return componentIsPresent(4);
    }
    
    public void deleteLaneWidth()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "speedLimits"
    public SpeedLimitList getSpeedLimits()
    {
	return (SpeedLimitList)mComponents[5];
    }
    
    public void setSpeedLimits(SpeedLimitList speedLimits)
    {
	mComponents[5] = speedLimits;
    }
    
    public boolean hasSpeedLimits()
    {
	return componentIsPresent(5);
    }
    
    public void deleteSpeedLimits()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "roadLaneSet"
    public RoadLaneSetList getRoadLaneSet()
    {
	return (RoadLaneSetList)mComponents[6];
    }
    
    public void setRoadLaneSet(RoadLaneSetList roadLaneSet)
    {
	mComponents[6] = roadLaneSet;
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
		    "RoadSegment$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_RoadSegment,
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
					    dsrc.region.REGION.reg_RoadSegment,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "RoadSegment$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_RoadSegment,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "RoadSegment$Regional$Sequence_"
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
		"RoadSegment$Regional"
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
		    "RoadSegment$Regional$Sequence_"
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
	    "RoadSegment"
	),
	new QName (
	    "DSRC",
	    "RoadSegment"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DescriptiveName"
			    ),
			    new QName (
				"DSRC",
				"DescriptiveName"
			    ),
			    274450,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(63),
					    0
					)
				    )
				),
				new PermittedAlphabetConstraint (
				    IA5StringPAInfo.pa
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(63)
			    ),
			    IA5StringPAInfo.paInfo
			)
		    ),
		    "name",
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
				"RoadSegmentReferenceID"
			    ),
			    new QName (
				"DSRC",
				"RoadSegmentReferenceID"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "RoadSegmentReferenceID"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "RoadSegmentReferenceID"
				)
			    ),
			    0
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
		    "revision",
		    2,
		    2,
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
				"Position3D"
			    ),
			    new QName (
				"DSRC",
				"Position3D"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0
			)
		    ),
		    "refPoint",
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
				"LaneWidth"
			    ),
			    new QName (
				"DSRC",
				"LaneWidth"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneWidth(0), 
				    new LaneWidth(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "laneWidth",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SpeedLimitList"
			    ),
			    new QName (
				"DSRC",
				"SpeedLimitList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(9),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(9)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "RegulatorySpeedLimit"
				)
			    )
			)
		    ),
		    "speedLimits",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RoadLaneSetList"
			    ),
			    new QName (
				"DSRC",
				"RoadLaneSetList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(255),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(255)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "GenericLane"
				)
			    )
			)
		    ),
		    "roadLaneSet",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "RoadSegment$Regional"
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
     * Get the type descriptor (TypeInfo) of 'this' RoadSegment object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RoadSegment object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RoadSegment
