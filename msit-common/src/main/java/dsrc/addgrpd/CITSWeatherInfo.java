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
 * Define the ASN1 Type CITSWeatherInfo from ASN1 Module AddGrpD.
 * @see Sequence
 */

public class CITSWeatherInfo extends Sequence {
    
    /**
     * The default constructor.
     */
    public CITSWeatherInfo()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public CITSWeatherInfo(dsrc.dsrc.AmbientAirTemperature temp, 
		    dsrc.ntcip.EssPrecipRate rainfall, INTEGER humidity, 
		    INTEGER windDir, INTEGER windSpd)
    {
	setTemp(temp);
	setRainfall(rainfall);
	setHumidity(humidity);
	setWindDir(windDir);
	setWindSpd(windSpd);
    }
    
    /**
     * Construct with components.
     */
    public CITSWeatherInfo(dsrc.dsrc.AmbientAirTemperature temp, 
		    dsrc.ntcip.EssPrecipRate rainfall, long humidity, 
		    long windDir, long windSpd)
    {
	this(temp, rainfall, new INTEGER(humidity), new INTEGER(windDir), 
	     new INTEGER(windSpd));
    }
    
    public void initComponents()
    {
	mComponents[0] = new dsrc.dsrc.AmbientAirTemperature();
	mComponents[1] = new dsrc.ntcip.EssPrecipRate();
	mComponents[2] = new INTEGER();
	mComponents[3] = new INTEGER();
	mComponents[4] = new INTEGER();
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
		return new dsrc.dsrc.AmbientAirTemperature();
	    case 1:
		return new dsrc.ntcip.EssPrecipRate();
	    case 2:
		return new INTEGER();
	    case 3:
		return new INTEGER();
	    case 4:
		return new INTEGER();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "temp"
    public dsrc.dsrc.AmbientAirTemperature getTemp()
    {
	return (dsrc.dsrc.AmbientAirTemperature)mComponents[0];
    }
    
    public void setTemp(dsrc.dsrc.AmbientAirTemperature temp)
    {
	mComponents[0] = temp;
    }
    
    public boolean hasTemp()
    {
	return componentIsPresent(0);
    }
    
    public void deleteTemp()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "rainfall"
    public dsrc.ntcip.EssPrecipRate getRainfall()
    {
	return (dsrc.ntcip.EssPrecipRate)mComponents[1];
    }
    
    public void setRainfall(dsrc.ntcip.EssPrecipRate rainfall)
    {
	mComponents[1] = rainfall;
    }
    
    public boolean hasRainfall()
    {
	return componentIsPresent(1);
    }
    
    public void deleteRainfall()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "humidity"
    public long getHumidity()
    {
	return ((INTEGER)mComponents[2]).longValue();
    }
    
    public void setHumidity(long humidity)
    {
	setHumidity(new INTEGER(humidity));
    }
    
    public void setHumidity(INTEGER humidity)
    {
	mComponents[2] = humidity;
    }
    
    public boolean hasHumidity()
    {
	return componentIsPresent(2);
    }
    
    public void deleteHumidity()
    {
	setComponentAbsent(2);
    }
    
    
    // Methods for field "windDir"
    public long getWindDir()
    {
	return ((INTEGER)mComponents[3]).longValue();
    }
    
    public void setWindDir(long windDir)
    {
	setWindDir(new INTEGER(windDir));
    }
    
    public void setWindDir(INTEGER windDir)
    {
	mComponents[3] = windDir;
    }
    
    public boolean hasWindDir()
    {
	return componentIsPresent(3);
    }
    
    public void deleteWindDir()
    {
	setComponentAbsent(3);
    }
    
    
    // Methods for field "windSpd"
    public long getWindSpd()
    {
	return ((INTEGER)mComponents[4]).longValue();
    }
    
    public void setWindSpd(long windSpd)
    {
	setWindSpd(new INTEGER(windSpd));
    }
    
    public void setWindSpd(INTEGER windSpd)
    {
	mComponents[4] = windSpd;
    }
    
    public boolean hasWindSpd()
    {
	return componentIsPresent(4);
    }
    
    public void deleteWindSpd()
    {
	setComponentAbsent(4);
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
	    "CITSWeatherInfo"
	),
	new QName (
	    "AddGrpD",
	    "CITSWeatherInfo"
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
				"AmbientAirTemperature"
			    ),
			    new QName (
				"DSRC",
				"AmbientAirTemperature"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.dsrc.AmbientAirTemperature(0), 
				    new dsrc.dsrc.AmbientAirTemperature(191),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(191)
			    ),
			    null
			)
		    ),
		    "temp",
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
				"dsrc.ntcip",
				"EssPrecipRate"
			    ),
			    new QName (
				"NTCIP",
				"EssPrecipRate"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new dsrc.ntcip.EssPrecipRate(0), 
				    new dsrc.ntcip.EssPrecipRate(65535),
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
		    "rainfall",
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
				    new INTEGER(0),
				    new INTEGER(100),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(100)
			    ),
			    null
			)
		    ),
		    "humidity",
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
				    new INTEGER(10),
				    new INTEGER(80),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(10),
				Long.valueOf(80)
			    ),
			    null
			)
		    ),
		    "windDir",
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
				    new INTEGER(0),
				    new INTEGER(10000),
				    0
				)
			    ),
			    new Bounds (
				Long.valueOf(0),
				Long.valueOf(10000)
			    ),
			    null
			)
		    ),
		    "windSpd",
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
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8001, 1),
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
		    }
		),
		new TagDecoder (
		    new TagDecoderElement[] {
			new TagDecoderElement((short)0x8002, 2),
			new TagDecoderElement((short)0x8003, 3),
			new TagDecoderElement((short)0x8004, 4)
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
     * Get the type descriptor (TypeInfo) of 'this' CITSWeatherInfo object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' CITSWeatherInfo object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for CITSWeatherInfo
