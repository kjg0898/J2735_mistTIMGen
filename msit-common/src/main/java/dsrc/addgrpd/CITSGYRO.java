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


package dsrc.addgrpd;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.metadata.*;

/**
 * Define the ASN1 Type CITSGYRO from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSGYRO extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSGYRO()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSGYRO(INTEGER xmax, INTEGER xmin, INTEGER xavg, INTEGER ymax, 
		    INTEGER ymin, INTEGER yavg, INTEGER zmax, INTEGER zmin, 
		    INTEGER zavg)
    {
	setXmax(xmax);
	setXmin(xmin);
	setXavg(xavg);
	setYmax(ymax);
	setYmin(ymin);
	setYavg(yavg);
	setZmax(zmax);
	setZmin(zmin);
	setZavg(zavg);
    }
    
    /**
     * Construct with components.
     */
    public CITSGYRO(long xmax, long xmin, long xavg, long ymax, long ymin, 
		    long yavg, long zmax, long zmin, long zavg)
    {
	this(new INTEGER(xmax), new INTEGER(xmin), new INTEGER(xavg), 
	     new INTEGER(ymax), new INTEGER(ymin), new INTEGER(yavg), 
	     new INTEGER(zmax), new INTEGER(zmin), new INTEGER(zavg));
    }
    
    public void initComponents()
    {
	mComponents[0] = new INTEGER();
	mComponents[1] = new INTEGER();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
	mComponents[5] = new INTEGER();
	mComponents[6] = new INTEGER();
	mComponents[7] = new INTEGER();
	mComponents[8] = new INTEGER();
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
		return new INTEGER();
	    case 1:
		return new INTEGER();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    case 5:
		return new INTEGER();
	    case 6:
		return new INTEGER();
	    case 7:
		return new INTEGER();
	    case 8:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "xmax"
    public long getXmax()
    {
	return ((INTEGER)mComponents[0]).longValue();
    }
    
    public void setXmax(long xmax)
    {
	setXmax(new INTEGER(xmax));
    }
    
    public void setXmax(INTEGER xmax)
    {
	mComponents[0] = xmax;
    }
    
    public boolean hasXmax()
    {
	return componentIsPresent(0);
    }
    
    public void deleteXmax()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "xmin"
    public long getXmin()
    {
	return ((INTEGER)mComponents[1]).longValue();
    }
    
    public void setXmin(long xmin)
    {
	setXmin(new INTEGER(xmin));
    }
    
    public void setXmin(INTEGER xmin)
    {
	mComponents[1] = xmin;
    }
    
    public boolean hasXmin()
    {
	return componentIsPresent(1);
    }
    
    public void deleteXmin()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "xavg"
    public long getXavg()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setXavg(long xavg)
    {
	setXavg(new INTEGER(xavg));
    }
    
    public void setXavg(INTEGER xavg)
    {
	mComponents[2] = xavg;
    }
    
    public boolean hasXavg()
    {
	return componentIsPresent(2);
    }
    
    public void deleteXavg()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "ymax"
    public long getYmax()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setYmax(long ymax)
    {
	setYmax(new INTEGER(ymax));
    }
    
    public void setYmax(INTEGER ymax)
    {
	mComponents[3] = ymax;
    }
    
    public boolean hasYmax()
    {
	return componentIsPresent(3);
    }
    
    public void deleteYmax()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "ymin"
    public long getYmin()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setYmin(long ymin)
    {
	setYmin(new INTEGER(ymin));
    }
    
    public void setYmin(INTEGER ymin)
    {
	mComponents[4] = ymin;
    }
    
    public boolean hasYmin()
    {
	return componentIsPresent(4);
    }
    
    public void deleteYmin()
    {
	setComponentAbsent(4);
    }
    
    
    // Methods for field "yavg"
    public long getYavg()
    {
	return ((INTEGER)mComponents[5]).longValue();
    }
    
    public void setYavg(long yavg)
    {
	setYavg(new INTEGER(yavg));
    }
    
    public void setYavg(INTEGER yavg)
    {
	mComponents[5] = yavg;
    }
    
    public boolean hasYavg()
    {
	return componentIsPresent(5);
    }
    
    public void deleteYavg()
    {
	setComponentAbsent(5);
    }
    
    
    // Methods for field "zmax"
    public long getZmax()
    {
	return ((INTEGER)mComponents[6]).longValue();
    }
    
    public void setZmax(long zmax)
    {
	setZmax(new INTEGER(zmax));
    }
    
    public void setZmax(INTEGER zmax)
    {
	mComponents[6] = zmax;
    }
    
    public boolean hasZmax()
    {
	return componentIsPresent(6);
    }
    
    public void deleteZmax()
    {
	setComponentAbsent(6);
    }
    
    
    // Methods for field "zmin"
    public long getZmin()
    {
	return ((INTEGER)mComponents[7]).longValue();
    }
    
    public void setZmin(long zmin)
    {
	setZmin(new INTEGER(zmin));
    }
    
    public void setZmin(INTEGER zmin)
    {
	mComponents[7] = zmin;
    }
    
    public boolean hasZmin()
    {
	return componentIsPresent(7);
    }
    
    public void deleteZmin()
    {
	setComponentAbsent(7);
    }
    
    
    // Methods for field "zavg"
    public long getZavg()
    {
	return ((INTEGER)mComponents[8]).longValue();
    }
    
    public void setZavg(long zavg)
    {
	setZavg(new INTEGER(zavg));
    }
    
    public void setZavg(INTEGER zavg)
    {
	mComponents[8] = zavg;
    }
    
    public boolean hasZavg()
    {
	return componentIsPresent(8);
    }
    
    public void deleteZavg()
    {
	setComponentAbsent(8);
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
	    "dsrc.addgrpd",
	    "CITSGYRO"
	),
	new QName (
	    "AddGrpD",
	    "CITSGYRO"
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "xmax",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "xmin",
		    1,
		    3,
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "xavg",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "ymax",
		    3,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8004
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "ymin",
		    4,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8005
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "yavg",
		    5,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8006
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "zmax",
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
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "zmin",
		    7,
		    3,
		    null
		),
		new SequenceFieldInfo (
		    new TypeInfoRef (
			new IntegerInfo (
			    new Tags (
				new short[] {
				    (short)0x8008
				}
			    ),
			    new QName (
				"com.oss.asn1",
				"INTEGER"
			    ),
			    new QName (
				"builtin",
				"INTEGER"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new INTEGER(-32767),
				    new INTEGER(32767),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(-32767),
				Long.valueOf(32767)
			    ),
			    null
			)
		    ),
		    "zavg",
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
     * Get the type descriptor (TypeInfo) of 'this' CITSGYRO object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSGYRO object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSGYRO
