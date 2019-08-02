package com.berengerdallecort.cropitnowserver;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CropController {

    @RequestMapping("/crop")
    public String getCropDataAsString
    						(	
    							@RequestParam(value="name", defaultValue="none") String name,

    							@RequestParam(value="corner1_u", defaultValue="0.0") float corner1_u,
    							@RequestParam(value="corner1_v", defaultValue="0.0") float corner1_v,

    							@RequestParam(value="corner2_u", defaultValue="1.0") float corner2_u,
    							@RequestParam(value="corner2_v", defaultValue="1.0") float corner2_v
    						)
	{
    	CropData data = new CropData(name, corner1_u, corner1_v, corner2_u, corner2_v);
        return data.toString();
    }
}