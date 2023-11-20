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


package dsrc.itis;

import com.oss.asn1.*;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type ITIScodesAndText from ASN1 Module ITIS.
 * @see SequenceOf
 */

public class ITIScodesAndText extends SequenceOf<ITIScodesAndText.Sequence_> {
    
    /**
     * The default constructor.
     */
    public ITIScodesAndText()
    {
    }
    
    /**
     * Construct from an array of components.
     */
    public ITIScodesAndText(Sequence_[] elements)
    {
	super(elements);
    }
    
    
    /**
     * Define the ASN1 Type Sequence_ from ASN1 Module ITIS.
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
	public Sequence_(Item item)
	{
	    setItem(item);
	}
	
	public void initComponents()
	{
	    mComponents[0] = new Item();
	}
	
	// Instance initializer
	{
	    mComponents = new AbstractData[1];
	}
	
	// Method to create a specific component instance
	public AbstractData createInstance(int index)
	{
	    switch (index) {
		case 0:
		    return new Item();
		default:
		    throw new InternalError("AbstractCollection.createInstance()");
	    }
	    
	}
	
	
	// Methods for field "item"
	public Item getItem()
	{
	    return (Item)mComponents[0];
	}
	
	public void setItem(Item item)
	{
	    mComponents[0] = item;
	}
	
	
	
	/**
	 * Define the ASN1 Type Item from ASN1 Module ITIS.
	 * @see Choice
	 */
	public static class Item extends Choice {
	    
	    /**
	     * The default constructor.
	     */
	    public Item()
	    {
	    }
	    
	    public static final  int  itis_chosen = 1;
	    public static final  int  text_chosen = 2;
	    
	    // Methods for field "itis"
	    public static Item createItemWithItis(long itis)
	    {
		return createItemWithItis(new ITIScodes(itis));
	    }
	    
	    public static Item createItemWithItis(ITIScodes itis)
	    {
		Item __object = new Item();

		__object.setItis(itis);
		return __object;
	    }
	    
	    public boolean hasItis()
	    {
		return getChosenFlag() == itis_chosen;
	    }
	    
	    public ITIScodes getItis()
	    {
		if (hasItis())
		    return (ITIScodes)mChosenValue;
		else
		    return null;
	    }
	    
	    public void setItis(long itis)
	    {
		setItis(new ITIScodes(itis));
	    }
	    
	    public void setItis(ITIScodes itis)
	    {
		setChosenValue(itis);
		setChosenFlag(itis_chosen);
	    }
	    
	    
	    // Methods for field "text"
	    public static Item createItemWithText(ITIStext text)
	    {
		Item __object = new Item();

		__object.setText(text);
		return __object;
	    }
	    
	    public boolean hasText()
	    {
		return getChosenFlag() == text_chosen;
	    }
	    
	    public ITIStext getText()
	    {
		if (hasText())
		    return (ITIStext)mChosenValue;
		else
		    return null;
	    }
	    
	    public void setText(ITIStext text)
	    {
		setChosenValue(text);
		setChosenFlag(text_chosen);
	    }
	    
	    
	    // Method to create a specific choice instance
	    public AbstractData createInstance(int chosen)
	    {
		switch (chosen) {
		    case itis_chosen:
			return new ITIScodes();
		    case text_chosen:
			return new ITIStext();
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
			(short)0x8000
		    }
		),
		new QName (
		    "dsrc.itis",
		    "ITIScodesAndText$Sequence_$Item"
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
				new IntegerInfo (
				    new Tags (
					new short[] {
					    (short)0x8000
					}
				    ),
				    new QName (
					"dsrc.itis",
					"ITIScodes"
				    ),
				    new QName (
					"ITIS",
					"ITIScodes"
				    ),
				    274450,
				    new ValueRangeConstraint (
					new AbstractBounds(
					    new ITIScodes(0), 
					    new ITIScodes(65535),
					    0
					)
				    ),
				    new Bounds (
					Long.valueOf(0),
					Long.valueOf(65535)
				    ),
				    null
				)
			    ),
			    "itis",
			    0,
			    2
			),
			new FieldInfo (
			    new TypeInfoRef (
				new KMCStringInfo (
				    new Tags (
					new short[] {
					    (short)0x8001
					}
				    ),
				    new QName (
					"dsrc.itis",
					"ITIStext"
				    ),
				    new QName (
					"ITIS",
					"ITIStext"
				    ),
				    274450,
				    new Intersection (
					new SizeConstraint (
					    new ValueRangeConstraint (
						new AbstractBounds(
						    new INTEGER(1),
						    new INTEGER(500),
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
					Long.valueOf(500)
				    ),
				    IA5StringPAInfo.paInfo
				)
			    ),
			    "text",
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
	     * Get the type descriptor (TypeInfo) of 'this' Item object.
	     */
	    public TypeInfo getTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	    /**
	     * Get the static type descriptor (TypeInfo) of 'this' Item object.
	     */
	    public static TypeInfo getStaticTypeInfo()
	    {
		return c_typeinfo;
	    }
	    
	} // End class definition for Item

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
		"dsrc.itis",
		"ITIScodesAndText$Sequence_"
	    ),
	    new QName (
		"builtin",
		"SEQUENCE"
	    ),
	    274450,
	    null,
	    new FieldsDict (
		new SequenceFieldInfo[] {
		    new SequenceFieldInfo (
			new TypeInfoRef (
			    new QName (
				"dsrc.itis",
				"ITIScodesAndText$Sequence_$Item"
			    )
			),
			"item",
			0,
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
		0x0010
	    }
	),
	new QName (
	    "dsrc.itis",
	    "ITIScodesAndText"
	),
	new QName (
	    "ITIS",
	    "ITIScodesAndText"
	),
	274450,
	new SizeConstraint (
	    new ValueRangeConstraint (
		new AbstractBounds(
		    new INTEGER(1),
		    new INTEGER(100),
		    0
		)
	    )
	),
	new Bounds (
	    Long.valueOf(1),
	    Long.valueOf(100)
	),
	new TypeInfoRef (
	    new QName (
		"dsrc.itis",
		"ITIScodesAndText$Sequence_"
	    )
	)
    );
    
    /**
     * Get the type descriptor (TypeInfo) of 'this' ITIScodesAndText object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' ITIScodesAndText object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for ITIScodesAndText
