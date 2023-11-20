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


package dsrc.addgrpb;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type Position3D_addGrpB from ASN1 Module AddGrpB.
 * @see Sequence
 */

public class Position3D_addGrpB extends Sequence {
    
    /**
     * The default constructor.
     */
    public Position3D_addGrpB()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public Position3D_addGrpB(LatitudeDMS2 latitude, LongitudeDMS2 longitude, 
		    Elevation elevation)
    {
	setLatitude(latitude);
	setLongitude(longitude);
	setElevation(elevation);
    }
    
    public void initComponents()
    {
	mComponents[0] = new LatitudeDMS2();
	mComponents[1] = new LongitudeDMS2();
	mComponents[2] = new Elevation();
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
		return new LatitudeDMS2();
	    case 1:
		return new LongitudeDMS2();
	    case 2:
		return new Elevation();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "latitude"
    public LatitudeDMS2 getLatitude()
    {
	return (LatitudeDMS2)mComponents[0];
    }
    
    public void setLatitude(LatitudeDMS2 latitude)
    {
	mComponents[0] = latitude;
    }
    
    
    // Methods for field "longitude"
    public LongitudeDMS2 getLongitude()
    {
	return (LongitudeDMS2)mComponents[1];
    }
    
    public void setLongitude(LongitudeDMS2 longitude)
    {
	mComponents[1] = longitude;
    }
    
    
    // Methods for field "elevation"
    public Elevation getElevation()
    {
	return (Elevation)mComponents[2];
    }
    
    public void setElevation(Elevation elevation)
    {
	mComponents[2] = elevation;
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
	    "dsrc.addgrpb",
	    "Position3D_addGrpB"
	),
	new QName (
	    "AddGrpB",
	    "Position3D-addGrpB"
	),
	274454,
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
				"dsrc.addgrpb",
				"LatitudeDMS2"
			    ),
			    new QName (
				"AddGrpB",
				"LatitudeDMS2"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpb",
				    "LatitudeDMS2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpb",
				    "LatitudeDMS2"
				)
			    ),
			    0
			)
		    ),
		    "latitude",
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
				"dsrc.addgrpb",
				"LongitudeDMS2"
			    ),
			    new QName (
				"AddGrpB",
				"LongitudeDMS2"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.addgrpb",
				    "LongitudeDMS2"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.addgrpb",
				    "LongitudeDMS2"
				)
			    ),
			    0
			)
		    ),
		    "longitude",
		    1,
		    2,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8002
				}
			    ),
			    new QName (
				"dsrc.addgrpb",
				"Elevation"
			    ),
			    new QName (
				"AddGrpB",
				"Elevation"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new Elevation(-32768), 
				    new Elevation(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32768),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "elevation",
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
     * Get the type descriptor (TypeInfo) of 'this' Position3D_addGrpB object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' Position3D_addGrpB object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for Position3D_addGrpB
