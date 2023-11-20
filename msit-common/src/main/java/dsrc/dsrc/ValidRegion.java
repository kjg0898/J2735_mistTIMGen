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
import com.oss.asn1.Choice;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ValidRegion from ASN1 Module DSRC.
 * @see Sequence
 */

public class ValidRegion extends Sequence {
    
    /**
     * The default constructor.
     */
    public ValidRegion()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public ValidRegion(HeadingSlice direction, Extent extent, Area area)
    {
	setDirection(direction);
	setExtent(extent);
	setArea(area);
    }
    
    /**
     * Construct with required components.
     */
    public ValidRegion(HeadingSlice direction, Area area)
    {
	setDirection(direction);
	setArea(area);
    }
    
    public void initComponents()
    {
	mComponents[0] = new HeadingSlice();
	mComponents[1] = Extent.useInstantlyOnly;
	mComponents[2] = new Area();
    }
    
    // Instance initializer
    {
	mComponents = new AbstractData[3];
    }
    
    // Method to create a specific component instance
    public AbstractData createInstance(int index)
    {
	switch (index) {
	    case 0:
		return new HeadingSlice();
	    case 1:
		return Extent.useInstantlyOnly;
	    case 2:
		return new Area();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "direction"
    public HeadingSlice getDirection()
    {
	return (HeadingSlice)mComponents[0];
    }
    
    public void setDirection(HeadingSlice direction)
    {
	mComponents[0] = direction;
    }
    
    
    // Methods for field "extent"
    public Extent getExtent()
    {
	return (Extent)mComponents[1];
    }
    
    public void setExtent(Extent extent)
    {
	mComponents[1] = extent;
    }
    
    public boolean hasExtent()
    {
	return componentIsPresent(1);
    }
    
    public void deleteExtent()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "area"
    public Area getArea()
    {
	return (Area)mComponents[2];
    }
    
    public void setArea(Area area)
    {
	mComponents[2] = area;
    }
    
    
    
    /**
     * Define the ASN1 Type Area from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Area extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Area()
	{
	}
	
	public static final  int  shapePointSet_chosen = 1;
	public static final  int  circle_chosen = 2;
	public static final  int  regionPointSet_chosen = 3;
	
	// Methods for field "shapePointSet"
	public static Area createAreaWithShapePointSet(ShapePointSet shapePointSet)
	{
	    Area __object = new Area();

	    __object.setShapePointSet(shapePointSet);
	    return __object;
	}
	
	public boolean hasShapePointSet()
	{
	    return getChosenFlag() == shapePointSet_chosen;
	}
	
	public ShapePointSet getShapePointSet()
	{
	    if (hasShapePointSet())
		return (ShapePointSet)mChosenValue;
	    else
		return null;
	}
	
	public void setShapePointSet(ShapePointSet shapePointSet)
	{
	    setChosenValue(shapePointSet);
	    setChosenFlag(shapePointSet_chosen);
	}
	
	
	// Methods for field "circle"
	public static Area createAreaWithCircle(Circle circle)
	{
	    Area __object = new Area();

	    __object.setCircle(circle);
	    return __object;
	}
	
	public boolean hasCircle()
	{
	    return getChosenFlag() == circle_chosen;
	}
	
	public Circle getCircle()
	{
	    if (hasCircle())
		return (Circle)mChosenValue;
	    else
		return null;
	}
	
	public void setCircle(Circle circle)
	{
	    setChosenValue(circle);
	    setChosenFlag(circle_chosen);
	}
	
	
	// Methods for field "regionPointSet"
	public static Area createAreaWithRegionPointSet(RegionPointSet regionPointSet)
	{
	    Area __object = new Area();

	    __object.setRegionPointSet(regionPointSet);
	    return __object;
	}
	
	public boolean hasRegionPointSet()
	{
	    return getChosenFlag() == regionPointSet_chosen;
	}
	
	public RegionPointSet getRegionPointSet()
	{
	    if (hasRegionPointSet())
		return (RegionPointSet)mChosenValue;
	    else
		return null;
	}
	
	public void setRegionPointSet(RegionPointSet regionPointSet)
	{
	    setChosenValue(regionPointSet);
	    setChosenFlag(regionPointSet_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case shapePointSet_chosen:
		    return new ShapePointSet();
		case circle_chosen:
		    return new Circle();
		case regionPointSet_chosen:
		    return new RegionPointSet();
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
		    (short)0x8002
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"ValidRegion$Area"
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
			    new SequenceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "ShapePointSet"
				),
				new QName (
				    "DSRC",
				    "ShapePointSet"
				),
				274454,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"ShapePointSet"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"ShapePointSet"
				    )
				),
				0
			    )
			),
			"shapePointSet",
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
				    "Circle"
				),
				new QName (
				    "DSRC",
				    "Circle"
				),
				274450,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"Circle"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"Circle"
				    )
				),
				0
			    )
			),
			"circle",
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
				    "RegionPointSet"
				),
				new QName (
				    "DSRC",
				    "RegionPointSet"
				),
				274454,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"RegionPointSet"
				    )
				),
				0,
				new TagDecodersRef (
				    new QName (
					"dsrc.dsrc",
					"RegionPointSet"
				    )
				),
				0
			    )
			),
			"regionPointSet",
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
	 * Get the type descriptor (TypeInfo) of 'this' Area object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Area object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Area

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
	    "ValidRegion"
	),
	new QName (
	    "DSRC",
	    "ValidRegion"
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
				"Extent"
			    ),
			    new QName (
				"DSRC",
				"Extent"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"useInstantlyOnly",
					0
				    ),
				    new MemberListElement (
					"useFor3meters",
					1
				    ),
				    new MemberListElement (
					"useFor10meters",
					2
				    ),
				    new MemberListElement (
					"useFor50meters",
					3
				    ),
				    new MemberListElement (
					"useFor100meters",
					4
				    ),
				    new MemberListElement (
					"useFor500meters",
					5
				    ),
				    new MemberListElement (
					"useFor1000meters",
					6
				    ),
				    new MemberListElement (
					"useFor5000meters",
					7
				    ),
				    new MemberListElement (
					"useFor10000meters",
					8
				    ),
				    new MemberListElement (
					"useFor50000meters",
					9
				    ),
				    new MemberListElement (
					"useFor100000meters",
					10
				    ),
				    new MemberListElement (
					"useFor500000meters",
					11
				    ),
				    new MemberListElement (
					"useFor1000000meters",
					12
				    ),
				    new MemberListElement (
					"useFor5000000meters",
					13
				    ),
				    new MemberListElement (
					"useFor10000000meters",
					14
				    ),
				    new MemberListElement (
					"forever",
					15
				    )
				}
			    ),
			    0,
			    Extent.useInstantlyOnly
			)
		    ),
		    "extent",
		    1,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "ValidRegion$Area"
			)
		    ),
		    "area",
		    2,
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2)
		    }
		)
	    }
	),
	0
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ValidRegion object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ValidRegion object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ValidRegion
