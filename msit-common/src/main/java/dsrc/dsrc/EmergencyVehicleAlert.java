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
 * Define the ASN1 Type EmergencyVehicleAlert from ASN1 Module DSRC.
 * @see Sequence
 */

public class EmergencyVehicleAlert extends Sequence {
    
    /**
     * The default constructor.
     */
    public EmergencyVehicleAlert()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public EmergencyVehicleAlert(MinuteOfTheYear timeStamp, TemporaryID id, 
		    RoadSideAlert rsaMsg, ResponseType responseType, 
		    EmergencyDetails details, VehicleMass mass, 
		    VehicleType basicType, 
		    dsrc.itis.VehicleGroupAffected vehicleType, 
		    dsrc.itis.IncidentResponseEquipment responseEquip, 
		    dsrc.itis.ResponderGroupAffected responderType, 
		    Regional regional)
    {
	setTimeStamp(timeStamp);
	setId(id);
	setRsaMsg(rsaMsg);
	setResponseType(responseType);
	setDetails(details);
	setMass(mass);
	setBasicType(basicType);
	setVehicleType(vehicleType);
	setResponseEquip(responseEquip);
	setResponderType(responderType);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public EmergencyVehicleAlert(RoadSideAlert rsaMsg)
    {
	setRsaMsg(rsaMsg);
    }
    
    public void initComponents()
    {
	mComponents[0] = new MinuteOfTheYear();
	mComponents[1] = new TemporaryID();
	mComponents[2] = new RoadSideAlert();
	mComponents[3] = ResponseType.notInUseOrNotEquipped;
	mComponents[4] = new EmergencyDetails();
	mComponents[5] = new VehicleMass();
	mComponents[6] = VehicleType.none;
	mComponents[7] = dsrc.itis.VehicleGroupAffected.all_vehicles;
	mComponents[8] = dsrc.itis.IncidentResponseEquipment.ground_fire_suppression;
	mComponents[9] = dsrc.itis.ResponderGroupAffected.emergency_vehicle_units;
	mComponents[10] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[11];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new MinuteOfTheYear();
	    case 1:
		return new TemporaryID();
	    case 2:
		return new RoadSideAlert();
	    case 3:
		return ResponseType.notInUseOrNotEquipped;
	    case 4:
		return new EmergencyDetails();
	    case 5:
		return new VehicleMass();
	    case 6:
		return VehicleType.none;
	    case 7:
		return dsrc.itis.VehicleGroupAffected.all_vehicles;
	    case 8:
		return dsrc.itis.IncidentResponseEquipment.ground_fire_suppression;
	    case 9:
		return dsrc.itis.ResponderGroupAffected.emergency_vehicle_units;
	    case 10:
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
    
    
    // Methods for field "id"
    public TemporaryID getId()
    {
	return (TemporaryID)mComponents[1];
    }
    
    public void setId(TemporaryID id)
    {
	mComponents[1] = id;
    }
    
    public boolean hasId()
    {
	return componentIsPresent(1);
    }
    
    public void deleteId()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rsaMsg"
    public RoadSideAlert getRsaMsg()
    {
	return (RoadSideAlert)mComponents[2];
    }
    
    public void setRsaMsg(RoadSideAlert rsaMsg)
    {
	mComponents[2] = rsaMsg;
    }
    
    
    // Methods for field "responseType"
    public ResponseType getResponseType()
    {
	return (ResponseType)mComponents[3];
    }
    
    public void setResponseType(ResponseType responseType)
    {
	mComponents[3] = responseType;
    }
    
    public boolean hasResponseType()
    {
	return componentIsPresent(3);
    }
    
    public void deleteResponseType()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "details"
    public EmergencyDetails getDetails()
    {
	return (EmergencyDetails)mComponents[4];
    }
    
    public void setDetails(EmergencyDetails details)
    {
	mComponents[4] = details;
    }
    
    public boolean hasDetails()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDetails()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "mass"
    public VehicleMass getMass()
    {
	return (VehicleMass)mComponents[5];
    }
    
    public void setMass(VehicleMass mass)
    {
	mComponents[5] = mass;
    }
    
    public boolean hasMass()
    {
	return componentIsPresent(5);
    }
    
    public void deleteMass()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "basicType"
    public VehicleType getBasicType()
    {
	return (VehicleType)mComponents[6];
    }
    
    public void setBasicType(VehicleType basicType)
    {
	mComponents[6] = basicType;
    }
    
    public boolean hasBasicType()
    {
	return componentIsPresent(6);
    }
    
    public void deleteBasicType()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "vehicleType"
    public dsrc.itis.VehicleGroupAffected getVehicleType()
    {
	return (dsrc.itis.VehicleGroupAffected)mComponents[7];
    }
    
    public void setVehicleType(dsrc.itis.VehicleGroupAffected vehicleType)
    {
	mComponents[7] = vehicleType;
    }
    
    public boolean hasVehicleType()
    {
	return componentIsPresent(7);
    }
    
    public void deleteVehicleType()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "responseEquip"
    public dsrc.itis.IncidentResponseEquipment getResponseEquip()
    {
	return (dsrc.itis.IncidentResponseEquipment)mComponents[8];
    }
    
    public void setResponseEquip(dsrc.itis.IncidentResponseEquipment responseEquip)
    {
	mComponents[8] = responseEquip;
    }
    
    public boolean hasResponseEquip()
    {
	return componentIsPresent(8);
    }
    
    public void deleteResponseEquip()
    {
	setComponentAbsent(8);
    }
    
    
    // Methods for field "responderType"
    public dsrc.itis.ResponderGroupAffected getResponderType()
    {
	return (dsrc.itis.ResponderGroupAffected)mComponents[9];
    }
    
    public void setResponderType(dsrc.itis.ResponderGroupAffected responderType)
    {
	mComponents[9] = responderType;
    }
    
    public boolean hasResponderType()
    {
	return componentIsPresent(9);
    }
    
    public void deleteResponderType()
    {
	setComponentAbsent(9);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[10];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[10] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(10);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(10);
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
		    "EmergencyVehicleAlert$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_EmergencyVehicleAlert,
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
					    dsrc.region.REGION.reg_EmergencyVehicleAlert,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "EmergencyVehicleAlert$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_EmergencyVehicleAlert,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "EmergencyVehicleAlert$Regional$Sequence_"
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
		    (short)0x800a
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"EmergencyVehicleAlert$Regional"
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
		    "EmergencyVehicleAlert$Regional$Sequence_"
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
	    "EmergencyVehicleAlert"
	),
	new QName (
	    "DSRC",
	    "EmergencyVehicleAlert"
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
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RoadSideAlert"
			    ),
			    new QName (
				"DSRC",
				"RoadSideAlert"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "RoadSideAlert"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "RoadSideAlert"
				)
			    ),
			    0
			)
		    ),
		    "rsaMsg",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"ResponseType"
			    ),
			    new QName (
				"DSRC",
				"ResponseType"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"notInUseOrNotEquipped",
					0
				    ),
				    new MemberListElement (
					"emergency",
					1
				    ),
				    new MemberListElement (
					"nonEmergency",
					2
				    ),
				    new MemberListElement (
					"pursuit",
					3
				    ),
				    new MemberListElement (
					"stationary",
					4
				    ),
				    new MemberListElement (
					"slowMoving",
					5
				    ),
				    new MemberListElement (
					"stopAndGoMovement",
					6
				    )
				}
			    ),
			    0,
			    ResponseType.notInUseOrNotEquipped
			)
		    ),
		    "responseType",
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
				"EmergencyDetails"
			    ),
			    new QName (
				"DSRC",
				"EmergencyDetails"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "EmergencyDetails"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "EmergencyDetails"
				)
			    ),
			    0
			)
		    ),
		    "details",
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
				"VehicleMass"
			    ),
			    new QName (
				"DSRC",
				"VehicleMass"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new VehicleMass(0), 
				    new VehicleMass(255),
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
		    "mass",
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
		    "basicType",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.itis",
				"VehicleGroupAffected"
			    ),
			    new QName (
				"ITIS",
				"VehicleGroupAffected"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"all-vehicles",
					9217
				    ),
				    new MemberListElement (
					"bicycles",
					9218
				    ),
				    new MemberListElement (
					"motorcycles",
					9219
				    ),
				    new MemberListElement (
					"cars",
					9220
				    ),
				    new MemberListElement (
					"light-vehicles",
					9221
				    ),
				    new MemberListElement (
					"cars-and-light-vehicles",
					9222
				    ),
				    new MemberListElement (
					"cars-with-trailers",
					9223
				    ),
				    new MemberListElement (
					"cars-with-recreational-trailers",
					9224
				    ),
				    new MemberListElement (
					"vehicles-with-trailers",
					9225
				    ),
				    new MemberListElement (
					"heavy-vehicles",
					9226
				    ),
				    new MemberListElement (
					"trucks",
					9227
				    ),
				    new MemberListElement (
					"buses",
					9228
				    ),
				    new MemberListElement (
					"articulated-buses",
					9229
				    ),
				    new MemberListElement (
					"school-buses",
					9230
				    ),
				    new MemberListElement (
					"vehicles-with-semi-trailers",
					9231
				    ),
				    new MemberListElement (
					"vehicles-with-double-trailers",
					9232
				    ),
				    new MemberListElement (
					"high-profile-vehicles",
					9233
				    ),
				    new MemberListElement (
					"wide-vehicles",
					9234
				    ),
				    new MemberListElement (
					"long-vehicles",
					9235
				    ),
				    new MemberListElement (
					"hazardous-loads",
					9236
				    ),
				    new MemberListElement (
					"exceptional-loads",
					9237
				    ),
				    new MemberListElement (
					"abnormal-loads",
					9238
				    ),
				    new MemberListElement (
					"convoys",
					9239
				    ),
				    new MemberListElement (
					"maintenance-vehicles",
					9240
				    ),
				    new MemberListElement (
					"delivery-vehicles",
					9241
				    ),
				    new MemberListElement (
					"vehicles-with-even-numbered-license-plates",
					9242
				    ),
				    new MemberListElement (
					"vehicles-with-odd-numbered-license-plates",
					9243
				    ),
				    new MemberListElement (
					"vehicles-with-parking-permits",
					9244
				    ),
				    new MemberListElement (
					"vehicles-with-catalytic-converters",
					9245
				    ),
				    new MemberListElement (
					"vehicles-without-catalytic-converters",
					9246
				    ),
				    new MemberListElement (
					"gas-powered-vehicles",
					9247
				    ),
				    new MemberListElement (
					"diesel-powered-vehicles",
					9248
				    ),
				    new MemberListElement (
					"lPG-vehicles",
					9249
				    ),
				    new MemberListElement (
					"military-convoys",
					9250
				    ),
				    new MemberListElement (
					"military-vehicles",
					9251
				    ),
				    new MemberListElement (
					"electric-powered-vehicles",
					9252
				    ),
				    new MemberListElement (
					"hybrid-powered-vehicles",
					9253
				    ),
				    new MemberListElement (
					"inherently-low-emisson-vehicles",
					9254
				    ),
				    new MemberListElement (
					"commerical-vehicles",
					9255
				    ),
				    new MemberListElement (
					"runaway-vehicles",
					9256
				    ),
				    new MemberListElement (
					"vehicles-with-lugs",
					9257
				    ),
				    new MemberListElement (
					"motor-driven-cycles",
					9258
				    ),
				    new MemberListElement (
					"recreational-vehicles",
					9259
				    ),
				    new MemberListElement (
					"non-motorized-vehicles",
					9260
				    ),
				    new MemberListElement (
					"traffic",
					9261
				    )
				}
			    ),
			    0,
			    dsrc.itis.VehicleGroupAffected.all_vehicles
			)
		    ),
		    "vehicleType",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"dsrc.itis",
				"IncidentResponseEquipment"
			    ),
			    new QName (
				"ITIS",
				"IncidentResponseEquipment"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"ground-fire-suppression",
					9985
				    ),
				    new MemberListElement (
					"heavy-ground-equipment",
					9986
				    ),
				    new MemberListElement (
					"aircraft",
					9988
				    ),
				    new MemberListElement (
					"marine-equipment",
					9989
				    ),
				    new MemberListElement (
					"support-equipment",
					9990
				    ),
				    new MemberListElement (
					"medical-rescue-unit",
					9991
				    ),
				    new MemberListElement (
					"other",
					9993
				    ),
				    new MemberListElement (
					"ground-fire-suppression-other",
					9994
				    ),
				    new MemberListElement (
					"engine",
					9995
				    ),
				    new MemberListElement (
					"truck-or-aerial",
					9996
				    ),
				    new MemberListElement (
					"quint",
					9997
				    ),
				    new MemberListElement (
					"tanker-pumper-combination",
					9998
				    ),
				    new MemberListElement (
					"brush-truck",
					10000
				    ),
				    new MemberListElement (
					"aircraft-rescue-firefighting",
					10001
				    ),
				    new MemberListElement (
					"heavy-ground-equipment-other",
					10004
				    ),
				    new MemberListElement (
					"dozer-or-plow",
					10005
				    ),
				    new MemberListElement (
					"tractor",
					10006
				    ),
				    new MemberListElement (
					"tanker-or-tender",
					10008
				    ),
				    new MemberListElement (
					"aircraft-other",
					10024
				    ),
				    new MemberListElement (
					"aircraft-fixed-wing-tanker",
					10025
				    ),
				    new MemberListElement (
					"helitanker",
					10026
				    ),
				    new MemberListElement (
					"helicopter",
					10027
				    ),
				    new MemberListElement (
					"marine-equipment-other",
					10034
				    ),
				    new MemberListElement (
					"fire-boat-with-pump",
					10035
				    ),
				    new MemberListElement (
					"boat-no-pump",
					10036
				    ),
				    new MemberListElement (
					"support-apparatus-other",
					10044
				    ),
				    new MemberListElement (
					"breathing-apparatus-support",
					10045
				    ),
				    new MemberListElement (
					"light-and-air-unit",
					10046
				    ),
				    new MemberListElement (
					"medical-rescue-unit-other",
					10054
				    ),
				    new MemberListElement (
					"rescue-unit",
					10055
				    ),
				    new MemberListElement (
					"urban-search-rescue-unit",
					10056
				    ),
				    new MemberListElement (
					"high-angle-rescue",
					10057
				    ),
				    new MemberListElement (
					"crash-fire-rescue",
					10058
				    ),
				    new MemberListElement (
					"bLS-unit",
					10059
				    ),
				    new MemberListElement (
					"aLS-unit",
					10060
				    ),
				    new MemberListElement (
					"mobile-command-post",
					10075
				    ),
				    new MemberListElement (
					"chief-officer-car",
					10076
				    ),
				    new MemberListElement (
					"hAZMAT-unit",
					10077
				    ),
				    new MemberListElement (
					"type-i-hand-crew",
					10078
				    ),
				    new MemberListElement (
					"type-ii-hand-crew",
					10079
				    ),
				    new MemberListElement (
					"privately-owned-vehicle",
					10083
				    ),
				    new MemberListElement (
					"other-apparatus-resource",
					10084
				    ),
				    new MemberListElement (
					"ambulance",
					10085
				    ),
				    new MemberListElement (
					"bomb-squad-van",
					10086
				    ),
				    new MemberListElement (
					"combine-harvester",
					10087
				    ),
				    new MemberListElement (
					"construction-vehicle",
					10088
				    ),
				    new MemberListElement (
					"farm-tractor",
					10089
				    ),
				    new MemberListElement (
					"grass-cutting-machines",
					10090
				    ),
				    new MemberListElement (
					"hAZMAT-containment-tow",
					10091
				    ),
				    new MemberListElement (
					"heavy-tow",
					10092
				    ),
				    new MemberListElement (
					"hedge-cutting-machines",
					10093
				    ),
				    new MemberListElement (
					"light-tow",
					10094
				    ),
				    new MemberListElement (
					"mobile-crane",
					10095
				    ),
				    new MemberListElement (
					"refuse-collection-vehicle",
					10096
				    ),
				    new MemberListElement (
					"resurfacing-vehicle",
					10097
				    ),
				    new MemberListElement (
					"road-sweeper",
					10098
				    ),
				    new MemberListElement (
					"roadside-litter-collection-crews",
					10099
				    ),
				    new MemberListElement (
					"salvage-vehicle",
					10100
				    ),
				    new MemberListElement (
					"sand-truck",
					10101
				    ),
				    new MemberListElement (
					"snowplow",
					10102
				    ),
				    new MemberListElement (
					"steam-roller",
					10103
				    ),
				    new MemberListElement (
					"swat-team-van",
					10104
				    ),
				    new MemberListElement (
					"track-laying-vehicle",
					10105
				    ),
				    new MemberListElement (
					"unknown-vehicle",
					10106
				    ),
				    new MemberListElement (
					"white-lining-vehicle",
					10107
				    ),
				    new MemberListElement (
					"dump-truck",
					10108
				    ),
				    new MemberListElement (
					"supervisor-vehicle",
					10109
				    ),
				    new MemberListElement (
					"snow-blower",
					10110
				    ),
				    new MemberListElement (
					"rotary-snow-blower",
					10111
				    ),
				    new MemberListElement (
					"road-grader",
					10112
				    ),
				    new MemberListElement (
					"steam-truck",
					10113
				    ),
				    new MemberListElement (
					"flatbed-tow",
					10114
				    ),
				    new MemberListElement (
					"survery-crews",
					10115
				    )
				}
			    ),
			    0,
			    dsrc.itis.IncidentResponseEquipment.ground_fire_suppression
			)
		    ),
		    "responseEquip",
		    8,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new EnumeratedInfo (
			    new Tags (
				new short[] {
				    (short)0x8009
				}
			    ),
			    new QName (
				"dsrc.itis",
				"ResponderGroupAffected"
			    ),
			    new QName (
				"ITIS",
				"ResponderGroupAffected"
			    ),
			    274454,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"emergency-vehicle-units",
					9729
				    ),
				    new MemberListElement (
					"federal-law-enforcement-units",
					9730
				    ),
				    new MemberListElement (
					"state-police-units",
					9731
				    ),
				    new MemberListElement (
					"county-police-units",
					9732
				    ),
				    new MemberListElement (
					"local-police-units",
					9733
				    ),
				    new MemberListElement (
					"ambulance-units",
					9734
				    ),
				    new MemberListElement (
					"rescue-units",
					9735
				    ),
				    new MemberListElement (
					"fire-units",
					9736
				    ),
				    new MemberListElement (
					"hAZMAT-units",
					9737
				    ),
				    new MemberListElement (
					"light-tow-unit",
					9738
				    ),
				    new MemberListElement (
					"heavy-tow-unit",
					9739
				    ),
				    new MemberListElement (
					"freeway-service-patrols",
					9740
				    ),
				    new MemberListElement (
					"transportation-response-units",
					9741
				    ),
				    new MemberListElement (
					"private-contractor-response-units",
					9742
				    ),
				    new MemberListElement (
					"private-tow-units",
					9743
				    )
				}
			    ),
			    0,
			    dsrc.itis.ResponderGroupAffected.emergency_vehicle_units
			)
		    ),
		    "responderType",
		    9,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "EmergencyVehicleAlert$Regional"
			)
		    ),
		    "regional",
		    10,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8005, 5),
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8006, 6),
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8007, 7),
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8008, 8),
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8009, 9),
			new TagDecoderElement((short)0x800a, 10)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x800a, 10)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' EmergencyVehicleAlert object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' EmergencyVehicleAlert object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for EmergencyVehicleAlert
