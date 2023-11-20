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
 * Define the ASN1 Type WeatherProbe from ASN1 Module DSRC.
 * @see Sequence
 */

public class WeatherProbe extends Sequence {
    
    /**
     * The default constructor.
     */
    public WeatherProbe()
    {
    }
    
    /**
     * Construct with AbstractData components.
     */
    public WeatherProbe(AmbientAirTemperature airTemp, 
		    AmbientAirPressure airPressure, WiperSet rainRates)
    {
	setAirTemp(airTemp);
	setAirPressure(airPressure);
	setRainRates(rainRates);
    }
    
    public void initComponents()
    {
	mComponents[0] = new AmbientAirTemperature();
	mComponents[1] = new AmbientAirPressure();
	mComponents[2] = new WiperSet();
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
		return new AmbientAirTemperature();
	    case 1:
		return new AmbientAirPressure();
	    case 2:
		return new WiperSet();
	    default:
		throw new InternalError("AbstractCollection.createInstance()");
	}
	
    }
    
    
    // Methods for field "airTemp"
    public AmbientAirTemperature getAirTemp()
    {
	return (AmbientAirTemperature)mComponents[0];
    }
    
    public void setAirTemp(AmbientAirTemperature airTemp)
    {
	mComponents[0] = airTemp;
    }
    
    public boolean hasAirTemp()
    {
	return componentIsPresent(0);
    }
    
    public void deleteAirTemp()
    {
	setComponentAbsent(0);
    }
    
    
    // Methods for field "airPressure"
    public AmbientAirPressure getAirPressure()
    {
	return (AmbientAirPressure)mComponents[1];
    }
    
    public void setAirPressure(AmbientAirPressure airPressure)
    {
	mComponents[1] = airPressure;
    }
    
    public boolean hasAirPressure()
    {
	return componentIsPresent(1);
    }
    
    public void deleteAirPressure()
    {
	setComponentAbsent(1);
    }
    
    
    // Methods for field "rainRates"
    public WiperSet getRainRates()
    {
	return (WiperSet)mComponents[2];
    }
    
    public void setRainRates(WiperSet rainRates)
    {
	mComponents[2] = rainRates;
    }
    
    public boolean hasRainRates()
    {
	return componentIsPresent(2);
    }
    
    public void deleteRainRates()
    {
	setComponentAbsent(2);
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
	    "WeatherProbe"
	),
	new QName (
	    "DSRC",
	    "WeatherProbe"
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
				"AmbientAirTemperature"
			    ),
			    new QName (
				"DSRC",
				"AmbientAirTemperature"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AmbientAirTemperature(0), 
				    new AmbientAirTemperature(191),
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
		    "airTemp",
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
				"dsrc.dsrc",
				"AmbientAirPressure"
			    ),
			    new QName (
				"DSRC",
				"AmbientAirPressure"
			    ),
			    274450,
			    new ValueRangeConstraint (
				new AbstractBounds(
				    new AmbientAirPressure(0), 
				    new AmbientAirPressure(255),
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
		    "airPressure",
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
				"WiperSet"
			    ),
			    new QName (
				"DSRC",
				"WiperSet"
			    ),
			    274450,
			    null,
			    new FieldsRef (
				new QName (
				    "dsrc.dsrc",
				    "WiperSet"
				)
			    ),
			    0,
			    new TagDecodersRef (
				new QName (
				    "dsrc.dsrc",
				    "WiperSet"
				)
			    ),
			    0
			)
		    ),
		    "rainRates",
		    2,
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
			new TagDecoderElement((short)0x8002, 2)
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
     * Get the type descriptor (TypeInfo) of 'this' WeatherProbe object.
     */
    public TypeInfo getTypeInfo()
    {
	return c_typeinfo;
    }
    
    /**
     * Get the static type descriptor (TypeInfo) of 'this' WeatherProbe object.
     */
    public static TypeInfo getStaticTypeInfo()
    {
	return c_typeinfo;
    }
    
} // End class definition for WeatherProbe
