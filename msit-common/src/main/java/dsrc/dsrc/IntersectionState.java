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
 * Define the ASN1 Type IntersectionState from ASN1 Module DSRC.
 * @see Sequence
 */

public class IntersectionState extends Sequence {
    
    /**
     * The default constructor.
     */
    public IntersectionState()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public IntersectionState(DescriptiveName name, IntersectionReferenceID id, 
		    MsgCount revision, IntersectionStatusObject status, 
		    MinuteOfTheYear moy, DSecond timeStamp, 
		    EnabledLaneList enabledLanes, MovementList states, 
		    ManeuverAssistList maneuverAssistList, Regional regional)
    {
	setName(name);
	setId(id);
	setRevision(revision);
	setStatus(status);
	setMoy(moy);
	setTimeStamp(timeStamp);
	setEnabledLanes(enabledLanes);
	setStates(states);
	setManeuverAssistList(maneuverAssistList);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public IntersectionState(IntersectionReferenceID id, MsgCount revision, 
		    IntersectionStatusObject status, MovementList states)
    {
	setId(id);
	setRevision(revision);
	setStatus(status);
	setStates(states);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DescriptiveName();
	mComponents[1] = new IntersectionReferenceID();
	mComponents[2] = new MsgCount();
	mComponents[3] = new IntersectionStatusObject();
	mComponents[4] = new MinuteOfTheYear();
	mComponents[5] = new DSecond();
	mComponents[6] = new EnabledLaneList();
	mComponents[7] = new MovementList();
	mComponents[8] = new ManeuverAssistList();
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
		return new DescriptiveName();
	    case 1:
		return new IntersectionReferenceID();
	    case 2:
		return new MsgCount();
	    case 3:
		return new IntersectionStatusObject();
	    case 4:
		return new MinuteOfTheYear();
	    case 5:
		return new DSecond();
	    case 6:
		return new EnabledLaneList();
	    case 7:
		return new MovementList();
	    case 8:
		return new ManeuverAssistList();
	    case 9:
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
    public IntersectionReferenceID getId()
    {
	return (IntersectionReferenceID)mComponents[1];
    }
    
    public void setId(IntersectionReferenceID id)
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
    
    
    // Methods for field "status"
    public IntersectionStatusObject getStatus()
    {
	return (IntersectionStatusObject)mComponents[3];
    }
    
    public void setStatus(IntersectionStatusObject status)
    {
	mComponents[3] = status;
    }
    
    
    // Methods for field "moy"
    public MinuteOfTheYear getMoy()
    {
	return (MinuteOfTheYear)mComponents[4];
    }
    
    public void setMoy(MinuteOfTheYear moy)
    {
	mComponents[4] = moy;
    }
    
    public boolean hasMoy()
    {
	return componentIsPresent(4);
    }
    
    public void deleteMoy()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "timeStamp"
    public DSecond getTimeStamp()
    {
	return (DSecond)mComponents[5];
    }
    
    public void setTimeStamp(DSecond timeStamp)
    {
	mComponents[5] = timeStamp;
    }
    
    public boolean hasTimeStamp()
    {
	return componentIsPresent(5);
    }
    
    public void deleteTimeStamp()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "enabledLanes"
    public EnabledLaneList getEnabledLanes()
    {
	return (EnabledLaneList)mComponents[6];
    }
    
    public void setEnabledLanes(EnabledLaneList enabledLanes)
    {
	mComponents[6] = enabledLanes;
    }
    
    public boolean hasEnabledLanes()
    {
	return componentIsPresent(6);
    }
    
    public void deleteEnabledLanes()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "states"
    public MovementList getStates()
    {
	return (MovementList)mComponents[7];
    }
    
    public void setStates(MovementList states)
    {
	mComponents[7] = states;
    }
    
    
    // Methods for field "maneuverAssistList"
    public ManeuverAssistList getManeuverAssistList()
    {
	return (ManeuverAssistList)mComponents[8];
    }
    
    public void setManeuverAssistList(ManeuverAssistList maneuverAssistList)
    {
	mComponents[8] = maneuverAssistList;
    }
    
    public boolean hasManeuverAssistList()
    {
	return componentIsPresent(8);
    }
    
    public void deleteManeuverAssistList()
    {
	setComponentAbsent(8);
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
		    "IntersectionState$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_IntersectionState,
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
					    dsrc.region.REGION.reg_IntersectionState,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "IntersectionState$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_IntersectionState,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "IntersectionState$Regional$Sequence_"
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
		"IntersectionState$Regional"
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
		    "IntersectionState$Regional$Sequence_"
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
	    "IntersectionState"
	),
	new QName (
	    "DSRC",
	    "IntersectionState"
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
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"IntersectionStatusObject"
			    ),
			    new QName (
				"DSRC",
				"IntersectionStatusObject"
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
					"manualControlIsEnabled",
					0
				    ),
				    new MemberListElement (
					"stopTimeIsActivated",
					1
				    ),
				    new MemberListElement (
					"failureFlash",
					2
				    ),
				    new MemberListElement (
					"preemptIsActive",
					3
				    ),
				    new MemberListElement (
					"signalPriorityIsActive",
					4
				    ),
				    new MemberListElement (
					"fixedTimeOperation",
					5
				    ),
				    new MemberListElement (
					"trafficDependentOperation",
					6
				    ),
				    new MemberListElement (
					"standbyOperation",
					7
				    ),
				    new MemberListElement (
					"failureMode",
					8
				    ),
				    new MemberListElement (
					"off",
					9
				    ),
				    new MemberListElement (
					"recentMAPmessageUpdate",
					10
				    ),
				    new MemberListElement (
					"recentChangeInMAPassignedLanesIDsUsed",
					11
				    ),
				    new MemberListElement (
					"noValidMAPisAvailableAtThisTime",
					12
				    ),
				    new MemberListElement (
					"noValidSPATisAvailableAtThisTime",
					13
				    )
				}
			    )
			)
		    ),
		    "status",
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
		    "moy",
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
		    "timeStamp",
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
				"EnabledLaneList"
			    ),
			    new QName (
				"DSRC",
				"EnabledLaneList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "LaneID"
				)
			    )
			)
		    ),
		    "enabledLanes",
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
				"MovementList"
			    ),
			    new QName (
				"DSRC",
				"MovementList"
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
				    "MovementState"
				)
			    )
			)
		    ),
		    "states",
		    7,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ManeuverAssistList"
			    ),
			    new QName (
				"DSRC",
				"ManeuverAssistList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(16),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(16)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "ConnectionManeuverAssist"
				)
			    )
			)
		    ),
		    "maneuverAssistList",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "IntersectionState$Regional"
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
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7)
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
     * Get the type descriptor (TypeInfo) of 'this' IntersectionState object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' IntersectionState object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for IntersectionState
