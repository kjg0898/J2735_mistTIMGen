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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Circle from ASN1 Module DSRC.
 * @see Sequence
 */

public class Circle extends Sequence {
    
    /**
     * The default constructor.
     */
    public Circle()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Circle(Position3D center, Radius_B12 radius, DistanceUnits units)
    {
	setCenter(center);
	setRadius(radius);
	setUnits(units);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Position3D();
	mComponents[1] = new Radius_B12();
	mComponents[2] = DistanceUnits.centimeter;
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
		return new Position3D();
	    case 1:
		return new Radius_B12();
	    case 2:
		return DistanceUnits.centimeter;
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "center"
    public Position3D getCenter()
    {
	return (Position3D)mComponents[0];
    }
    
    public void setCenter(Position3D center)
    {
	mComponents[0] = center;
    }
    
    
    // Methods for field "radius"
    public Radius_B12 getRadius()
    {
	return (Radius_B12)mComponents[1];
    }
    
    public void setRadius(Radius_B12 radius)
    {
	mComponents[1] = radius;
    }
    
    
    // Methods for field "units"
    public DistanceUnits getUnits()
    {
	return (DistanceUnits)mComponents[2];
    }
    
    public void setUnits(DistanceUnits units)
    {
	mComponents[2] = units;
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
	    "Circle"
	),
	new QName (
	    "DSRC",
	    "Circle"
	),
	274450,
	null,
	new FieldsDict (
	    new SequenceFieldInfo[] {
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new SequenceInfo (
			    new Tags (
				new short[] {
				    (short)0x8000
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
		    "center",
		    0,
		    2,
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
				"Radius_B12"
			    ),
			    new QName (
				"DSRC",
				"Radius-B12"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Radius_B12(0), 
				    new Radius_B12(4095),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(4095)
			    ),
			    null
			)
		    ),
		    "radius",
		    1,
		    2,
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
				"DistanceUnits"
			    ),
			    new QName (
				"DSRC",
				"DistanceUnits"
			    ),
			    274450,
			    null,
			    new MemberList (
				new MemberListElement[] {
				    new MemberListElement (
					"centimeter",
					0
				    ),
				    new MemberListElement (
					"cm2-5",
					1
				    ),
				    new MemberListElement (
					"decimeter",
					2
				    ),
				    new MemberListElement (
					"meter",
					3
				    ),
				    new MemberListElement (
					"kilometer",
					4
				    ),
				    new MemberListElement (
					"foot",
					5
				    ),
				    new MemberListElement (
					"yard",
					6
				    ),
				    new MemberListElement (
					"mile",
					7
				    )
				}
			    ),
			    0,
			    DistanceUnits.centimeter
			)
		    ),
		    "units",
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
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' Circle object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Circle object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Circle
