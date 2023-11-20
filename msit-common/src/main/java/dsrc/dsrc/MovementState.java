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
 * Define the ASN1 Type MovementState from ASN1 Module DSRC.
 * @see Sequence
 */

public class MovementState extends Sequence {
    
    /**
     * The default constructor.
     */
    public MovementState()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public MovementState(DescriptiveName movementName, 
		    SignalGroupID signalGroup, 
		    MovementEventList state_time_speed, 
		    ManeuverAssistList maneuverAssistList, Regional regional)
    {
	setMovementName(movementName);
	setSignalGroup(signalGroup);
	setState_time_speed(state_time_speed);
	setManeuverAssistList(maneuverAssistList);
	setRegional(regional);
    }
    
    /**
     * Construct with required components.
     */
    public MovementState(SignalGroupID signalGroup, 
		    MovementEventList state_time_speed)
    {
	setSignalGroup(signalGroup);
	setState_time_speed(state_time_speed);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DescriptiveName();
	mComponents[1] = new SignalGroupID();
	mComponents[2] = new MovementEventList();
	mComponents[3] = new ManeuverAssistList();
	mComponents[4] = new Regional();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[5];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new DescriptiveName();
	    case 1:
		return new SignalGroupID();
	    case 2:
		return new MovementEventList();
	    case 3:
		return new ManeuverAssistList();
	    case 4:
		return new Regional();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "movementName"
    public DescriptiveName getMovementName()
    {
	return (DescriptiveName)mComponents[0];
    }
    
    public void setMovementName(DescriptiveName movementName)
    {
	mComponents[0] = movementName;
    }
    
    public boolean hasMovementName()
    {
	return componentIsPresent(0);
    }
    
    public void deleteMovementName()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "signalGroup"
    public SignalGroupID getSignalGroup()
    {
	return (SignalGroupID)mComponents[1];
    }
    
    public void setSignalGroup(SignalGroupID signalGroup)
    {
	mComponents[1] = signalGroup;
    }
    
    
    // Methods for field "state_time_speed"
    public MovementEventList getState_time_speed()
    {
	return (MovementEventList)mComponents[2];
    }
    
    public void setState_time_speed(MovementEventList state_time_speed)
    {
	mComponents[2] = state_time_speed;
    }
    
    
    // Methods for field "maneuverAssistList"
    public ManeuverAssistList getManeuverAssistList()
    {
	return (ManeuverAssistList)mComponents[3];
    }
    
    public void setManeuverAssistList(ManeuverAssistList maneuverAssistList)
    {
	mComponents[3] = maneuverAssistList;
    }
    
    public boolean hasManeuverAssistList()
    {
	return componentIsPresent(3);
    }
    
    public void deleteManeuverAssistList()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "regional"
    public Regional getRegional()
    {
	return (Regional)mComponents[4];
    }
    
    public void setRegional(Regional regional)
    {
	mComponents[4] = regional;
    }
    
    public boolean hasRegional()
    {
	return componentIsPresent(4);
    }
    
    public void deleteRegional()
    {
	setComponentAbsent(4);
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
		    "MovementState$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_MovementState,
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
					    dsrc.region.REGION.reg_MovementState,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "MovementState$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_MovementState,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "MovementState$Regional$Sequence_"
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
		    (short)0x8004
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"MovementState$Regional"
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
		    "MovementState$Regional$Sequence_"
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
	    "MovementState"
	),
	new QName (
	    "DSRC",
	    "MovementState"
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
		    "movementName",
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
				"SignalGroupID"
			    ),
			    new QName (
				"DSRC",
				"SignalGroupID"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new SignalGroupID(0), 
				    new SignalGroupID(255),
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
		    "signalGroup",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MovementEventList"
			    ),
			    new QName (
				"DSRC",
				"MovementEventList"
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
				    "MovementEvent"
				)
			    )
			)
		    ),
		    "state-time-speed",
		    2,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
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
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "MovementState$Regional"
			)
		    ),
		    "regional",
		    4,
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
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8004, 4)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' MovementState object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' MovementState object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for MovementState
