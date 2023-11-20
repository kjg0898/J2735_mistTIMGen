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
 * Define the ASN1 Type GenericLane from ASN1 Module DSRC.
 * @see Sequence
 */

public class GenericLane extends Sequence {
    
    /**
     * The default constructor.
     */
    public GenericLane()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GenericLane(LaneID laneID, DescriptiveName name, 
		    ApproachID ingressApproach, ApproachID egressApproach, 
		    LaneAttributes laneAttributes, AllowedManeuvers maneuvers, 
		    NodeListXY nodeList, ConnectsToList connectsTo, 
		    OverlayLaneList overlays, Regional regional)
    {
	setLaneID(laneID);
	setName(name);
	setIngressApproach(ingressApproach);
	setEgressApproach(egressApproach);
	setLaneAttributes(laneAttributes);
	setManeuvers(maneuvers);
	setNodeList(nodeList);
	setConnectsTo(connectsTo);
	setOverlays(overlays);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public GenericLane(LaneID laneID, LaneAttributes laneAttributes, 
		    NodeListXY nodeList)
    {
	setLaneID(laneID);
	setLaneAttributes(laneAttributes);
	setNodeList(nodeList);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LaneID();
	mComponents[1] = new DescriptiveName();
	mComponents[2] = new ApproachID();
	mComponents[3] = new ApproachID();
	mComponents[4] = new LaneAttributes();
	mComponents[5] = new AllowedManeuvers();
	mComponents[6] = new NodeListXY();
	mComponents[7] = new ConnectsToList();
	mComponents[8] = new OverlayLaneList();
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
		return new LaneID();
	    case 1:
		return new DescriptiveName();
	    case 2:
		return new ApproachID();
	    case 3:
		return new ApproachID();
	    case 4:
		return new LaneAttributes();
	    case 5:
		return new AllowedManeuvers();
	    case 6:
		return new NodeListXY();
	    case 7:
		return new ConnectsToList();
	    case 8:
		return new OverlayLaneList();
	    case 9:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "laneID"
    public LaneID getLaneID()
    {
	return (LaneID)mComponents[0];
    }
    
    public void setLaneID(LaneID laneID)
    {
	mComponents[0] = laneID;
    }
    
    
    // Methods for field "name"
    public DescriptiveName getName()
    {
	return (DescriptiveName)mComponents[1];
    }
    
    public void setName(DescriptiveName name)
    {
	mComponents[1] = name;
    }
    
    public boolean hasName()
    {
	return componentIsPresent(1);
    }
    
    public void deleteName()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ingressApproach"
    public ApproachID getIngressApproach()
    {
	return (ApproachID)mComponents[2];
    }
    
    public void setIngressApproach(ApproachID ingressApproach)
    {
	mComponents[2] = ingressApproach;
    }
    
    public boolean hasIngressApproach()
    {
	return componentIsPresent(2);
    }
    
    public void deleteIngressApproach()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "egressApproach"
    public ApproachID getEgressApproach()
    {
	return (ApproachID)mComponents[3];
    }
    
    public void setEgressApproach(ApproachID egressApproach)
    {
	mComponents[3] = egressApproach;
    }
    
    public boolean hasEgressApproach()
    {
	return componentIsPresent(3);
    }
    
    public void deleteEgressApproach()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "laneAttributes"
    public LaneAttributes getLaneAttributes()
    {
	return (LaneAttributes)mComponents[4];
    }
    
    public void setLaneAttributes(LaneAttributes laneAttributes)
    {
	mComponents[4] = laneAttributes;
    }
    
    
    // Methods for field "maneuvers"
    public AllowedManeuvers getManeuvers()
    {
	return (AllowedManeuvers)mComponents[5];
    }
    
    public void setManeuvers(AllowedManeuvers maneuvers)
    {
	mComponents[5] = maneuvers;
    }
    
    public boolean hasManeuvers()
    {
	return componentIsPresent(5);
    }
    
    public void deleteManeuvers()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "nodeList"
    public NodeListXY getNodeList()
    {
	return (NodeListXY)mComponents[6];
    }
    
    public void setNodeList(NodeListXY nodeList)
    {
	mComponents[6] = nodeList;
    }
    
    
    // Methods for field "connectsTo"
    public ConnectsToList getConnectsTo()
    {
	return (ConnectsToList)mComponents[7];
    }
    
    public void setConnectsTo(ConnectsToList connectsTo)
    {
	mComponents[7] = connectsTo;
    }
    
    public boolean hasConnectsTo()
    {
	return componentIsPresent(7);
    }
    
    public void deleteConnectsTo()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "overlays"
    public OverlayLaneList getOverlays()
    {
	return (OverlayLaneList)mComponents[8];
    }
    
    public void setOverlays(OverlayLaneList overlays)
    {
	mComponents[8] = overlays;
    }
    
    public boolean hasOverlays()
    {
	return componentIsPresent(8);
    }
    
    public void deleteOverlays()
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
		    "GenericLane$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_GenericLane,
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
					    dsrc.region.REGION.reg_GenericLane,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "GenericLane$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_GenericLane,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "GenericLane$Regional$Sequence_"
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
		"GenericLane$Regional"
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
		    "GenericLane$Regional$Sequence_"
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
	    "GenericLane"
	),
	new QName (
	    "DSRC",
	    "GenericLane"
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
				"LaneID"
			    ),
			    new QName (
				"DSRC",
				"LaneID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneID(0), 
				    new LaneID(255),
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
		    "laneID",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
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
		    1,
		    3,
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
				"ApproachID"
			    ),
			    new QName (
				"DSRC",
				"ApproachID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ApproachID(0), 
				    new ApproachID(15),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(15)
			    ),
			    null
			)
		    ),
		    "ingressApproach",
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
				"ApproachID"
			    ),
			    new QName (
				"DSRC",
				"ApproachID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new ApproachID(0), 
				    new ApproachID(15),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(15)
			    ),
			    null
			)
		    ),
		    "egressApproach",
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
				"LaneAttributes"
			    ),
			    new QName (
				"DSRC",
				"LaneAttributes"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "LaneAttributes"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "LaneAttributes"
				)
			    ),
			    0
			)
		    ),
		    "laneAttributes",
		    4,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"AllowedManeuvers"
			    ),
			    new QName (
				"DSRC",
				"AllowedManeuvers"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(12)
				)
			    ),
			    new Bounds (
				Long.valueOf(12),
				Long.valueOf(12)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"maneuverStraightAllowed",
					0
				    ),
				    new MemberListElement (
					"maneuverLeftAllowed",
					1
				    ),
				    new MemberListElement (
					"maneuverRightAllowed",
					2
				    ),
				    new MemberListElement (
					"maneuverUTurnAllowed",
					3
				    ),
				    new MemberListElement (
					"maneuverLeftTurnOnRedAllowed",
					4
				    ),
				    new MemberListElement (
					"maneuverRightTurnOnRedAllowed",
					5
				    ),
				    new MemberListElement (
					"maneuverLaneChangeAllowed",
					6
				    ),
				    new MemberListElement (
					"maneuverNoStoppingAllowed",
					7
				    ),
				    new MemberListElement (
					"yieldAllwaysRequired",
					8
				    ),
				    new MemberListElement (
					"goWithHalt",
					9
				    ),
				    new MemberListElement (
					"caution",
					10
				    ),
				    new MemberListElement (
					"reserved1",
					11
				    )
				}
			    )
			)
		    ),
		    "maneuvers",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"NodeListXY"
			    ),
			    new QName (
				"DSRC",
				"NodeListXY"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "NodeListXY"
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
		    "nodeList",
		    6,
		    2,
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
				"ConnectsToList"
			    ),
			    new QName (
				"DSRC",
				"ConnectsToList"
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
				    "Connection"
				)
			    )
			)
		    ),
		    "connectsTo",
		    7,
		    3,
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
				"OverlayLaneList"
			    ),
			    new QName (
				"DSRC",
				"OverlayLaneList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(5),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(5)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "LaneID"
				)
			    )
			)
		    ),
		    "overlays",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "GenericLane$Regional"
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' GenericLane object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GenericLane object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GenericLane
