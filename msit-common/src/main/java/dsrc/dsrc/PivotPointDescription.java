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
 * Define the ASN1 Type PivotPointDescription from ASN1 Module DSRC.
 * @see Sequence
 */

public class PivotPointDescription extends Sequence {
    
    /**
     * The default constructor.
     */
    public PivotPointDescription()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public PivotPointDescription(Offset_B11 pivotOffset, Angle pivotAngle, 
		    PivotingAllowed pivots)
    {
	setPivotOffset(pivotOffset);
	setPivotAngle(pivotAngle);
	setPivots(pivots);
    }
    
    public void initComponents()
    {
	mComponents[0] = new Offset_B11();
	mComponents[1] = new Angle();
	mComponents[2] = new PivotingAllowed();
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
		return new Offset_B11();
	    case 1:
		return new Angle();
	    case 2:
		return new PivotingAllowed();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "pivotOffset"
    public Offset_B11 getPivotOffset()
    {
	return (Offset_B11)mComponents[0];
    }
    
    public void setPivotOffset(Offset_B11 pivotOffset)
    {
	mComponents[0] = pivotOffset;
    }
    
    
    // Methods for field "pivotAngle"
    public Angle getPivotAngle()
    {
	return (Angle)mComponents[1];
    }
    
    public void setPivotAngle(Angle pivotAngle)
    {
	mComponents[1] = pivotAngle;
    }
    
    
    // Methods for field "pivots"
    public PivotingAllowed getPivots()
    {
	return (PivotingAllowed)mComponents[2];
    }
    
    public void setPivots(PivotingAllowed pivots)
    {
	mComponents[2] = pivots;
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
	    "PivotPointDescription"
	),
	new QName (
	    "DSRC",
	    "PivotPointDescription"
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
				"Offset_B11"
			    ),
			    new QName (
				"DSRC",
				"Offset-B11"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Offset_B11(-1024), 
				    new Offset_B11(1023),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-1024),
				Long.valueOf(1023)
			    ),
			    null
			)
		    ),
		    "pivotOffset",
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
				"Angle"
			    ),
			    new QName (
				"DSRC",
				"Angle"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Angle(0), 
				    new Angle(28800),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(28800)
			    ),
			    null
			)
		    ),
		    "pivotAngle",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new TypeInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.dsrc",
				"PivotingAllowed"
			    ),
			    new QName (
				"DSRC",
				"PivotingAllowed"
			    ),
			    274450,
			    null
			)
		    ),
		    "pivots",
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
     * Get the type descriptor (TypeInfo) of 'this' PivotPointDescription object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' PivotPointDescription object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for PivotPointDescription
