.class Lcom/lody/virtual/client/hook/providers/SettingsProviderHook$4;
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
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p1, Lu/dont/know/what/i/am/g$a;->e:[Ljava/lang/Object;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Lu/dont/know/what/i/am/g$a;->h(Ljava/lang/Object;)V

    return-void
.end method
