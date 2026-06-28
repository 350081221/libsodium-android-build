.class public Lcom/umeng/commonsdk/framework/UMModuleRegister;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ANALYTICS:Ljava/lang/String; = "analytics"

.field public static final APPSTATUS:Ljava/lang/String; = "appstatus"

.field private static final APPSTATUS_SWITCH_HIGH:I = 0x9110

.field private static final APPSTATUS_SWITCH_LOW:I = 0x9101

.field public static final INNER:Ljava/lang/String; = "internal"

.field private static final INNER_EVENT_VALUE_HIGH:I = 0x9000

.field private static final INNER_EVENT_VALUE_LOW:I = 0x8001

.field public static final PROCESS:Ljava/lang/String; = "process"

.field private static final PROCESS_EVENT_VALUE_HIGH:I = 0x9100

.field private static final PROCESS_EVENT_VALUE_LOW:I = 0x9051

.field public static final PUSH:Ljava/lang/String; = "push"

.field private static final PUSH_EVENT_VALUE_HIGH:I = 0x5000

.field private static final PUSH_EVENT_VALUE_LOW:I = 0x4001

.field public static final SHARE:Ljava/lang/String; = "share"

.field private static final SHARE_EVENT_VALUE_HIGH:I = 0x7000

.field private static final SHARE_EVENT_VALUE_LOW:I = 0x6001

.field private static mModuleAppContext:Landroid/content/Context;

.field private static mModuleMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/umeng/commonsdk/framework/UMLogDataProtocol;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static eventType2ModuleName(I)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x4001

    if-lt p0, v0, :cond_0

    const/16 v0, 0x5000

    if-gt p0, v0, :cond_0

    const-string v0, "push"

    goto :goto_0

    :cond_0
    const-string v0, "analytics"

    :goto_0
    const/16 v1, 0x6001

    if-lt p0, v1, :cond_1

    const/16 v1, 0x7000

    if-gt p0, v1, :cond_1

    const-string v0, "share"

    :cond_1
    const v1, 0x8001

    if-lt p0, v1, :cond_2

    const v1, 0x9000

    if-gt p0, v1, :cond_2

    const-string v0, "internal"

    :cond_2
    const v1, 0x9051

    if-lt p0, v1, :cond_3

    const v1, 0x9100

    if-gt p0, v1, :cond_3

    const-string v0, "process"

    :cond_3
    const v1, 0x9101

    if-lt p0, v1, :cond_4

    const v1, 0x9110

    if-gt p0, v1, :cond_4

    const-string v0, "appstatus"

    :cond_4
    return-object v0
.end method

.method public static getAppContext()Landroid/content/Context;
    .locals 1

    sget-object v0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleAppContext:Landroid/content/Context;

    return-object v0
.end method

.method public static getCallbackFromModuleName(Ljava/lang/String;)Lcom/umeng/commonsdk/framework/UMLogDataProtocol;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleMap:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleMap:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/umeng/commonsdk/framework/UMLogDataProtocol;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static registerAppContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleAppContext:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sput-object p0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleAppContext:Landroid/content/Context;

    .line 10
    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static registerCallback(ILcom/umeng/commonsdk/framework/UMLogDataProtocol;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleMap:Ljava/util/HashMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleMap:Ljava/util/HashMap;

    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Lcom/umeng/commonsdk/framework/UMModuleRegister;->eventType2ModuleName(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleMap:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    sget-object v0, Lcom/umeng/commonsdk/framework/UMModuleRegister;->mModuleMap:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1
    const/4 p0, 0x1

    .line 30
    return p0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
