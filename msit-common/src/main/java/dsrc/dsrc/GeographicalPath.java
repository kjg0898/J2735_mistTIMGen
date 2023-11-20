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
 * Define the ASN1 Type GeographicalPath from ASN1 Module DSRC.
 * @see Sequence
 */

public class GeographicalPath extends Sequence {
    
    /**
     * The default constructor.
     */
    public GeographicalPath()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public GeographicalPath(DescriptiveName name, RoadSegmentReferenceID id, 
		    Position3D anchor, LaneWidth laneWidth, 
		    DirectionOfUse directionality, BOOLEAN closedPath, 
		    HeadingSlice direction, Description description, 
		    Regional regional)
    {
	setName(name);
	setId(id);
	setAnchor(anchor);
	setLaneWidth(laneWidth);
	setDirectionality(directionality);
	setClosedPath(closedPath);
	setDirection(direction);
	setDescription(description);
	setRegional(regional);
    }
    
    /**
     * Construct with components.
     */
    public GeographicalPath(DescriptiveName name, RoadSegmentReferenceID id, 
		    Position3D anchor, LaneWidth laneWidth, 
		    DirectionOfUse directionality, boolean closedPath, 
		    HeadingSlice direction, Description description, 
		    Regional regional)
    {
	this(name, id, anchor, laneWidth, directionality, 
	     new BOOLEAN(closedPath), direction, description, regional);
    }
    
    public void initComponents()
    {
	mComponents[0] = new DescriptiveName();
	mComponents[1] = new RoadSegmentReferenceID();
	mComponents[2] = new Position3D();
	mComponents[3] = new LaneWidth();
	mComponents[4] = DirectionOfUse.unavailable;
	mComponents[5] = new BOOLEAN();
	mComponents[6] = new HeadingSlice();
	mComponents[7] = new Description();
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
		return new DescriptiveName();
	    case 1:
		return new RoadSegmentReferenceID();
	    case 2:
		return new Position3D();
	    case 3:
		return new LaneWidth();
	    case 4:
		return DirectionOfUse.unavailable;
	    case 5:
		return new BOOLEAN();
	    case 6:
		return new HeadingSlice();
	    case 7:
		return new Description();
	    case 8:
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
    public RoadSegmentReferenceID getId()
    {
	return (RoadSegmentReferenceID)mComponents[1];
    }
    
    public void setId(RoadSegmentReferenceID id)
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
    
    
    // Methods for field "anchor"
    public Position3D getAnchor()
    {
	return (Position3D)mComponents[2];
    }
    
    public void setAnchor(Position3D anchor)
    {
	mComponents[2] = anchor;
    }
    
    public boolean hasAnchor()
    {
	return componentIsPresent(2);
    }
    
    public void deleteAnchor()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "laneWidth"
    public LaneWidth getLaneWidth()
    {
	return (LaneWidth)mComponents[3];
    }
    
    public void setLaneWidth(LaneWidth laneWidth)
    {
	mComponents[3] = laneWidth;
    }
    
    public boolean hasLaneWidth()
    {
	return componentIsPresent(3);
    }
    
    public void deleteLaneWidth()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "directionality"
    public DirectionOfUse getDirectionality()
    {
	return (DirectionOfUse)mComponents[4];
    }
    
    public void setDirectionality(DirectionOfUse directionality)
    {
	mComponents[4] = directionality;
    }
    
    public boolean hasDirectionality()
    {
	return componentIsPresent(4);
    }
    
    public void deleteDirectionality()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "closedPath"
    public boolean getClosedPath()
    {
	return ((BOOLEAN)mComponents[5]).booleanValue();
    }
    
    public void setClosedPath(boolean closedPath)
    {
	setClosedPath(new BOOLEAN(closedPath));
    }
    
    public void setClosedPath(BOOLEAN closedPath)
    {
	mComponents[5] = closedPath;
    }
    
    public boolean hasClosedPath()
    {
	return componentIsPresent(5);
    }
    
    public void deleteClosedPath()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "direction"
    public HeadingSlice getDirection()
    {
	return (HeadingSlice)mComponents[6];
    }
    
    public void setDirection(HeadingSlice direction)
    {
	mComponents[6] = direction;
    }
    
    public boolean hasDirection()
    {
	return componentIsPresent(6);
    }
    
    public void deleteDirection()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "description"
    public Description getDescription()
    {
	return (Description)mComponents[7];
    }
    
    public void setDescription(Description description)
    {
	mComponents[7] = description;
    }
    
    public boolean hasDescription()
    {
	return componentIsPresent(7);
    }
    
    public void deleteDescription()
    {
	setComponentAbsent(7);
    }
    
    
    
    /**
     * Define the ASN1 Type Description from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Description extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Description()
	{
	}
	
	public static final  int  path_chosen = 1;
	public static final  int  geometry_chosen = 2;
	public static final  int  oldRegion_chosen = 3;
	
	// Methods for field "path"
	public static Description createDescriptionWithPath(OffsetSystem path)
	{
	    Description __object = new Description();

	    __object.setPath(path);
	    return __object;
	}
	
	public boolean hasPath()
	{
	    return getChosenFlag() == path_chosen;
	}
	
	public OffsetSystem getPath()
	{
	    if (hasPath())
		return (OffsetSystem)mChosenValue;
	    else
		return null;
	}
	
	public void setPath(OffsetSystem path)
	{
	    setChosenValue(path);
	    setChosenFlag(path_chosen);
	}
	
	
	// Methods for field "geometry"
	public static Description createDescriptionWithGeometry(GeometricProjection geometry)
	{
	    Description __object = new Description();

	    __object.setGeometry(geometry);
	    return __object;
	}
	
	public boolean hasGeometry()
	{
	    return getChosenFlag() == geometry_chosen;
	}
	
	public GeometricProjection getGeometry()
	{
	    if (hasGeometry())
		return (GeometricProjection)mChosenValue;
	    else
		return null;
	}
	
	public void setGeometry(GeometricProjection geometry)
	{
	    setChosenValue(geometry);
	    setChosenFlag(geometry_chosen);
	}
	
	
	// Methods for field "oldRegion"
	public static Description createDescriptionWithOldRegion(ValidRegion oldRegion)
	{
	    Description __object = new Description();

	    __object.setOldRegion(oldRegion);
	    return __object;
	}
	
	public boolean hasOldRegion()
	{
	    return getChosenFlag() == oldRegion_chosen;
	}
	
	public ValidRegion getOldRegion()
	{
	    if (hasOldRegion())
		return (ValidRegion)mChosenValue;
	    else
		return null;
	}
	
	public void setOldRegion(ValidRegion oldRegion)
	{
	    setChosenValue(oldRegion);
	    setChosenFlag(oldRegion_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case path_chosen:
		    return new OffsetSystem();
		case geometry_chosen:
		    return new GeometricProjection();
		case oldRegion_chosen:
		    return new ValidRegion();
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
		    (short)0x8007
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"GeographicalPath$Description"
	    ),
	    new QName (
		"builtin",
		"CHOICE"
	    ),
	    274454,
	    null,
	    new FieldsDict (
		new FieldInfo[] {
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "OffsetSystem"
				),
				new QName (
				    "DSRC",
				    "OffsetSystem"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"OffsetSystem"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"OffsetSystem"
				    )
				),
				0
			    )
			),
			"path",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "GeometricProjection"
				),
				new QName (
				    "DSRC",
				    "GeometricProjection"
				),
				274454,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"GeometricProjection"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"GeometricProjection"
				    )
				),
				0
			    )
			),
			"geometry",
			1,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8002
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "ValidRegion"
				),
				new QName (
				    "DSRC",
				    "ValidRegion"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"ValidRegion"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"ValidRegion"
				    )
				),
				0
			    )
			),
			"oldRegion",
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
	 * Get the type descriptor (TypeInfo) of 'this' Description object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Description object.
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
	    return getChosenFlag() > 3;
	}
	
    } // End class definition for Description

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
		    "GeographicalPath$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_GeographicalPath,
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
					    dsrc.region.REGION.reg_GeographicalPath,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "GeographicalPath$Regional$Sequence_"
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
					    dsrc.region.REGION.reg_GeographicalPath,
					    1
					),
					new ComponentRelations (
					    new ComponentRelation[] {
						new ComponentRelation (
						    0,
						    new FieldInfoRef (
							new QName (
							    "dsrc.dsrc",
							    "GeographicalPath$Regional$Sequence_"
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
		"GeographicalPath$Regional"
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
		    "GeographicalPath$Regional$Sequence_"
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
	    "GeographicalPath"
	),
	new QName (
	    "DSRC",
	    "GeographicalPath"
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
				"RoadSegmentReferenceID"
			    ),
			    new QName (
				"DSRC",
				"RoadSegmentReferenceID"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "RoadSegmentReferenceID"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "RoadSegmentReferenceID"
				)
			    ),
			    0
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
				"Position3D"
			    ),
			    new QName (
				"DSRC",
				"Position3D"
			    ),
			    274454,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "Position3D"
				)
			    ),
			    0
			)
		    ),
		    "anchor",
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
				"LaneWidth"
			    ),
			    new QName (
				"DSRC",
				"LaneWidth"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new LaneWidth(0), 
				    new LaneWidth(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "laneWidth",
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
				"DirectionOfUse"
			    ),
			    new QName (
				"DSRC",
				"DirectionOfUse"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"unavailable",
					0
				    ),
				    new MemberListElement (
					"forward",
					1
				    ),
				    new MemberListElement (
					"reverse",
					2
				    ),
				    new MemberListElement (
					"both",
					3
				    )
				}
			    ),
			    0,
			    DirectionOfUse.unavailable
			)
		    ),
		    "directionality",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"BOOLEAN"
			    ),
			    new QName (
				"builtin",
				"BOOLEAN"
			    ),
			    274450,
			    null
			)
		    ),
		    "closedPath",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new BitStringInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"HeadingSlice"
			    ),
			    new QName (
				"DSRC",
				"HeadingSlice"
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
					"from000-0to022-5degrees",
					0
				    ),
				    new MemberListElement (
					"from022-5to045-0degrees",
					1
				    ),
				    new MemberListElement (
					"from045-0to067-5degrees",
					2
				    ),
				    new MemberListElement (
					"from067-5to090-0degrees",
					3
				    ),
				    new MemberListElement (
					"from090-0to112-5degrees",
					4
				    ),
				    new MemberListElement (
					"from112-5to135-0degrees",
					5
				    ),
				    new MemberListElement (
					"from135-0to157-5degrees",
					6
				    ),
				    new MemberListElement (
					"from157-5to180-0degrees",
					7
				    ),
				    new MemberListElement (
					"from180-0to202-5degrees",
					8
				    ),
				    new MemberListElement (
					"from202-5to225-0degrees",
					9
				    ),
				    new MemberListElement (
					"from225-0to247-5degrees",
					10
				    ),
				    new MemberListElement (
					"from247-5to270-0degrees",
					11
				    ),
				    new MemberListElement (
					"from270-0to292-5degrees",
					12
				    ),
				    new MemberListElement (
					"from292-5to315-0degrees",
					13
				    ),
				    new MemberListElement (
					"from315-0to337-5degrees",
					14
				    ),
				    new MemberListElement (
					"from337-5to360-0degrees",
					15
				    )
				}
			    )
			)
		    ),
		    "direction",
		    6,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "GeographicalPath$Description"
			)
		    ),
		    "description",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "GeographicalPath$Regional"
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
			new TagDecoderElement((short)0x8000, 0),
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
     * Get the type descriptor (TypeInfo) of 'this' GeographicalPath object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' GeographicalPath object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for GeographicalPath
