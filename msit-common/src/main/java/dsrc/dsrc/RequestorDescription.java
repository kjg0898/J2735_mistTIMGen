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
 * Define the ASN1 Type RequestorDescription from ASN1 Module DSRC.
 * @see Sequence
 */

public class RequestorDescription extends Sequence {
    
    /**
     * The default constructor.
     */
    public RequestorDescription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public RequestorDescription(VehicleID id, RequestorType type, 
		    RequestorPositionVector position, DescriptiveName name, 
		    DescriptiveName routeName, 
		    TransitVehicleStatus transitStatus, 
		    TransitVehicleOccupancy transitOccupancy, 
		    DeltaTime transitSchedule, Regional regional)
    {
	setId(id);
	setType(type);
	setPosition(position);
	setName(name);
	setRouteName(routeName);
	setTransitStatus(transitStatus);
	setTransitOccupancy(transitOccupancy);
	setTransitSchedule(transitSchedule);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public RequestorDescription(VehicleID id)
    {
	setId(id);
    }
    
    public void initComponents()
    {
	mComponents[0] = new VehicleID();
	mComponents[1] = new RequestorType();
	mComponents[2] = new RequestorPositionVector();
	mComponents[3] = new DescriptiveName();
	mComponents[4] = new DescriptiveName();
	mComponents[5] = new TransitVehicleStatus();
	mComponents[6] = TransitVehicleOccupancy.occupancyUnknown;
	mComponents[7] = new DeltaTime();
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
		return new VehicleID();
	    case 1:
		return new RequestorType();
	    case 2:
		return new RequestorPositionVector();
	    case 3:
		return new DescriptiveName();
	    case 4:
		return new DescriptiveName();
	    case 5:
		return new TransitVehicleStatus();
	    case 6:
		return TransitVehicleOccupancy.occupancyUnknown;
	    case 7:
		return new DeltaTime();
	    case 8:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "id"
    public VehicleID getId()
    {
	return (VehicleID)mComponents[0];
    }
    
    public void setId(VehicleID id)
    {
	mComponents[0] = id;
    }
    
    
    // Methods for field "type"
    public RequestorType getType()
    {
	return (RequestorType)mComponents[1];
    }
    
    public void setType(RequestorType type)
    {
	mComponents[1] = type;
    }
    
    public boolean hasType()
    {
	return componentIsPresent(1);
    }
    
    public void deleteType()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "position"
    public RequestorPositionVector getPosition()
    {
	return (RequestorPositionVector)mComponents[2];
    }
    
    public void setPosition(RequestorPositionVector position)
    {
	mComponents[2] = position;
    }
    
    public boolean hasPosition()
    {
	return componentIsPresent(2);
    }
    
    public void deletePosition()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "name"
    public DescriptiveName getName()
    {
	return (DescriptiveName)mComponents[3];
    }
    
    public void setName(DescriptiveName name)
    {
	mComponents[3] = name;
    }
    
    public boolean hasName()
    {
	return componentIsPresent(3);
    }
    
    public void deleteName()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "routeName"
    public DescriptiveName getRouteName()
    {
	return (DescriptiveName)mComponents[4];
    }
    
    public void setRouteName(DescriptiveName routeName)
    {
	mComponents[4] = routeName;
    }
    
    public boolean hasRouteName()
    {
	return componentIsPresent(4);
    }
    
    public void deleteRouteName()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "transitStatus"
    public TransitVehicleStatus getTransitStatus()
    {
	return (TransitVehicleStatus)mComponents[5];
    }
    
    public void setTransitStatus(TransitVehicleStatus transitStatus)
    {
	mComponents[5] = transitStatus;
    }
    
    public boolean hasTransitStatus()
    {
	return componentIsPresent(5);
    }
    
    public void deleteTransitStatus()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "transitOccupancy"
    public TransitVehicleOccupancy getTransitOccupancy()
    {
	return (TransitVehicleOccupancy)mComponents[6];
    }
    
    public void setTransitOccupancy(TransitVehicleOccupancy transitOccupancy)
    {
	mComponents[6] = transitOccupancy;
    }
    
    public boolean hasTransitOccupancy()
    {
	return componentIsPresent(6);
    }
    
    public void deleteTransitOccupancy()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "transitSchedule"
    public DeltaTime getTransitSchedule()
    {
	return (DeltaTime)mComponents[7];
    }
    
    public void setTransitSchedule(DeltaTime transitSchedule)
    {
	mComponents[7] = transitSchedule;
    }
    
    public boolean hasTransitSchedule()
    {
	return componentIsPresent(7);
    }
    
    public void deleteTransitSchedule()
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
		    "RequestorDescription$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_RequestorDescription,
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
					    dsrc.region.REGION.reg_RequestorDescription,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "RequestorDescription$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_RequestorDescription,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "RequestorDescription$Regional$Sequence_"
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
		"RequestorDescription$Regional"
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
		    "RequestorDescription$Regional$Sequence_"
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
	    "RequestorDescription"
	),
	new QName (
	    "DSRC",
	    "RequestorDescription"
	),
	274454,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ChoiceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    0,
		    2,
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
				"RequestorType"
			    ),
			    new QName (
				"DSRC",
				"RequestorType"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "RequestorType"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "RequestorType"
				)
			    ),
			    0
			)
		    ),
		    "type",
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
				"RequestorPositionVector"
			    ),
			    new QName (
				"DSRC",
				"RequestorPositionVector"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "RequestorPositionVector"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "RequestorPositionVector"
				)
			    ),
			    0
			)
		    ),
		    "position",
		    2,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new KMCStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
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
		    "routeName",
		    4,
		    3,
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
				"TransitVehicleStatus"
			    ),
			    new QName (
				"DSRC",
				"TransitVehicleStatus"
			    ),
			    274450,
			    new SizeConstraint (
				new SingleValueConstraint (
				    new INTEGER(8)
				)
			    ),
			    new Bounds (
				Long.valueOf(8),
				Long.valueOf(8)
			    ),
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"loading",
					0
				    ),
				    new MemberListElement (
					"anADAuse",
					1
				    ),
				    new MemberListElement (
					"aBikeLoad",
					2
				    ),
				    new MemberListElement (
					"doorOpen",
					3
				    ),
				    new MemberListElement (
					"charging",
					4
				    ),
				    new MemberListElement (
					"atStopLine",
					5
				    )
				}
			    )
			)
		    ),
		    "transitStatus",
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
				"TransitVehicleOccupancy"
			    ),
			    new QName (
				"DSRC",
				"TransitVehicleOccupancy"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"occupancyUnknown",
					0
				    ),
				    new MemberListElement (
					"occupancyEmpty",
					1
				    ),
				    new MemberListElement (
					"occupancyVeryLow",
					2
				    ),
				    new MemberListElement (
					"occupancyLow",
					3
				    ),
				    new MemberListElement (
					"occupancyMed",
					4
				    ),
				    new MemberListElement (
					"occupancyHigh",
					5
				    ),
				    new MemberListElement (
					"occupancyNearlyFull",
					6
				    ),
				    new MemberListElement (
					"occupancyFull",
					7
				    )
				}
			    ),
			    0,
			    TransitVehicleOccupancy.occupancyUnknown
			)
		    ),
		    "transitOccupancy",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8007
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DeltaTime"
			    ),
			    new QName (
				"DSRC",
				"DeltaTime"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaTime(-122), 
				    new DeltaTime(121),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-122),
				Long.valueOf(121)
			    ),
			    null
			)
		    ),
		    "transitSchedule",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "RequestorDescription$Regional"
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
			new TagDecoderElement((short)0x8000, 0)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
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
     * Get the type descriptor (TypeInfo) of 'this' RequestorDescription object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' RequestorDescription object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for RequestorDescription
