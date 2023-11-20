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
 * Define the ASN1 Type VehicleIdent from ASN1 Module DSRC.
 * @see Sequence
 */

public class VehicleIdent extends Sequence {
    
    /**
     * The default constructor.
     */
    public VehicleIdent()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public VehicleIdent(DescriptiveName name, VINstring vin, 
		    IA5String ownerCode, VehicleID id, 
		    VehicleType vehicleType, VehicleClass vehicleClass)
    {
	setName(name);
	setVin(vin);
	setOwnerCode(ownerCode);
	setId(id);
	setVehicleType(vehicleType);
	setVehicleClass(vehicleClass);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DescriptiveName();
	mComponents[1] = new VINstring();
	mComponents[2] = new IA5String();
	mComponents[3] = new VehicleID();
	mComponents[4] = VehicleType.none;
	mComponents[5] = new VehicleClass();
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
		return new DescriptiveName();
	    case 1:
		return new VINstring();
	    case 2:
		return new IA5String();
	    case 3:
		return new VehicleID();
	    case 4:
		return VehicleType.none;
	    case 5:
		return new VehicleClass();
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
    
    
    // Methods for field "vin"
    public VINstring getVin()
    {
	return (VINstring)mComponents[1];
    }
    
    public void setVin(VINstring vin)
    {
	mComponents[1] = vin;
    }
    
    public boolean hasVin()
    {
	return componentIsPresent(1);
    }
    
    public void deleteVin()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "ownerCode"
    public IA5String getOwnerCode()
    {
	return (IA5String)mComponents[2];
    }
    
    public void setOwnerCode(IA5String ownerCode)
    {
	mComponents[2] = ownerCode;
    }
    
    public boolean hasOwnerCode()
    {
	return componentIsPresent(2);
    }
    
    public void deleteOwnerCode()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "id"
    public VehicleID getId()
    {
	return (VehicleID)mComponents[3];
    }
    
    public void setId(VehicleID id)
    {
	mComponents[3] = id;
    }
    
    public boolean hasId()
    {
	return componentIsPresent(3);
    }
    
    public void deleteId()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "vehicleType"
    public VehicleType getVehicleType()
    {
	return (VehicleType)mComponents[4];
    }
    
    public void setVehicleType(VehicleType vehicleType)
    {
	mComponents[4] = vehicleType;
    }
    
    public boolean hasVehicleType()
    {
	return componentIsPresent(4);
    }
    
    public void deleteVehicleType()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "vehicleClass"
    public VehicleClass getVehicleClass()
    {
	return (VehicleClass)mComponents[5];
    }
    
    public void setVehicleClass(VehicleClass vehicleClass)
    {
	mComponents[5] = vehicleClass;
    }
    
    public boolean hasVehicleClass()
    {
	return componentIsPresent(5);
    }
    
    public void deleteVehicleClass()
    {
	setComponentAbsent(5);
    }
    
    
    
    /**
     * Define the ASN1 Type VehicleClass from ASN1 Module DSRC.
     * @see Choice
     */
    public static class VehicleClass extends Choice {
	
	/**
	 * The default constructor.
	 */
	public VehicleClass()
	{
	}
	
	public static final  int  vGroup_chosen = 1;
	public static final  int  rGroup_chosen = 2;
	public static final  int  rEquip_chosen = 3;
	
	// Methods for field "vGroup"
	public static VehicleClass createVehicleClassWithVGroup(dsrc.itis.VehicleGroupAffected vGroup)
	{
	    VehicleClass __object = new VehicleClass();

	    __object.setVGroup(vGroup);
	    return __object;
	}
	
	public boolean hasVGroup()
	{
	    return getChosenFlag() == vGroup_chosen;
	}
	
	public dsrc.itis.VehicleGroupAffected getVGroup()
	{
	    if (hasVGroup())
		return (dsrc.itis.VehicleGroupAffected)mChosenValue;
	    else
		return null;
	}
	
	public void setVGroup(dsrc.itis.VehicleGroupAffected vGroup)
	{
	    setChosenValue(vGroup);
	    setChosenFlag(vGroup_chosen);
	}
	
	
	// Methods for field "rGroup"
	public static VehicleClass createVehicleClassWithRGroup(dsrc.itis.ResponderGroupAffected rGroup)
	{
	    VehicleClass __object = new VehicleClass();

	    __object.setRGroup(rGroup);
	    return __object;
	}
	
	public boolean hasRGroup()
	{
	    return getChosenFlag() == rGroup_chosen;
	}
	
	public dsrc.itis.ResponderGroupAffected getRGroup()
	{
	    if (hasRGroup())
		return (dsrc.itis.ResponderGroupAffected)mChosenValue;
	    else
		return null;
	}
	
	public void setRGroup(dsrc.itis.ResponderGroupAffected rGroup)
	{
	    setChosenValue(rGroup);
	    setChosenFlag(rGroup_chosen);
	}
	
	
	// Methods for field "rEquip"
	public static VehicleClass createVehicleClassWithREquip(dsrc.itis.IncidentResponseEquipment rEquip)
	{
	    VehicleClass __object = new VehicleClass();

	    __object.setREquip(rEquip);
	    return __object;
	}
	
	public boolean hasREquip()
	{
	    return getChosenFlag() == rEquip_chosen;
	}
	
	public dsrc.itis.IncidentResponseEquipment getREquip()
	{
	    if (hasREquip())
		return (dsrc.itis.IncidentResponseEquipment)mChosenValue;
	    else
		return null;
	}
	
	public void setREquip(dsrc.itis.IncidentResponseEquipment rEquip)
	{
	    setChosenValue(rEquip);
	    setChosenFlag(rEquip_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case vGroup_chosen:
		    return dsrc.itis.VehicleGroupAffected.all_vehicles;
		case rGroup_chosen:
		    return dsrc.itis.ResponderGroupAffected.emergency_vehicle_units;
		case rEquip_chosen:
		    return dsrc.itis.IncidentResponseEquipment.ground_fire_suppression;
		default:
		    throw new InternalError("Choice.createInstance()");
	    }
	    
	}
	
	/**
	 * Initialize the type descriptor.
	 */
	private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	    new Tags (
		new short[] {
		    (short)0x8005
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"VehicleIdent$VehicleClass"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    274450,
	    null,
	    new FieldsDict (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8000
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
			"vGroup",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8001
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
			"rGroup",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new EnumeratedInfo (
				new Tags (
				    new short[] {
					(short)0x8002
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
			"rEquip",
			2,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1),
		    new TagDecoderElement((short)0x8002, 2)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' VehicleClass object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' VehicleClass object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for VehicleClass

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
	    "VehicleIdent"
	),
	new QName (
	    "DSRC",
	    "VehicleIdent"
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
			new VectorInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VINstring"
			    ),
			    new QName (
				"DSRC",
				"VINstring"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(17),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(17)
			    )
			)
		    ),
		    "vin",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"IA5String"
			    ),
			    new QName (
				"builtin",
				"IA5String"
			    ),
			    274450,
			    new Intersection (
				new SizeConstraint (
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new INTEGER(1),
					    new INTEGER(32),
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
				Long.valueOf(32)
			    ),
			    IA5StringPAInfo.paInfo
			)
		    ),
		    "ownerCode",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"VehicleID"
			    ),
			    new QName (
				"DSRC",
				"VehicleID"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "VehicleID"
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
		    "id",
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
		    "vehicleType",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "VehicleIdent$VehicleClass"
			)
		    ),
		    "vehicleClass",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4),
			new TagDecoderElement((short)0x8005, 5)
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
     * Get the type descriptor (TypeInfo) of 'this' VehicleIdent object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' VehicleIdent object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for VehicleIdent
