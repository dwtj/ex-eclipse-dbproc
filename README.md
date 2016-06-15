# Debugging an Annotation Processor in Eclipse and with Eclipse

This project presents a minimum working example of using Eclipse to debug an
annotation processor running within Eclipse.

To do so, this repository presents two Eclipse projects:

- `driver`, which contains classes which our annotation processor will process
while we are debugging;
- `proc`, which contains the annotation processor which we want to debug as
well as the Eclipse-plugin infrastructure which we need to do so.

To run the demonstration, one needs to have the Eclipse SDK installed (since we
need the Plug-in Development Environment which it provides). The directions
below involve *two* instances of the Eclipse SDK application: the first is the
"debugging" instance and the second is the "debugged" instance. (This workflow
should be familiar to anyone with a background in Eclipse plugin development,
but shouldn't be too difficult for those familiar with more ordinary
experiences with debugging within Eclipse.)


## Debug it!

1. Start the *debugging instance* of Eclipse by just opening the Eclipse SDK
Application.
2. Import `proc` into its workspace via "File" > "Import".
3. Create a new "Run Configuration" of the type "Eclipse Application". Give it
a name, say `dbproc`; the other default settings should be fine.
4. Add a breakpoint somewhere in the annotation processor code.
5. Begin another Eclipse application instance, the *debugged instance*, using
"Run > Debug" with this new run configuration.
6. In the debugged instance, import `driver` into its workspace via "File" >
"Import".
7. Enable annotation processing in the debugged instance. This should cause
a re-compilation of the `driver` project, and that should in-turn cause the
breakpoint in the debugging instance to be hit.
