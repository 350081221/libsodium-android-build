.class Lcom/lody/virtual/client/hook/providers/SettingsProviderHook$6;
.super Lu/dont/know/what/i/am/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/lody/virtual/client/hook/providers/SettingsProviderHook;->passSettingsProviderPermissionCheck(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lu/dont/know/what/i/am/g;-><init>()V

    return-void
.end method


# virtual methods
.method protected beforeHookedMethod(Lu/dont/know/what/i/am/g$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lu/dont/know/what/i/am/g$a;->h(Ljava/lang/Object;)V

    return-void
.end method
