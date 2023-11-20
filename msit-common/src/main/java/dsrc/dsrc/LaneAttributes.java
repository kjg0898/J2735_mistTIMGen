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
import com.oss.asn1.INTEGER;
import com.oss.asn1.OpenType;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type LaneAttributes from ASN1 Module DSRC.
 * @see Sequence
 */

public class LaneAttributes extends Sequence {
    
    /**
     * The default constructor.
     */
    public LaneAttributes()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public LaneAttributes(LaneDirection directionalUse, 
		    LaneSharing sharedWith, LaneTypeAttributes laneType, 
		    Regional regional)
    {
	setDirectionalUse(directionalUse);
	setSharedWith(sharedWith);
	setLaneType(laneType);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public LaneAttributes(LaneDirection directionalUse, 
		    LaneSharing sharedWith, LaneTypeAttributes laneType)
    {
	setDirectionalUse(directionalUse);
	setSharedWith(sharedWith);
	setLaneType(laneType);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LaneDirection();
	mComponents[1] = new LaneSharing();
	mComponents[2] = new LaneTypeAttributes();
	mComponents[3] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[4];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new LaneDirection();
	    case 1:
		return new LaneSharing();
	    case 2:
		return new LaneTypeAttributes();
	    case 3:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "directionalUse"
    public LaneDirection getDirectionalUse()
    {
	return (LaneDirection)mComponents[0];
    }
    
    public void setDirectionalUse(LaneDirection directionalUse)
    {
	mComponents[0] = directionalUse;
    }
    
    
    // Methods for field "sharedWith"
    public LaneSharing getSharedWith()
    {
	return (LaneSharing)mComponents[1];
    }
    
    public void setSharedWith(LaneSharing sharedWith)
    {
	mComponents[1] = sharedWith;
    }
    
    
    // Methods for field "laneType"
    public LaneTypeAttributes getLaneType()
    {
	return (LaneTypeAttributes)mComponents[2];
    }
    
    public void setLaneType(LaneTypeAttributes laneType)
    {
	mComponents[2] = laneType;
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[3];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[3] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(3);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(3);
    }
    
    
    
    /**
     * Define the ASN1 Type Regional from ASN1 Module DSRC.
     * @see Sequence
     */
    public static class Regional extends Sequence {
	
	/**
	 * The default constructor.
	 */
	public Regional()
	{
	}
	
	/**
	 * Construct with AbstractData components.
	 */
	public Regional(RegionId regionId, OpenType regExtValue)
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
		    (short)0x8003
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"LaneAttributes$Regional"
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
					dsrc.region.REGION.reg_LaneAttributes,
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
					dsrc.region.REGION.reg_LaneAttributes,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"LaneAttributes$Regional"
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
					dsrc.region.REGION.reg_LaneAttributes,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"LaneAttributes$Regional"
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
	    "LaneAttributes"
	),
	new QName (
	    "DSRC",
	    "LaneAttributes"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneDirection"
			    ),
			    new QName (
				"DSRC",
				"LaneDirection"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(2)
				)
			    ),
			    new Bounds (
				Long.valueOf(2),
				Long.valueOf(2)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ingressPath",
					0
				    ),
				    new MemberListElement (
					"egressPath",
					1
				    )
				}
			    )
			)
		    ),
		    "directionalUse",
		    0,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"LaneSharing"
			    ),
			    new QName (
				"DSRC",
				"LaneSharing"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(10)
				)
			    ),
			    new Bounds (
				Long.valueOf(10),
				Long.valueOf(10)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"overlappingLaneDescriptionProvided",
					0
				    ),
				    new MemberListElement (
					"multipleLanesTreatedAsOneLane",
					1
				    ),
				    new MemberListElement (
					"otherNonMotorizedTrafficTypes",
					2
				    ),
				    new MemberListElement (
					"individualMotorizedVehicleTraffic",
					3
				    ),
				    new MemberListElement (
					"busVehicleTraffic",
					4
				    ),
				    new MemberListElement (
					"taxiVehicleTraffic",
					5
				    ),
				    new MemberListElement (
					"pedestriansTraffic",
					6
				    ),
				    new MemberListElement (
					"cyclistVehicleTraffic",
					7
				    ),
				    new MemberListElement (
					"trackedVehicleTraffic",
					8
				    ),
				    new MemberListElement (
					"pedestrianTraffic",
					9
				    )
				}
			    )
			)
		    ),
		    "sharedWith",
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
				"LaneTypeAttributes"
			    ),
			    new QName (
				"DSRC",
				"LaneTypeAttributes"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "LaneTypeAttributes"
				)
			    ),
			    0,
			    new TagDecoder (
				new TagDecoderElement[] {
				    new TagDecoderElement((short)0x8000, 0),
				    new TagDecoderElement((short)0x8001, 1),
				    new TagDecoderElement((short)0x8002, 2),
				    new TagDecoderElement((short)0x8003, 3),
				    new TagDecoderElement((short)0x8004, 4),
				    new TagDecoderElement((short)0x8005, 5),
				    new TagDecoderElement((short)0x8006, 6),
				    new TagDecoderElement((short)0x8007, 7)
				}
			    )
			)
		    ),
		    "laneType",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "LaneAttributes$Regional"
			)
		    ),
		    "regional",
		    3,
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
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LaneAttributes object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LaneAttributes object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for LaneAttributes
