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
 * Define the ASN1 Type MapData from ASN1 Module DSRC.
 * @see Sequence
 */

public class MapData extends Sequence {
    
    /**
     * The default constructor.
     */
    public MapData()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MapData(MinuteOfTheYear timeStamp, MsgCount msgIssueRevision, 
		    LayerType layerType, LayerID layerID, 
		    IntersectionGeometryList intersections, 
		    RoadSegmentList roadSegments, 
		    DataParameters dataParameters, 
		    RestrictionClassList restrictionList, Regional regional)
    {
	setTimeStamp(timeStamp);
	setMsgIssueRevision(msgIssueRevision);
	setLayerType(layerType);
	setLayerID(layerID);
	setIntersections(intersections);
	setRoadSegments(roadSegments);
	setDataParameters(dataParameters);
	setRestrictionList(restrictionList);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public MapData(MsgCount msgIssueRevision)
    {
	setMsgIssueRevision(msgIssueRevision);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MinuteOfTheYear();
	mComponents[1] = new MsgCount();
	mComponents[2] = LayerType.none;
	mComponents[3] = new LayerID();
	mComponents[4] = new IntersectionGeometryList();
	mComponents[5] = new RoadSegmentList();
	mComponents[6] = new DataParameters();
	mComponents[7] = new RestrictionClassList();
	mComponents[8] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[9];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MinuteOfTheYear();
	    case 1:
		return new MsgCount();
	    case 2:
		return LayerType.none;
	    case 3:
		return new LayerID();
	    case 4:
		return new IntersectionGeometryList();
	    case 5:
		return new RoadSegmentList();
	    case 6:
		return new DataParameters();
	    case 7:
		return new RestrictionClassList();
	    case 8:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "timeStamp"
    public MinuteOfTheYear getTimeStamp()
    {
	return (MinuteOfTheYear)mComponents[0];
    }
    
    public void setTimeStamp(MinuteOfTheYear timeStamp)
    {
	mComponents[0] = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTimeStamp()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "msgIssueRevision"
    public MsgCount getMsgIssueRevision()
    {
	return (MsgCount)mComponents[1];
    }
    
    public void setMsgIssueRevision(MsgCount msgIssueRevision)
    {
	mComponents[1] = msgIssueRevision;
    }
    
    
    // Methods for field "layerType"
    public LayerType getLayerType()
    {
	return (LayerType)mComponents[2];
    }
    
    public void setLayerType(LayerType layerType)
    {
	mComponents[2] = layerType;
    }
    
    public boolean hasLayerType()
    {
	return componentIsPresent(2);
    }
    
    public void deleteLayerType()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "layerID"
    public LayerID getLayerID()
    {
	return (LayerID)mComponents[3];
    }
    
    public void setLayerID(LayerID layerID)
    {
	mComponents[3] = layerID;
    }
    
    public boolean hasLayerID()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLayerID()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "intersections"
    public IntersectionGeometryList getIntersections()
    {
	return (IntersectionGeometryList)mComponents[4];
    }
    
    public void setIntersections(IntersectionGeometryList intersections)
    {
	mComponents[4] = intersections;
    }
    
    public boolean hasIntersections()
    {
	return componentIsPresent(4);
    }
    
    public void deleteIntersections()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "roadSegments"
    public RoadSegmentList getRoadSegments()
    {
	return (RoadSegmentList)mComponents[5];
    }
    
    public void setRoadSegments(RoadSegmentList roadSegments)
    {
	mComponents[5] = roadSegments;
    }
    
    public boolean hasRoadSegments()
    {
	return componentIsPresent(5);
    }
    
    public void deleteRoadSegments()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "dataParameters"
    public DataParameters getDataParameters()
    {
	return (DataParameters)mComponents[6];
    }
    
    public void setDataParameters(DataParameters dataParameters)
    {
	mComponents[6] = dataParameters;
    }
    
    public boolean hasDataParameters()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDataParameters()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "restrictionList"
    public RestrictionClassList getRestrictionList()
    {
	return (RestrictionClassList)mComponents[7];
    }
    
    public void setRestrictionList(RestrictionClassList restrictionList)
    {
	mComponents[7] = restrictionList;
    }
    
    public boolean hasRestrictionList()
    {
	return componentIsPresent(7);
    }
    
    public void deleteRestrictionList()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[8];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[8] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(8);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(8);
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
		    "MapData$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_MapData,
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
					    dsrc.region.REGION.reg_MapData,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "MapData$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_MapData,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "MapData$Regional$Sequence_"
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
		    (short)0x8008
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"MapData$Regional"
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
		    "MapData$Regional$Sequence_"
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
	    "MapData"
	),
	new QName (
	    "DSRC",
	    "MapData"
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
		    "timeStamp",
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
		    "msgIssueRevision",
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
				"LayerType"
			    ),
			    new QName (
				"DSRC",
				"LayerType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"none",
					0
				    ),
				    new MemberListElement (
					"mixedContent",
					1
				    ),
				    new MemberListElement (
					"generalMapData",
					2
				    ),
				    new MemberListElement (
					"intersectionData",
					3
				    ),
				    new MemberListElement (
					"curveData",
					4
				    ),
				    new MemberListElement (
					"roadwaySectionData",
					5
				    ),
				    new MemberListElement (
					"parkingAreaData",
					6
				    ),
				    new MemberListElement (
					"sharedLaneData",
					7
				    )
				}
			    ),
			    0,
			    LayerType.none
			)
		    ),
		    "layerType",
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
				"LayerID"
			    ),
			    new QName (
				"DSRC",
				"LayerID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LayerID(0), 
				    new LayerID(100),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(100)
			    ),
			    null
			)
		    ),
		    "layerID",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"IntersectionGeometryList"
			    ),
			    new QName (
				"DSRC",
				"IntersectionGeometryList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionGeometry"
				)
			    )
			)
		    ),
		    "intersections",
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
				"RoadSegmentList"
			    ),
			    new QName (
				"DSRC",
				"RoadSegmentList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(32),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(32)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "RoadSegment"
				)
			    )
			)
		    ),
		    "roadSegments",
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
				"DataParameters"
			    ),
			    new QName (
				"DSRC",
				"DataParameters"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "DataParameters"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "DataParameters"
				)
			    ),
			    0
			)
		    ),
		    "dataParameters",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RestrictionClassList"
			    ),
			    new QName (
				"DSRC",
				"RestrictionClassList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(254),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(254)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "RestrictionClassAssignment"
				)
			    )
			)
		    ),
		    "restrictionList",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "MapData$Regional"
			)
		    ),
		    "regional",
		    8,
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
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MapData object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MapData object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MapData
