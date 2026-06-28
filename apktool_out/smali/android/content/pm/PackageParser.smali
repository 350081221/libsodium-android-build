.class public Landroid/content/pm/PackageParser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/content/pm/PackageParser$ProviderIntentInfo;,
        Landroid/content/pm/PackageParser$ServiceIntentInfo;,
        Landroid/content/pm/PackageParser$ActivityIntentInfo;,
        Landroid/content/pm/PackageParser$PermissionGroup;,
        Landroid/content/pm/PackageParser$Permission;,
        Landroid/content/pm/PackageParser$Instrumentation;,
        Landroid/content/pm/PackageParser$Provider;,
        Landroid/content/pm/PackageParser$Service;,
        Landroid/content/pm/PackageParser$Package;,
        Landroid/content/pm/PackageParser$ApkLite;,
        Landroid/content/pm/PackageParser$Activity;,
        Landroid/content/pm/PackageParser$Component;,
        Landroid/content/pm/PackageParser$IntentInfo;,
        Landroid/content/pm/PackageParser$Builder;,
        Landroid/content/pm/PackageParser$SigningDetails;,
        Landroid/content/pm/PackageParser$CallbackImpl;,
        Landroid/content/pm/PackageParser$Callback;,
        Landroid/content/pm/PackageParser$PackageParserException;
    }
.end annotation


# static fields
.field public static final PARSE_COLLECT_CERTIFICATES:I = 0x20

.field public static final PARSE_ENFORCE_CODE:I = 0x40

.field public static final PARSE_IS_SYSTEM:I = 0x1

.field public static final PARSE_IS_SYSTEM_DIR:I = 0x10


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static parseApkLite(Ljava/io/File;I)Landroid/content/pm/PackageParser$ApkLite;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageParser$PackageParserException;
        }
    .end annotation

    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "Stub!"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public setCallback(Landroid/content/pm/PackageParser$Callback;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Stub!"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
