package org.ipc.cfx.transport;

public interface ILinkProcessor {
  //
  // Zusammenfassung:
  //     Defines the property and methods of a link processor.
      //
      // Zusammenfassung:
      //     Processes a received attach performative to open a link endpoint. The implementation
      //     must call attachContext.Complete to either accept or reject the attach performative.
      //
      // Parameter:
      //   attachContext:
      //     Context of the received attach performative.
      void process( Object attachContext);
}
