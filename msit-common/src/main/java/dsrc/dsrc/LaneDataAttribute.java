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
 * Define the ASN1 Type LaneDataAttribute from ASN1 Module DSRC.
 * @see Choice
 */

public class LaneDataAttribute extends Choice {
    
    /**
     * The default constructor.
     */
    public LaneDataAttribute()
    {
    }
    
    public static final  int  pathEndPointAngle_chosen = 1;
    public static final  int  laneCrownPointCenter_chosen = 2;
    public static final  int  laneCrownPointLeft_chosen = 3;
    public static final  int  laneCrownPointRight_chosen = 4;
    public static final  int  laneAngle_chosen = 5;
    public static final  int  speedLimits_chosen = 6;
    public static final  int  regional_chosen = 7;
    
    // Methods for field "pathEndPointAngle"
    public static LaneDataAttribute createLaneDataAttributeWithPathEndPointAngle(long pathEndPointAngle)
    {
	return createLaneDataAttributeWithPathEndPointAngle(new DeltaAngle(pathEndPointAngle));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithPathEndPointAngle(DeltaAngle pathEndPointAngle)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setPathEndPointAngle(pathEndPointAngle);
	return __object;
    }
    
    public boolean hasPathEndPointAngle()
    {
	return getChosenFlag() == pathEndPointAngle_chosen;
    }
    
    public DeltaAngle getPathEndPointAngle()
    {
	if (hasPathEndPointAngle())
	    return (DeltaAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setPathEndPointAngle(long pathEndPointAngle)
    {
	setPathEndPointAngle(new DeltaAngle(pathEndPointAngle));
    }
    
    public void setPathEndPointAngle(DeltaAngle pathEndPointAngle)
    {
	setChosenValue(pathEndPointAngle);
	setChosenFlag(pathEndPointAngle_chosen);
    }
    
    
    // Methods for field "laneCrownPointCenter"
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointCenter(long laneCrownPointCenter)
    {
	return createLaneDataAttributeWithLaneCrownPointCenter(new RoadwayCrownAngle(laneCrownPointCenter));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointCenter(RoadwayCrownAngle laneCrownPointCenter)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setLaneCrownPointCenter(laneCrownPointCenter);
	return __object;
    }
    
    public boolean hasLaneCrownPointCenter()
    {
	return getChosenFlag() == laneCrownPointCenter_chosen;
    }
    
    public RoadwayCrownAngle getLaneCrownPointCenter()
    {
	if (hasLaneCrownPointCenter())
	    return (RoadwayCrownAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setLaneCrownPointCenter(long laneCrownPointCenter)
    {
	setLaneCrownPointCenter(new RoadwayCrownAngle(laneCrownPointCenter));
    }
    
    public void setLaneCrownPointCenter(RoadwayCrownAngle laneCrownPointCenter)
    {
	setChosenValue(laneCrownPointCenter);
	setChosenFlag(laneCrownPointCenter_chosen);
    }
    
    
    // Methods for field "laneCrownPointLeft"
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointLeft(long laneCrownPointLeft)
    {
	return createLaneDataAttributeWithLaneCrownPointLeft(new RoadwayCrownAngle(laneCrownPointLeft));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointLeft(RoadwayCrownAngle laneCrownPointLeft)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setLaneCrownPointLeft(laneCrownPointLeft);
	return __object;
    }
    
    public boolean hasLaneCrownPointLeft()
    {
	return getChosenFlag() == laneCrownPointLeft_chosen;
    }
    
    public RoadwayCrownAngle getLaneCrownPointLeft()
    {
	if (hasLaneCrownPointLeft())
	    return (RoadwayCrownAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setLaneCrownPointLeft(long laneCrownPointLeft)
    {
	setLaneCrownPointLeft(new RoadwayCrownAngle(laneCrownPointLeft));
    }
    
    public void setLaneCrownPointLeft(RoadwayCrownAngle laneCrownPointLeft)
    {
	setChosenValue(laneCrownPointLeft);
	setChosenFlag(laneCrownPointLeft_chosen);
    }
    
    
    // Methods for field "laneCrownPointRight"
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointRight(long laneCrownPointRight)
    {
	return createLaneDataAttributeWithLaneCrownPointRight(new RoadwayCrownAngle(laneCrownPointRight));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithLaneCrownPointRight(RoadwayCrownAngle laneCrownPointRight)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setLaneCrownPointRight(laneCrownPointRight);
	return __object;
    }
    
    public boolean hasLaneCrownPointRight()
    {
	return getChosenFlag() == laneCrownPointRight_chosen;
    }
    
    public RoadwayCrownAngle getLaneCrownPointRight()
    {
	if (hasLaneCrownPointRight())
	    return (RoadwayCrownAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setLaneCrownPointRight(long laneCrownPointRight)
    {
	setLaneCrownPointRight(new RoadwayCrownAngle(laneCrownPointRight));
    }
    
    public void setLaneCrownPointRight(RoadwayCrownAngle laneCrownPointRight)
    {
	setChosenValue(laneCrownPointRight);
	setChosenFlag(laneCrownPointRight_chosen);
    }
    
    
    // Methods for field "laneAngle"
    public static LaneDataAttribute createLaneDataAttributeWithLaneAngle(long laneAngle)
    {
	return createLaneDataAttributeWithLaneAngle(new MergeDivergeNodeAngle(laneAngle));
    }
    
    public static LaneDataAttribute createLaneDataAttributeWithLaneAngle(MergeDivergeNodeAngle laneAngle)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setLaneAngle(laneAngle);
	return __object;
    }
    
    public boolean hasLaneAngle()
    {
	return getChosenFlag() == laneAngle_chosen;
    }
    
    public MergeDivergeNodeAngle getLaneAngle()
    {
	if (hasLaneAngle())
	    return (MergeDivergeNodeAngle)mChosenValue;
	else
	    return null;
    }
    
    public void setLaneAngle(long laneAngle)
    {
	setLaneAngle(new MergeDivergeNodeAngle(laneAngle));
    }
    
    public void setLaneAngle(MergeDivergeNodeAngle laneAngle)
    {
	setChosenValue(laneAngle);
	setChosenFlag(laneAngle_chosen);
    }
    
    
    // Methods for field "speedLimits"
    public static LaneDataAttribute createLaneDataAttributeWithSpeedLimits(SpeedLimitList speedLimits)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setSpeedLimits(speedLimits);
	return __object;
    }
    
    public boolean hasSpeedLimits()
    {
	return getChosenFlag() == speedLimits_chosen;
    }
    
    public SpeedLimitList getSpeedLimits()
    {
	if (hasSpeedLimits())
	    return (SpeedLimitList)mChosenValue;
	else
	    return null;
    }
    
    public void setSpeedLimits(SpeedLimitList speedLimits)
    {
	setChosenValue(speedLimits);
	setChosenFlag(speedLimits_chosen);
    }
    
    
    // Methods for field "regional"
    public static LaneDataAttribute createLaneDataAttributeWithRegional(Regional regional)
    {
	LaneDataAttribute __object = new LaneDataAttribute();

	__object.setRegional(regional);
	return __object;
    }
    
    public boolean hasRegional()
    {
	return getChosenFlag() == regional_chosen;
    }
    
    public Regional getRegional()
    {
	if (hasRegional())
	    return (Regional)mChosenValue;
	else
	    return null;
    }
    
    public void setRegional(Regional regional)
    {
	setChosenValue(regional);
	setChosenFlag(regional_chosen);
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
		    "LaneDataAttribute$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_LaneDataAttribute,
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
					    dsrc.region.REGION.reg_LaneDataAttribute,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "LaneDataAttribute$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_LaneDataAttribute,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "LaneDataAttribute$Regional$Sequence_"
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
		    (short)0x8006
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"LaneDataAttribute$Regional"
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
		    "LaneDataAttribute$Regional$Sequence_"
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

    // Method to create a specific choice instance
    public AbstractData createInstance(int chosen)
    {
	switch (chosen) {
	    case pathEndPointAngle_chosen:
		return new DeltaAngle();
	    case laneCrownPointCenter_chosen:
		return new RoadwayCrownAngle();
	    case laneCrownPointLeft_chosen:
		return new RoadwayCrownAngle();
	    case laneCrownPointRight_chosen:
		return new RoadwayCrownAngle();
	    case laneAngle_chosen:
		return new MergeDivergeNodeAngle();
	    case speedLimits_chosen:
		return new SpeedLimitList();
	    case regional_chosen:
		return new Regional();
	    default:
		throw new InternalError("Choice.createInstance()");
	}
	
    }
    
    /**
     * Initialize the type descriptor.
     */
    private static final ChoiceInfo c_typeinfo = new ChoiceInfo (
	new Tags (
	    null
	),
	new QName (
	    "dsrc.dsrc",
	    "LaneDataAttribute"
	),
	new QName (
	    "DSRC",
	    "LaneDataAttribute"
	),
	274454,
	null,
	new FieldsDict (
	    new FieldInfo[] {
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"DeltaAngle"
			    ),
			    new QName (
				"DSRC",
				"DeltaAngle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new DeltaAngle(-150), 
				    new DeltaAngle(150),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-150),
				Long.valueOf(150)
			    ),
			    null
			)
		    ),
		    "pathEndPointAngle",
		    0,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8001
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RoadwayCrownAngle"
			    ),
			    new QName (
				"DSRC",
				"RoadwayCrownAngle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RoadwayCrownAngle(-128), 
				    new RoadwayCrownAngle(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-128),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "laneCrownPointCenter",
		    1,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RoadwayCrownAngle"
			    ),
			    new QName (
				"DSRC",
				"RoadwayCrownAngle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RoadwayCrownAngle(-128), 
				    new RoadwayCrownAngle(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-128),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "laneCrownPointLeft",
		    2,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8003
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"RoadwayCrownAngle"
			    ),
			    new QName (
				"DSRC",
				"RoadwayCrownAngle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new RoadwayCrownAngle(-128), 
				    new RoadwayCrownAngle(127),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-128),
				Long.valueOf(127)
			    ),
			    null
			)
		    ),
		    "laneCrownPointRight",
		    3,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"MergeDivergeNodeAngle"
			    ),
			    new QName (
				"DSRC",
				"MergeDivergeNodeAngle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new MergeDivergeNodeAngle(-180), 
				    new MergeDivergeNodeAngle(180),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-180),
				Long.valueOf(180)
			    ),
			    null
			)
		    ),
		    "laneAngle",
		    4,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new ContainerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"SpeedLimitList"
			    ),
			    new QName (
				"DSRC",
				"SpeedLimitList"
			    ),
			    274450,
			    new SizeConstraint (
				new ValueRangeConstraint (
				    new AbstractBounds(
					new INTEGER(1),
					new INTEGER(9),
					0
				    )
				)
			    ),
			    new Bounds (
				Long.valueOf(1),
				Long.valueOf(9)
			    ),
			    new TypeInfoRef (
				new QName (
				    "dsrc.dsrc",
				    "RegulatorySpeedLimit"
				)
			    )
			)
		    ),
		    "speedLimits",
		    5,
		    2
		),
		new FieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "LaneDataAttribute$Regional"
			)
		    ),
		    "regional",
		    6,
		    2
		)
	    }
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
		new TagDecoderElement((short)0x8006, 6)
	    }
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' LaneDataAttribute object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' LaneDataAttribute object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Check the current selection on unknown extension
     */
    public final boolean hasUnknownExtension()
    {
	return getChosenFlag() > 7;
    }
    
} // End class definition for LaneDataAttribute
