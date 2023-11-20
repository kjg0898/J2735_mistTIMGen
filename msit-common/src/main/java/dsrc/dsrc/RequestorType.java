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
import com.oss.asn1.OpenType;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type RequestorType from ASN1 Module DSRC.
 * @see Sequence
 */

public class RequestorType extends Sequence {
    
    /**
     * The default constructor.
     */
    public RequestorType()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RequestorType(BasicVehicleRole role, RequestSubRole subrole, 
		    RequestImportanceLevel request, 
		    Iso3833VehicleType iso3883, VehicleType hpmsType, 
		    Regional regional)
    {
	setRole(role);
	setSubrole(subrole);
	setRequest(request);
	setIso3883(iso3883);
	setHpmsType(hpmsType);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public RequestorType(BasicVehicleRole role)
    {
	setRole(role);
    }
    
    public void initComponents()
    {
	mComponents[0] = BasicVehicleRole.basicVehicle;
	mComponents[1] = RequestSubRole.requestSubRoleUnKnown;
	mComponents[2] = RequestImportanceLevel.requestImportanceLevelUnKnown;
	mComponents[3] = new Iso3833VehicleType();
	mComponents[4] = VehicleType.none;
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
		return BasicVehicleRole.basicVehicle;
	    case 1:
		return RequestSubRole.requestSubRoleUnKnown;
	    case 2:
		return RequestImportanceLevel.requestImportanceLevelUnKnown;
	    case 3:
		return new Iso3833VehicleType();
	    case 4:
		return VehicleType.none;
	    case 5:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "role"
    public BasicVehicleRole getRole()
    {
	return (BasicVehicleRole)mComponents[0];
    }
    
    public void setRole(BasicVehicleRole role)
    {
	mComponents[0] = role;
    }
    
    
    // Methods for field "subrole"
    public RequestSubRole getSubrole()
    {
	return (RequestSubRole)mComponents[1];
    }
    
    public void setSubrole(RequestSubRole subrole)
    {
	mComponents[1] = subrole;
    }
    
    public boolean hasSubrole()
    {
	return componentIsPresent(1);
    }
    
    public void deleteSubrole()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "request"
    public RequestImportanceLevel getRequest()
    {
	return (RequestImportanceLevel)mComponents[2];
    }
    
    public void setRequest(RequestImportanceLevel request)
    {
	mComponents[2] = request;
    }
    
    public boolean hasRequest()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRequest()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "iso3883"
    public Iso3833VehicleType getIso3883()
    {
	return (Iso3833VehicleType)mComponents[3];
    }
    
    public void setIso3883(Iso3833VehicleType iso3883)
    {
	mComponents[3] = iso3883;
    }
    
    public boolean hasIso3883()
    {
	return componentIsPresent(3);
    }
    
    public void deleteIso3883()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "hpmsType"
    public VehicleType getHpmsType()
    {
	return (VehicleType)mComponents[4];
    }
    
    public void setHpmsType(VehicleType hpmsType)
    {
	mComponents[4] = hpmsType;
    }
    
    public boolean hasHpmsType()
    {
	return componentIsPresent(4);
    }
    
    public void deleteHpmsType()
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
		    (short)0x8005
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"RequestorType$Regional"
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
					dsrc.region.REGION.reg_RequestorType,
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
					dsrc.region.REGION.reg_RequestorType,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"RequestorType$Regional"
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
					dsrc.region.REGION.reg_RequestorType,
					1
				    ),
				    new ComponentRelations (
					new ComponentRelation[] {
					    new ComponentRelation (
						0,
						new FieldInfoRef (
						    new QName (
							"dsrc.dsrc",
							"RequestorType$Regional"
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
	    "RequestorType"
	),
	new QName (
	    "DSRC",
	    "RequestorType"
	),
	274454,
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
				"BasicVehicleRole"
			    ),
			    new QName (
				"DSRC",
				"BasicVehicleRole"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"basicVehicle",
					0
				    ),
				    new MemberListElement (
					"publicTransport",
					1
				    ),
				    new MemberListElement (
					"specialTransport",
					2
				    ),
				    new MemberListElement (
					"dangerousGoods",
					3
				    ),
				    new MemberListElement (
					"roadWork",
					4
				    ),
				    new MemberListElement (
					"roadRescue",
					5
				    ),
				    new MemberListElement (
					"emergency",
					6
				    ),
				    new MemberListElement (
					"safetyCar",
					7
				    ),
				    new MemberListElement (
					"none-unknown",
					8
				    ),
				    new MemberListElement (
					"truck",
					9
				    ),
				    new MemberListElement (
					"motorcycle",
					10
				    ),
				    new MemberListElement (
					"roadSideSource",
					11
				    ),
				    new MemberListElement (
					"police",
					12
				    ),
				    new MemberListElement (
					"fire",
					13
				    ),
				    new MemberListElement (
					"ambulance",
					14
				    ),
				    new MemberListElement (
					"dot",
					15
				    ),
				    new MemberListElement (
					"transit",
					16
				    ),
				    new MemberListElement (
					"slowMoving",
					17
				    ),
				    new MemberListElement (
					"stopNgo",
					18
				    ),
				    new MemberListElement (
					"cyclist",
					19
				    ),
				    new MemberListElement (
					"pedestrian",
					20
				    ),
				    new MemberListElement (
					"nonMotorized",
					21
				    ),
				    new MemberListElement (
					"military",
					22
				    )
				}
			    ),
			    0,
			    BasicVehicleRole.basicVehicle
			)
		    ),
		    "role",
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
				"RequestSubRole"
			    ),
			    new QName (
				"DSRC",
				"RequestSubRole"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"requestSubRoleUnKnown",
					0
				    ),
				    new MemberListElement (
					"requestSubRole1",
					1
				    ),
				    new MemberListElement (
					"requestSubRole2",
					2
				    ),
				    new MemberListElement (
					"requestSubRole3",
					3
				    ),
				    new MemberListElement (
					"requestSubRole4",
					4
				    ),
				    new MemberListElement (
					"requestSubRole5",
					5
				    ),
				    new MemberListElement (
					"requestSubRole6",
					6
				    ),
				    new MemberListElement (
					"requestSubRole7",
					7
				    ),
				    new MemberListElement (
					"requestSubRole8",
					8
				    ),
				    new MemberListElement (
					"requestSubRole9",
					9
				    ),
				    new MemberListElement (
					"requestSubRole10",
					10
				    ),
				    new MemberListElement (
					"requestSubRole11",
					11
				    ),
				    new MemberListElement (
					"requestSubRole12",
					12
				    ),
				    new MemberListElement (
					"requestSubRole13",
					13
				    ),
				    new MemberListElement (
					"requestSubRole14",
					14
				    ),
				    new MemberListElement (
					"requestSubRoleReserved",
					15
				    )
				}
			    ),
			    0,
			    RequestSubRole.requestSubRoleUnKnown
			)
		    ),
		    "subrole",
		    1,
		    3,
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
				"RequestImportanceLevel"
			    ),
			    new QName (
				"DSRC",
				"RequestImportanceLevel"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"requestImportanceLevelUnKnown",
					0
				    ),
				    new MemberListElement (
					"requestImportanceLevel1",
					1
				    ),
				    new MemberListElement (
					"requestImportanceLevel2",
					2
				    ),
				    new MemberListElement (
					"requestImportanceLevel3",
					3
				    ),
				    new MemberListElement (
					"requestImportanceLevel4",
					4
				    ),
				    new MemberListElement (
					"requestImportanceLevel5",
					5
				    ),
				    new MemberListElement (
					"requestImportanceLevel6",
					6
				    ),
				    new MemberListElement (
					"requestImportanceLevel7",
					7
				    ),
				    new MemberListElement (
					"requestImportanceLevel8",
					8
				    ),
				    new MemberListElement (
					"requestImportanceLevel9",
					9
				    ),
				    new MemberListElement (
					"requestImportanceLevel10",
					10
				    ),
				    new MemberListElement (
					"requestImportanceLevel11",
					11
				    ),
				    new MemberListElement (
					"requestImportanceLevel12",
					12
				    ),
				    new MemberListElement (
					"requestImportanceLevel13",
					13
				    ),
				    new MemberListElement (
					"requestImportanceLevel14",
					14
				    ),
				    new MemberListElement (
					"requestImportanceReserved",
					15
				    )
				}
			    ),
			    0,
			    RequestImportanceLevel.requestImportanceLevelUnKnown
			)
		    ),
		    "request",
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
				"Iso3833VehicleType"
			    ),
			    new QName (
				"DSRC",
				"Iso3833VehicleType"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Iso3833VehicleType(0), 
				    new Iso3833VehicleType(100),
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
		    "iso3883",
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
				"VehicleType"
			    ),
			    new QName (
				"DSRC",
				"VehicleType"
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
					"unknown",
					1
				    ),
				    new MemberListElement (
					"special",
					2
				    ),
				    new MemberListElement (
					"moto",
					3
				    ),
				    new MemberListElement (
					"car",
					4
				    ),
				    new MemberListElement (
					"carOther",
					5
				    ),
				    new MemberListElement (
					"bus",
					6
				    ),
				    new MemberListElement (
					"axleCnt2",
					7
				    ),
				    new MemberListElement (
					"axleCnt3",
					8
				    ),
				    new MemberListElement (
					"axleCnt4",
					9
				    ),
				    new MemberListElement (
					"axleCnt4Trailer",
					10
				    ),
				    new MemberListElement (
					"axleCnt5Trailer",
					11
				    ),
				    new MemberListElement (
					"axleCnt6Trailer",
					12
				    ),
				    new MemberListElement (
					"axleCnt5MultiTrailer",
					13
				    ),
				    new MemberListElement (
					"axleCnt6MultiTrailer",
					14
				    ),
				    new MemberListElement (
					"axleCnt7MultiTrailer",
					15
				    )
				}
			    ),
			    0,
			    VehicleType.none
			)
		    ),
		    "hpmsType",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "RequestorType$Regional"
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
     * Get the type descriptor (TypeInfo) of 'this' RequestorType object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RequestorType object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RequestorType
