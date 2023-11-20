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
 * Define the ASN1 Type IntersectionCollision from ASN1 Module DSRC.
 * @see Sequence
 */

public class IntersectionCollision extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntersectionCollision()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionCollision(MsgCount msgCnt, TemporaryID id, 
		    MinuteOfTheYear timeStamp, BSMcoreData partOne, 
		    PathHistory path, PathPrediction pathPrediction, 
		    IntersectionReferenceID intersectionID, 
		    ApproachOrLane laneNumber, VehicleEventFlags eventFlag, 
		    Regional regional)
    {
	setMsgCnt(msgCnt);
	setId(id);
	setTimeStamp(timeStamp);
	setPartOne(partOne);
	setPath(path);
	setPathPrediction(pathPrediction);
	setIntersectionID(intersectionID);
	setLaneNumber(laneNumber);
	setEventFlag(eventFlag);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public IntersectionCollision(MsgCount msgCnt, TemporaryID id, 
		    IntersectionReferenceID intersectionID, 
		    ApproachOrLane laneNumber, VehicleEventFlags eventFlag)
    {
	setMsgCnt(msgCnt);
	setId(id);
	setIntersectionID(intersectionID);
	setLaneNumber(laneNumber);
	setEventFlag(eventFlag);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MsgCount();
	mComponents[1] = new TemporaryID();
	mComponents[2] = new MinuteOfTheYear();
	mComponents[3] = new BSMcoreData();
	mComponents[4] = new PathHistory();
	mComponents[5] = new PathPrediction();
	mComponents[6] = new IntersectionReferenceID();
	mComponents[7] = new ApproachOrLane();
	mComponents[8] = new VehicleEventFlags();
	mComponents[9] = new Regional();
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
		return new MsgCount();
	    case 1:
		return new TemporaryID();
	    case 2:
		return new MinuteOfTheYear();
	    case 3:
		return new BSMcoreData();
	    case 4:
		return new PathHistory();
	    case 5:
		return new PathPrediction();
	    case 6:
		return new IntersectionReferenceID();
	    case 7:
		return new ApproachOrLane();
	    case 8:
		return new VehicleEventFlags();
	    case 9:
		return new Regional();
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
    
    
    // Methods for field "timeStamp"
    public MinuteOfTheYear getTimeStamp()
    {
	return (MinuteOfTheYear)mComponents[2];
    }
    
    public void setTimeStamp(MinuteOfTheYear timeStamp)
    {
	mComponents[2] = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return componentIsPresent(2);
    }
    
    public void deleteTimeStamp()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "partOne"
    public BSMcoreData getPartOne()
    {
	return (BSMcoreData)mComponents[3];
    }
    
    public void setPartOne(BSMcoreData partOne)
    {
	mComponents[3] = partOne;
    }
    
    public boolean hasPartOne()
    {
	return componentIsPresent(3);
    }
    
    public void deletePartOne()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "path"
    public PathHistory getPath()
    {
	return (PathHistory)mComponents[4];
    }
    
    public void setPath(PathHistory path)
    {
	mComponents[4] = path;
    }
    
    public boolean hasPath()
    {
	return componentIsPresent(4);
    }
    
    public void deletePath()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "pathPrediction"
    public PathPrediction getPathPrediction()
    {
	return (PathPrediction)mComponents[5];
    }
    
    public void setPathPrediction(PathPrediction pathPrediction)
    {
	mComponents[5] = pathPrediction;
    }
    
    public boolean hasPathPrediction()
    {
	return componentIsPresent(5);
    }
    
    public void deletePathPrediction()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "intersectionID"
    public IntersectionReferenceID getIntersectionID()
    {
	return (IntersectionReferenceID)mComponents[6];
    }
    
    public void setIntersectionID(IntersectionReferenceID intersectionID)
    {
	mComponents[6] = intersectionID;
    }
    
    
    // Methods for field "laneNumber"
    public ApproachOrLane getLaneNumber()
    {
	return (ApproachOrLane)mComponents[7];
    }
    
    public void setLaneNumber(ApproachOrLane laneNumber)
    {
	mComponents[7] = laneNumber;
    }
    
    
    // Methods for field "eventFlag"
    public VehicleEventFlags getEventFlag()
    {
	return (VehicleEventFlags)mComponents[8];
    }
    
    public void setEventFlag(VehicleEventFlags eventFlag)
    {
	mComponents[8] = eventFlag;
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[9];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[9] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(9);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(9);
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
		    "IntersectionCollision$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_IntersectionCollision,
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
					    dsrc.region.REGION.reg_IntersectionCollision,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "IntersectionCollision$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_IntersectionCollision,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "IntersectionCollision$Regional$Sequence_"
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
		    (short)0x8009
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"IntersectionCollision$Regional"
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
		    "IntersectionCollision$Regional$Sequence_"
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
	    "IntersectionCollision"
	),
	new QName (
	    "DSRC",
	    "IntersectionCollision"
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
				"BSMcoreData"
			    ),
			    new QName (
				"DSRC",
				"BSMcoreData"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "BSMcoreData"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "BSMcoreData"
				)
			    ),
			    0
			)
		    ),
		    "partOne",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PathHistory"
			    ),
			    new QName (
				"DSRC",
				"PathHistory"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PathHistory"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PathHistory"
				)
			    ),
			    0
			)
		    ),
		    "path",
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
				"PathPrediction"
			    ),
			    new QName (
				"DSRC",
				"PathPrediction"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "PathPrediction"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "PathPrediction"
				)
			    ),
			    0
			)
		    ),
		    "pathPrediction",
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
				"IntersectionReferenceID"
			    ),
			    new QName (
				"DSRC",
				"IntersectionReferenceID"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionReferenceID"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "IntersectionReferenceID"
				)
			    ),
			    0
			)
		    ),
		    "intersectionID",
		    6,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ApproachOrLane"
			    ),
			    new QName (
				"DSRC",
				"ApproachOrLane"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "ApproachOrLane"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1)
				}
			    )
			)
		    ),
		    "laneNumber",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleEventFlags"
			    ),
			    new QName (
				"DSRC",
				"VehicleEventFlags"
			    ),
			    274454,
			    new SizeConstraint (
				new ExtensibleConstraint (
				    new SingleValueConstraint (
					new INTEGER(13)
				    ),
				    null
				)
			    ),
			    new Bounds (
				Long.valueOf(13),
				Long.valueOf(13)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"eventHazardLights",
					0
				    ),
				    new MemberListElement (
					"eventStopLineViolation",
					1
				    ),
				    new MemberListElement (
					"eventABSactivated",
					2
				    ),
				    new MemberListElement (
					"eventTractionControlLoss",
					3
				    ),
				    new MemberListElement (
					"eventStabilityControlactivated",
					4
				    ),
				    new MemberListElement (
					"eventHazardousMaterials",
					5
				    ),
				    new MemberListElement (
					"eventReserved1",
					6
				    ),
				    new MemberListElement (
					"eventHardBraking",
					7
				    ),
				    new MemberListElement (
					"eventLightsChanged",
					8
				    ),
				    new MemberListElement (
					"eventWipersChanged",
					9
				    ),
				    new MemberListElement (
					"eventFlatTire",
					10
				    ),
				    new MemberListElement (
					"eventDisabledVehicle",
					11
				    ),
				    new MemberListElement (
					"eventAirBagDeployment",
					12
				    )
				}
			    )
			)
		    ),
		    "eventFlag",
		    8,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "IntersectionCollision$Regional"
			)
		    ),
		    "regional",
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
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' IntersectionCollision object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntersectionCollision object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntersectionCollision
