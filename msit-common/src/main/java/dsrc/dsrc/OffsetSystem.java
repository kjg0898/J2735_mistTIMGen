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
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type OffsetSystem from ASN1 Module DSRC.
 * @see Sequence
 */

public class OffsetSystem extends Sequence {
    
    /**
     * The default constructor.
     */
    public OffsetSystem()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public OffsetSystem(Zoom scale, Offset offset)
    {
	setScale(scale);
	setOffset(offset);
    }
    
    /**
     * Construct with required components.
     */
    public OffsetSystem(Offset offset)
    {
	setOffset(offset);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Zoom();
	mComponents[1] = new Offset();
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
		return new Zoom();
	    case 1:
		return new Offset();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "scale"
    public Zoom getScale()
    {
	return (Zoom)mComponents[0];
    }
    
    public void setScale(Zoom scale)
    {
	mComponents[0] = scale;
    }
    
    public boolean hasScale()
    {
	return componentIsPresent(0);
    }
    
    public void deleteScale()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "offset"
    public Offset getOffset()
    {
	return (Offset)mComponents[1];
    }
    
    public void setOffset(Offset offset)
    {
	mComponents[1] = offset;
    }
    
    
    
    /**
     * Define the ASN1 Type Offset from ASN1 Module DSRC.
     * @see Choice
     */
    public static class Offset extends Choice {
	
	/**
	 * The default constructor.
	 */
	public Offset()
	{
	}
	
	public static final  int  xy_chosen = 1;
	public static final  int  ll_chosen = 2;
	
	// Methods for field "xy"
	public static Offset createOffsetWithXy(NodeListXY xy)
	{
	    Offset __object = new Offset();

	    __object.setXy(xy);
	    return __object;
	}
	
	public boolean hasXy()
	{
	    return getChosenFlag() == xy_chosen;
	}
	
	public NodeListXY getXy()
	{
	    if (hasXy())
		return (NodeListXY)mChosenValue;
	    else
		return null;
	}
	
	public void setXy(NodeListXY xy)
	{
	    setChosenValue(xy);
	    setChosenFlag(xy_chosen);
	}
	
	
	// Methods for field "ll"
	public static Offset createOffsetWithLl(NodeListLL ll)
	{
	    Offset __object = new Offset();

	    __object.setLl(ll);
	    return __object;
	}
	
	public boolean hasLl()
	{
	    return getChosenFlag() == ll_chosen;
	}
	
	public NodeListLL getLl()
	{
	    if (hasLl())
		return (NodeListLL)mChosenValue;
	    else
		return null;
	}
	
	public void setLl(NodeListLL ll)
	{
	    setChosenValue(ll);
	    setChosenFlag(ll_chosen);
	}
	
	
	// Method to create a specific choice instance
	public AbstractData createInstance(int chosen)
	{
	    switch (chosen) {
		case xy_chosen:
		    return new NodeListXY();
		case ll_chosen:
		    return new NodeListLL();
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
		    (short)0x8001
		}
	    ),
	    new QName (
		"dsrc.dsrc",
		"OffsetSystem$Offset"
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
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8000
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "NodeListXY"
				),
				new QName (
				    "DSRC",
				    "NodeListXY"
				),
				274454,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"NodeListXY"
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
			"xy",
			0,
			2
		    ),
		    new FieldInfo (
			new TypeInfoRef (
			    new ChoiceInfo (
				new Tags (
				    new short[] {
					(short)0x8001
				    }
				),
				new QName (
				    "dsrc.dsrc",
				    "NodeListLL"
				),
				new QName (
				    "DSRC",
				    "NodeListLL"
				),
				274454,
				null,
				new FieldsRef (
				    new QName (
					"dsrc.dsrc",
					"NodeListLL"
				    )
				),
				0,
				new TagDecoder (
				    new TagDecoderElement[] {
					new TagDecoderElement((short)0x8000, 0)
				    }
				)
			    )
			),
			"ll",
			1,
			2
		    )
		}
	    ),
	    0,
	    new TagDecoder (
		new TagDecoderElement[] {
		    new TagDecoderElement((short)0x8000, 0),
		    new TagDecoderElement((short)0x8001, 1)
		}
	    )
	);
	
	/**
	 * Get the type descriptor (TypeInfo) of 'this' Offset object.
	 */
	public TypeInfo getTypeInfo()
	{
	    return c_typeinfo;
	}
	
	/**
	 * Get the static type descriptor (TypeInfo) of 'this' Offset object.
	 */
	public static TypeInfo getStaticTypeInfo()
	{
	    return c_typeinfo;
	}
	
    } // End class definition for Offset

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
	    "OffsetSystem"
	),
	new QName (
	    "DSRC",
	    "OffsetSystem"
	),
	274450,
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
				"Zoom"
			    ),
			    new QName (
				"DSRC",
				"Zoom"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Zoom(0), 
				    new Zoom(15),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(15)
			    ),
			    null
			)
		    ),
		    "scale",
		    0,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new QName (
			    "dsrc.dsrc",
			    "OffsetSystem$Offset"
			)
		    ),
		    "offset",
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
			new TagDecoderElement((short)0x8000, 0),
			new TagDecoderElement((short)0x8001, 1)
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
     * Get the type descriptor (TypeInfo) of 'this' OffsetSystem object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' OffsetSystem object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for OffsetSystem
